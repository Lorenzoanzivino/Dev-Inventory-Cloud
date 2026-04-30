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
import "@refinedev/antd/dist/reset.css";

import { authProvider } from "./authProvider";
import { axiosInstance } from "./api/axiosInstance";
import { ColorModeContextProvider } from "./contexts/color-mode";

import { Login } from "./pages/Login"
import { CustomSider } from "./components/CustomSider";
import { Header } from "./components/header";

const API_URL = import.meta.env.VITE_API_URL;

const App = () => {
    return (
        <BrowserRouter>
            <ColorModeContextProvider>
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
                            show: "/resources/show/:id",
                            meta: { canDelete: true, label: "Risorse" },
                        },
                        {
                            name: "categories",
                            list: "/categories",
                            create: "/categories/create",
                            edit: "/categories/edit/:id",
                            show: "/categories/show/:id",
                            meta: { canDelete: true, label: "Categorie" },
                        },
                        {
                            name: "collections",
                            list: "/collections",
                            create: "/collections/create",
                            edit: "/collections/edit/:id",
                            show: "/collections/show/:id",
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
                                <Route index element={<div>Vista Elenco Risorse</div>} />
                            </Route>
                            <Route path="/categories">
                                <Route index element={<div>Vista Elenco Categorie</div>} />
                            </Route>
                            <Route path="/collections">
                                <Route index element={<div>Vista Elenco Collezioni</div>} />
                            </Route>
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
                            <Route path="/register" element={<div>Vista Registrazione</div>} />
                        </Route>
                    </Routes>
                    <UnsavedChangesNotifier />
                </Refine>
            </ColorModeContextProvider>
        </BrowserRouter>
    );
};

export default App;