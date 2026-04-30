import React from "react";
import { useMenu, useLogout, useTitle, useNavigation } from "@refinedev/core";
import { Layout, Menu, Typography, Space } from "antd";
import { Button } from "./ui/Primitives";
import { labels } from "../assets/labels";

const { Sider } = Layout;
const { Text } = Typography;

export const CustomSider = () => {
    const { menuItems, selectedKey } = useMenu();
    const { mutate: logout } = useLogout();
    const { push } = useNavigation();

    // Trasformiamo i menuItems nel formato "items" richiesto dalle nuove versioni di AntD
    const items = menuItems.map((item) => ({
        key: item.key,
        icon: item.icon,
        label: item.label,
        onClick: () => push(item.route ?? ""),
    }));

    return (
        <Sider
            width={280}
            style={{
                backgroundColor: "transparent",
                borderRight: "1px solid rgba(255, 255, 255, 0.3)",
                padding: "24px 16px",
            }}
        >
            <div style={{ marginBottom: "40px", textAlign: "center" }}>
                <Text style={{ fontSize: "20px", fontWeight: 900, color: "#2D3748", fontStyle: "italic" }}>
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
                }}
            />

            <div style={{ marginTop: "auto", padding: "16px" }}>
                <Button
                    variant="danger"
                    onClick={() => logout()}
                    style={{ width: "100%", height: "45px" }}
                >
                    {labels.navbar.logout}
                </Button>
            </div>
        </Sider>
    );
};