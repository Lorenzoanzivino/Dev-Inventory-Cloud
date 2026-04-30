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
            localStorage.setItem("token", data.token);
            return {
                success: true,
                redirectTo: "/",
            };
        } catch (error: any) {
            return {
                success: false,
                error: {
                    name: "Login Error",
                    message: error.response?.data?.message || "Credenziali non valide",
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
            return {
                authenticated: true,
            };
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
        if (error?.status === 401 || error?.status === 403) {
            return {
                logout: true,
                redirectTo: "/login",
            };
        }
        return {};
    },
};