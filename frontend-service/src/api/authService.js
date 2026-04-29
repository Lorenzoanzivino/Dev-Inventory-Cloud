import axiosInstance from './axiosInstance';

export const authService = {
    login: async (email, password) => {
        const response = await axiosInstance.post('/auth/login', { email, password });
        return response.data;
    },
    register: async (nome, email, password) => {
        const response = await axiosInstance.post('/auth/register', { nome, email, password });
        return response.data;
    }
};