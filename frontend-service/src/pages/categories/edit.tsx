import React, { useContext } from "react";
import { Edit, useForm } from "@refinedev/antd";
import { Form, Input, Typography } from "antd";
import { Card, Button } from "../../components/ui/Primitives";
import { ICategory } from "../../interfaces/types";
import { ProjectContext } from "../../contexts/ProjectContext";

const { Text } = Typography;

export const CategoryEdit = () => {
    const { projectId } = useContext(ProjectContext);
    const { formProps, saveButtonProps } = useForm<ICategory>();

    return (
        <Edit
            title={<Text style={{ fontSize: '24px', fontWeight: 900, color: '#2D3748' }}>Modifica Categoria</Text>}
            footerButtons={() => (
                <Button {...saveButtonProps} variant="primary">
                    Salva Modifiche
                </Button>
            )}
        >
            <Card style={{ padding: '24px' }}>
                <Form
                    {...formProps}
                    form={formProps.form} // Fix warning istanza
                    layout="vertical"
                    onFinish={(values: any) => {
                        if (formProps.onFinish) {
                            formProps.onFinish({
                                ...values,
                                projectId: projectId,
                            });
                        }
                    }}
                >
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
                        <Input placeholder="Es: Frontend, Backend..." size="large" style={{ height: '56px' }} />
                    </Form.Item>
                </Form>
            </Card>
        </Edit>
    );
};