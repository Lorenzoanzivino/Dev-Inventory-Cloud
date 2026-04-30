import React from "react";
import { useRegister } from "@refinedev/core";
import { Form, Input, Typography, Layout, theme } from "antd";
import { Card, Button } from "../components/ui/Primitives";
import { Link } from "react-router-dom";

const { Title, Text } = Typography;

export const Register = () => {
    const { token } = theme.useToken();
    const { mutate: register, isLoading: isPending } = useRegister();

    const onFinish = (values: any) => {
        register(values);
    };

    return (
        <Layout style={{ height: "100vh", justifyContent: "center", alignItems: "center", backgroundColor: "#f0f2f5" }}>
            <Card style={{ width: "400px", padding: "32px", boxShadow: "0 4px 12px rgba(0,0,0,0.1)" }}>
                <div style={{ textAlign: "center", marginBottom: "32px" }}>
                    <Title level={2} style={{ color: "#2D3748", fontWeight: 800, marginBottom: "8px" }}>
                        Crea Account
                    </Title>
                    <Text type="secondary">Inizia a gestire il tuo Inventory Cloud</Text>
                </div>

                <Form layout="vertical" onFinish={onFinish} requiredMark={false}>
                    <Form.Item
                        name="nome"
                        label="Nome"
                        rules={[{ required: true, message: "Inserisci il tuo nome" }]}
                    >
                        <Input size="large" placeholder="Es: Lorenzo" />
                    </Form.Item>

                    <Form.Item
                        name="email"
                        label="Email"
                        rules={[
                            { required: true, message: "Inserisci l'email" },
                            { type: "email", message: "Inserisci un'email valida" }
                        ]}
                    >
                        <Input size="large" placeholder="esempio@email.com" />
                    </Form.Item>

                    <Form.Item
                        name="password"
                        label="Password"
                        rules={[{ required: true, message: "Inserisci la password" }]}
                    >
                        <Input.Password size="large" placeholder="••••••••" />
                    </Form.Item>

                    <Form.Item style={{ marginBottom: "16px" }}>
                        <Button
                            htmlType="submit"
                            size="large"
                            variant="primary"
                            style={{ width: "100%" }}
                            disabled={isPending}
                        >
                            {isPending ? "Registrazione in corso..." : "Registrati"}
                        </Button>
                    </Form.Item>
                </Form>

                <div style={{ textAlign: "center" }}>
                    <Text type="secondary">
                        Hai già un account? <Link to="/login" style={{ color: token.colorPrimary, fontWeight: 600 }}>Accedi</Link>
                    </Text>
                </div>
            </Card>
        </Layout>
    );
};