import React from "react";
import { Edit, useForm } from "@refinedev/antd";
import { Form, Input, Typography } from "antd";
import { Card } from "../../components/ui/Primitives";

const { Text } = Typography;

export const CategoryEdit = () => {
    const { formProps, saveButtonProps } = useForm({});

    return (
        <Edit
            saveButtonProps={saveButtonProps}
            title={<Text style={{ fontSize: '24px', fontWeight: 900, color: '#2D3748' }}>Modifica Categoria</Text>}
        >
            <Card style={{ padding: '24px' }}>
                <Form {...formProps} layout="vertical">
                    <Form.Item
                        label="Nome Categoria"
                        name="nome"
                        rules={[
                            {
                                required: true,
                                message: "Inserisci il nome della categoria",
                            },
                        ]}
                    >
                        <Input placeholder="Es: Frontend, Backend, DevOps..." size="large" />
                    </Form.Item>
                </Form>
            </Card>
        </Edit>
    );
};