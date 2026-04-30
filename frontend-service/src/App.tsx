import { useContext } from "react";
import { Refine, Authenticated } from "@refinedev/core";
import {
    ErrorComponent,
    useNotificationProvider,
    ThemedLayoutV2
} from "@refinedev/antd";
import routerBindings, {
    NavigateToResource,
    UnsavedChangesNotifier,
    CatchAllNavigate
} from "@refinedev/react-router-v6";
import dataProvider from "@refinedev/simple-rest";
import { BrowserRouter, Routes, Route, Outlet } from "react-router-dom";
import { App as AntdApp, ConfigProvider } from "antd";
import "@refinedev/antd/dist/reset.css";

import { authProvider } from "./authProvider";
import { axiosInstance } from "./api/axiosInstance";
import { ColorModeContextProvider, ColorModeContext } from "./contexts/color-mode";
import { lightTheme, darkTheme } from "./styles/theme";
import { APP_TEXTS } from "./constants/texts";

import { Login } from "./pages/Login";
import { Register } from "./pages/Register";
import { ProfilePage } from "./pages/Profile";
import { CustomSider } from "./components/CustomSider";
import { Header } from "./components/header";

import { ResourceList, ResourceCreate, ResourceEdit } from "./pages/resources";
import { CategoryList, CategoryCreate, CategoryEdit } from "./pages/categories";
import { DeveloperList, DeveloperCreate, DeveloperEdit } from "./pages/developers";
import { CollectionList, CollectionCreate, CollectionEdit } from "./pages/collections";

const API_URL = import.meta.env.VITE_API_URL;

const AppThemed = () => {
    const { mode } = useContext(ColorModeContext);

    return (
        <ConfigProvider theme={mode === "light" ? lightTheme : darkTheme}>
            <AntdApp>
                <Refine
                    dataProvider={dataProvider(API_URL, axiosInstance)}
                    authProvider={authProvider}
                    notificationProvider={useNotificationProvider}
                    routerProvider={routerBindings}
                    resources={[
                        {
                            name: "resources",
                            list: "/resources",
                            create: "/resources/create",
                            edit: "/resources/edit/:id",
                            meta: { canDelete: true, label: APP_TEXTS.navigation.resources },
                        },
                        {
                            name: "categories",
                            list: "/categories",
                            create: "/categories/create",
                            edit: "/categories/edit/:id",
                            meta: { canDelete: true, label: APP_TEXTS.navigation.categories },
                        },
                        {
                            name: "developers",
                            list: "/developers",
                            create: "/developers/create",
                            edit: "/developers/edit/:id",
                            meta: { canDelete: true, label: APP_TEXTS.navigation.developers },
                        },
                        {
                            name: "collections",
                            list: "/collections",
                            create: "/collections/create",
                            edit: "/collections/edit/:id",
                            meta: { canDelete: true, label: APP_TEXTS.navigation.collections },
                        },
                        {
                            name: "profile",
                            list: "/profile",
                            meta: { label: APP_TEXTS.navigation.profile },
                        }
                    ]}
                    options={{
                        syncWithLocation: true,
                        warnWhenUnsavedChanges: true,
                    }}
                >
                    <Routes>
                        <Route
                            element={
                                <Authenticated
                                    key="authenticated-routes"
                                    fallback={<CatchAllNavigate to="/login" />}
                                >
                                    <ThemedLayoutV2
                                        Header={Header}
                                        Sider={CustomSider}
                                    >
                                        <Outlet />
                                    </ThemedLayoutV2>
                                </Authenticated>
                            }
                        >
                            <Route index element={<NavigateToResource resource="resources" />} />
                            <Route path="/resources/*">
                                <Route index element={<ResourceList />} />
                                <Route path="create" element={<ResourceCreate />} />
                                <Route path="edit/:id" element={<ResourceEdit />} />
                            </Route>
                            <Route path="/categories/*">
                                <Route index element={<CategoryList />} />
                                <Route path="create" element={<CategoryCreate />} />
                                <Route path="edit/:id" element={<CategoryEdit />} />
                            </Route>
                            <Route path="/developers/*">
                                <Route index element={<DeveloperList />} />
                                <Route path="create" element={<DeveloperCreate />} />
                                <Route path="edit/:id" element={<DeveloperEdit />} />
                            </Route>
                            <Route path="/collections/*">
                                <Route index element={<CollectionList />} />
                                <Route path="create" element={<CollectionCreate />} />
                                <Route path="edit/:id" element={<CollectionEdit />} />
                            </Route>
                            <Route path="/profile" element={<ProfilePage />} />
                            <Route path="*" element={<ErrorComponent />} />
                        </Route>

                        <Route
                            element={
                                <Authenticated key="auth-pages" fallback={<Outlet />}>
                                    <NavigateToResource />
                                </Authenticated>
                            }
                        >
                            <Route path="/login" element={<Login />} />
                            <Route path="/register" element={<Register />} />
                        </Route>
                    </Routes>
                    <UnsavedChangesNotifier />
                </Refine>
            </AntdApp>
        </ConfigProvider>
    );
};

const App = () => (
    <BrowserRouter>
        <ColorModeContextProvider>
            <AppThemed />
        </ColorModeContextProvider>
    </BrowserRouter>
);

export default App;