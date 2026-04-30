import React from "react";
import { useMenu, useLogout, useNavigation } from "@refinedev/core";
import { Layout, Menu, Typography, theme } from "antd";
import { Button } from "./ui/Primitives";
import { APP_TEXTS } from "../constants/texts";
import { labels } from "../assets/labels";

const { Sider } = Layout;
const { Text } = Typography;

export const CustomSider = () => {
    const { token } = theme.useToken();
    const { menuItems, selectedKey } = useMenu();
    const { mutate: logout } = useLogout();
    const { push } = useNavigation();

    const items = menuItems.map((item) => ({
        key: item.key,
        icon: item.icon,
        label: item.label,
        onClick: () => push(item.route ?? ""),
    }));

    return (
        <Sider
            breakpoint="lg"
            collapsedWidth="0"
            width={280}
            style={{
                backgroundColor: token.colorBgContainer,
                borderRight: `1px solid ${token.colorBorderSecondary}`,
                height: "100vh",
                position: "sticky",
                top: 0,
                left: 0,
            }}
        >
            <div style={{ padding: "24px 16px", height: "100%", display: "flex", flexDirection: "column" }}>
                <div style={{ marginBottom: "40px", textAlign: "center" }}>
                    <Text style={{
                        fontSize: "20px",
                        fontWeight: 900,
                        color: token.colorText,
                        fontStyle: "italic"
                    }}>
                        {labels.brand}
                    </Text>
                </div>

                <Menu
                    mode="inline"
                    selectedKeys={[selectedKey]}
                    items={items}
                    style={{
                        backgroundColor: "transparent",
                        border: "none",
                        flex: 1
                    }}
                />

                <div style={{ marginTop: "auto" }}>
                    <Button
                        variant="danger"
                        onClick={() => logout()}
                        style={{ width: "100%", height: "45px" }}
                    >
                        {labels.navbar.logout}
                    </Button>
                </div>
            </div>
        </Sider>
    );
};