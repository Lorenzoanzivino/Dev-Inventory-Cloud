import axiosInstance from './axiosInstance';

export const catalogService = {
    getAllResources: async () => {
        const response = await axiosInstance.get('/resources');
        return response.data;
    },
    getAllCategories: async () => {
        const response = await axiosInstance.get('/categories');
        return response.data;
    },
    createCategory: async (nome) => {
        const response = await axiosInstance.post('/categories', { nome });
        return response.data;
    },
    createResource: async (resourceData) => {
        const response = await axiosInstance.post('/resources', resourceData);
        return response.data;
    }
};