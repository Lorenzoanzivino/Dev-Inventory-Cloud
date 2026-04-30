import { AuthProvider } from "@refinedev/core";
import { axiosInstance } from "./api/axiosInstance";

const API_URL = import.meta.env.VITE_API_URL;

export const authProvider: AuthProvider = {
    login: async ({ email, password }) => {
        try {
            const { data } = await axiosInstance.post(`${API_URL}/auth/login`, {
                email,
                password,
            });

            // Estrazione sicura: supporta { token: "..." }, { accessToken: "..." } o stringa pura
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
                    message: error.response?.data?.message || "Credenziali non valide. Riprova.",
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
        if (token) {
            return { authenticated: true };
        }
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
            return {
                id: 1,
                name: "Lorenzo",
            };
        }
        return null;
    },
    onError: async (error) => {
        // Legge correttamente lo status 401 o 403 dalla risposta di Axios
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