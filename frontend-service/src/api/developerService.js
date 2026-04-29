import axiosInstance from './axiosInstance';

export const developerService = {
    createDeveloper: async (developerData) => {
        const response = await axiosInstance.post('/developers', developerData);
        return response.data;
    },
    getAllDevelopers: async () => {
        const response = await axiosInstance.get('/developers');
        return response.data;
    },
    getDeveloperById: async (id) => {
        const response = await axiosInstance.get(`/developers/${id}`);
        return response.data;
    }
};