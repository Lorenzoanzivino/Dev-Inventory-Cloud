import React, { useEffect } from "react";
import { useGetIdentity, useUpdate } from "@refinedev/core";
import { Form, Input, Typography, Row, Col } from "antd";
import { Card, Button } from "../components/ui/Primitives";
import { APP_TEXTS } from "../constants/texts";

const { Title, Text } = Typography;

export const ProfilePage = () => {
    const { data: identity } = useGetIdentity<{ id: number; name: string; email: string }>();
    const { mutate: updateProfile, isLoading: isPending } = useUpdate();
    const [form] = Form.useForm();

    useEffect(() => {
        if (identity) {
            form.setFieldsValue({
                nome: identity.name,
                email: identity.email
            });
        }
    }, [identity, form]);

    const onFinish = (values: any) => {
        updateProfile({
            resource: "auth/me",
            id: identity?.id ?? "",
            values,
            successNotification: () => ({
                message: APP_TEXTS.profile.notifications.success,
                type: "success",
            }),
        });
    };

    return (
        <div style={{ padding: "24px" }}>
            <Row justify="center">
                <Col xs={24} sm={22} md={18} lg={12}>
                    <Card>
                        <Title level={2} style={{ margin: 0 }}>{APP_TEXTS.profile.title}</Title>
                        <Text type="secondary">{APP_TEXTS.profile.subtitle}</Text>

                        <Form
                            form={form}
                            layout="vertical"
                            onFinish={onFinish}
                            style={{ marginTop: "32px" }}
                        >
                            <Form.Item name="nome" label={APP_TEXTS.profile.labels.name}>
                                <Input size="large" />
                            </Form.Item>
                            <Form.Item name="email" label={APP_TEXTS.profile.labels.email}>
                                <Input size="large" disabled />
                            </Form.Item>
                            <Form.Item name="password" label={APP_TEXTS.profile.labels.password}>
                                <Input.Password size="large" placeholder="Lascia vuoto per mantenere la attuale" />
                            </Form.Item>
                            <Button htmlType="submit" variant="primary" size="large" disabled={isPending} style={{ width: "100%" }}>
                                {isPending ? "Salvataggio..." : APP_TEXTS.profile.buttons.save}
                            </Button>
                        </Form>
                    </Card>
                </Col>
            </Row>
        </div>
    );
};