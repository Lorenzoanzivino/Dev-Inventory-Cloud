import { AuthProvider } from "@refinedev/core";
import { axiosInstance } from "./api/axiosInstance";

const API_URL = import.meta.env.VITE_API_URL;

// Funzione helper per decodificare il nome dal JWT senza librerie esterne
const decodeToken = (token: string) => {
    try {
        const base64Url = token.split('.')[1];
        const base64 = base64Url.replace(/-/g, '+').replace(/_/g, '/');
        const jsonPayload = decodeURIComponent(window.atob(base64).split('').map(function(c) {
            return '%' + ('00' + c.charCodeAt(0).toString(16)).slice(-2);
        }).join(''));

        return JSON.parse(jsonPayload);
    } catch (e) {
        return null;
    }
};

export const authProvider: AuthProvider = {
    login: async ({ email, password }) => {
        try {
            const { data } = await axiosInstance.post(`${API_URL}/auth/login`, {
                email,
                password,
            });

            const token = data?.token || data?.accessToken || data;

            if (token && typeof token === "string") {
                localStorage.setItem("token", token);
                return {
                    success: true,
                    redirectTo: "/",
                };
            }

            throw new Error("Formato token non riconosciuto");
        } catch (error: any) {
            return {
                success: false,
                error: {
                    name: "Errore di Autenticazione",
                    message: error.response?.data?.message || "Credenziali non valide.",
                },
            };
        }
    },
    register: async ({ nome, email, password }) => {
        try {
            await axiosInstance.post(`${API_URL}/auth/register`, {
                nome,
                email,
                password,
            });

            return {
                success: true,
                redirectTo: "/login",
            };
        } catch (error: any) {
            return {
                success: false,
                error: {
                    name: "Errore Registrazione",
                    message: error.response?.data?.message || "Impossibile creare l'account.",
                },
            };
        }
    },
    logout: async () => {
        localStorage.removeItem("token");
        return {
            success: true,
            redirectTo: "/login",
        };
    },
    check: async () => {
        const token = localStorage.getItem("token");
        if (token) return { authenticated: true };

        return {
            authenticated: false,
            logout: true,
            redirectTo: "/login",
        };
    },
    getPermissions: async () => null,
    getIdentity: async () => {
        const token = localStorage.getItem("token");
        if (token) {
            const decoded = decodeToken(token);
            return {
                id: 1,
                name: decoded?.sub || decoded?.nome || "Utente", // Legge dal token
                avatar: "https://i.pravatar.cc/300",
            };
        }
        return null;
    },
    onError: async (error) => {
        const status = error?.status || error?.response?.status;
        if (status === 401 || status === 403) {
            localStorage.removeItem("token");
            return {
                logout: true,
                redirectTo: "/login",
            };
        }
        return {};
    },
};