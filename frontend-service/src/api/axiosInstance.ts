import axios from "axios";

export const axiosInstance = axios.create({
    headers: {
        "Content-Type": "application/json",
        "Accept": "application/json"
    }
});

axiosInstance.interceptors.request.use((config) => {
    const token = localStorage.getItem("token");
    if (token && config.headers) {
        config.headers["Authorization"] = `Bearer ${token}`;
    }
    return config;
});