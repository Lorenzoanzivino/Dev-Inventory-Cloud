import React from "react";
import { Create, useForm } from "@refinedev/antd";
import { Form, Input, Typography } from "antd";
import { Card } from "../../components/ui/Primitives";

const { Text } = Typography;

export const DeveloperCreate = () => {
    const { formProps, saveButtonProps } = useForm({});

    return (
        <Create
            saveButtonProps={saveButtonProps}
            title={<Text style={{ fontSize: '24px', fontWeight: 900, color: '#2D3748' }}>Nuovo Sviluppatore</Text>}
        >
            <Card style={{ padding: '24px' }}>
                <Form {...formProps} layout="vertical">
                    <Form.Item
                        label="Nome Completo"
                        name="nome"
                        rules={[{ required: true, message: "Inserisci il nome" }]}
                    >
                        <Input placeholder="Es: Mario Rossi" size="large" />
                    </Form.Item>
                    <Form.Item
                        label="Email"
                        name="email"
                        rules={[
                            { required: true, message: "Inserisci l'email" },
                            { type: "email", message: "Inserisci un indirizzo email valido" }
                        ]}
                    >
                        <Input placeholder="Es: mario.rossi@example.com" size="large" />
                    </Form.Item>
                </Form>
            </Card>
        </Create>
    );
};