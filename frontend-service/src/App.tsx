import { Refine, Authenticated } from "@refinedev/core";
import {
    ErrorComponent,
    useNotificationProvider,
    ThemedLayout
} from "@refinedev/antd";
import routerBindings, {
    NavigateToResource,
    UnsavedChangesNotifier,
    CatchAllNavigate
} from "@refinedev/react-router-v6";
import dataProvider from "@refinedev/simple-rest";
import { BrowserRouter, Routes, Route, Outlet } from "react-router-dom";
import { App as AntdApp } from "antd";
import "@refinedev/antd/dist/reset.css";

import { authProvider } from "./authProvider";
import { axiosInstance } from "./api/axiosInstance";
import { ColorModeContextProvider } from "./contexts/color-mode";

import { Login } from "./pages/Login"
import { CustomSider } from "./components/CustomSider";
import { Header } from "./components/header";

import { ResourceList } from "./pages/resources/list";
import { ResourceCreate } from "./pages/resources/create";
import { ResourceEdit } from "./pages/resources/edit";

import { CategoryList } from "./pages/categories/list";
import { CategoryCreate } from "./pages/categories/create";
import { CategoryEdit } from "./pages/categories/edit";

import { DeveloperList } from "./pages/developers/list";
import { DeveloperCreate } from "./pages/developers/create";
import { DeveloperEdit } from "./pages/developers/edit";

import { CollectionList } from "./pages/collections/list";
import { CollectionCreate } from "./pages/collections/create";
import { CollectionEdit } from "./pages/collections/edit";

const API_URL = import.meta.env.VITE_API_URL;

// Estensione del dataProvider per mappare le chiamate PATCH verso PUT
const baseDataProvider = dataProvider(API_URL, axiosInstance);
const customDataProvider = {
    ...baseDataProvider,
    update: async ({ resource, id, variables }: any) => {
        const url = `${API_URL}/${resource}/${id}`;
        // Forza l'utilizzo di PUT tramite l'istanza Axios esistente
        const { data } = await axiosInstance.put(url, variables);
        return { data };
    }
};

const App = () => {
    return (
        <BrowserRouter>
            <ColorModeContextProvider>
                <AntdApp>
                    <Refine
                        dataProvider={customDataProvider}
                        authProvider={authProvider}
                        notificationProvider={useNotificationProvider}
                        routerProvider={routerBindings}
                        resources={[
                            {
                                name: "resources",
                                list: "/resources",
                                create: "/resources/create",
                                edit: "/resources/edit/:id",
                                show: "/resources/show/:id",
                                meta: { canDelete: true, label: "Risorse" },
                            },
                            {
                                name: "categories",
                                list: "/categories",
                                create: "/categories/create",
                                edit: "/categories/edit/:id",
                                meta: { canDelete: true, label: "Categorie" },
                            },
                            {
                                name: "developers",
                                list: "/developers",
                                create: "/developers/create",
                                edit: "/developers/edit/:id",
                                meta: { canDelete: true, label: "Sviluppatori" },
                            },
                            {
                                name: "collections",
                                list: "/collections",
                                create: "/collections/create",
                                edit: "/collections/edit/:id",
                                meta: { canDelete: true, label: "Collezioni" },
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
                                        <ThemedLayout
                                            Header={Header}
                                            Sider={CustomSider}
                                        >
                                            <Outlet />
                                        </ThemedLayout>
                                    </Authenticated>
                                }
                            >
                                <Route index element={<NavigateToResource resource="resources" />} />
                                <Route path="/resources">
                                    <Route index element={<ResourceList />} />
                                    <Route path="create" element={<ResourceCreate />} />
                                    <Route path="edit/:id" element={<ResourceEdit />} />
                                </Route>
                                <Route path="/categories">
                                    <Route index element={<CategoryList />} />
                                    <Route path="create" element={<CategoryCreate />} />
                                    <Route path="edit/:id" element={<CategoryEdit />} />
                                </Route>
                                <Route path="/developers">
                                    <Route index element={<DeveloperList />} />
                                    <Route path="create" element={<DeveloperCreate />} />
                                    <Route path="edit/:id" element={<DeveloperEdit />} />
                                </Route>
                                <Route path="/collections">
                                    <Route index element={<CollectionList />} />
                                    <Route path="create" element={<CollectionCreate />} />
                                    <Route path="edit/:id" element={<CollectionEdit />} />
                                </Route>
                            </Route>

                            <Route
                                element={
                                    <Authenticated key="auth-pages" fallback={<Outlet />}>
                                        <NavigateToResource />
                                    </Authenticated>
                                }
                            >
                                <Route path="/login" element={<Login />} />
                                <Route path="/register" element={<div>Vista Registrazione</div>} />
                            </Route>
                        </Routes>
                        <UnsavedChangesNotifier />
                    </Refine>
                </AntdApp>
            </ColorModeContextProvider>
        </BrowserRouter>
    );
};

export default App;