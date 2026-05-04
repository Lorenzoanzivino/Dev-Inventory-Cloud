import React, { useContext } from "react";
import { Create, useForm } from "@refinedev/antd";
import { Form, Input, Typography } from "antd";
import { Card, Button } from "../../components/ui/Primitives";
import { ICategory } from "../../interfaces/types";
import { ProjectContext } from "../../contexts/ProjectContext";

const { Text } = Typography;

export const CategoryCreate = () => {
    const { projectId } = useContext(ProjectContext);

    // Inizializziamo il form per le categorie
    const { formProps, saveButtonProps } = useForm<ICategory>();

    return (
        <Create
            title={<Text style={{ fontSize: '24px', fontWeight: 900, color: '#2D3748' }}>Nuova Categoria</Text>}
            footerButtons={() => (
                <Button {...saveButtonProps} variant="primary">
                    Salva Categoria
                </Button>
            )}
        >
            <Card style={{ padding: '24px' }}>
                <Form
                    {...formProps}
                    form={formProps.form}
                    layout="vertical"
                    // Iniezione automatica del projectId nel payload
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
                        <Input placeholder="Es: Frontend, Backend, DevOps..." size="large" />
                    </Form.Item>
                </Form>
            </Card>
        </Create>
    );
};