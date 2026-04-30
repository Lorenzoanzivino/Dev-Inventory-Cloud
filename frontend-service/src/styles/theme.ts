import { ThemeConfig, theme } from "antd";

export const lightTheme: ThemeConfig = {
    algorithm: theme.defaultAlgorithm,
    token: {
        colorPrimary: "#4A90E2",
        colorBgContainer: "#ffffff",
        colorText: "#2D3748",
    },
};

export const darkTheme: ThemeConfig = {
    algorithm: theme.darkAlgorithm,
    token: {
        colorPrimary: "#63B3ED",
        colorBgContainer: "#1A202C",
        colorText: "#F7FAFC",
        colorTextSecondary: "#A0AEC0",
    },
};