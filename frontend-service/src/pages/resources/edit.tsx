import React, { useContext } from "react";
import { Edit, useForm, useSelect } from "@refinedev/antd";
import { Form, Select, Typography } from "antd";
import { Input, Button, Card } from "../../components/ui/Primitives";
import { IResource, ICategory } from "../../interfaces/types";
import { ProjectContext } from "../../contexts/ProjectContext";

const { Text } = Typography;

export const ResourceEdit = () => {
    const { projectId } = useContext(ProjectContext);
    const { formProps, saveButtonProps, queryResult } = useForm<IResource>();

    // Caricamento categorie filtrate per il progetto selezionato
    const { selectProps: categorySelectProps } = useSelect<ICategory>({
        resource: "categories",
        optionLabel: "nome",
        optionValue: "id",
        filters: [
            {
                field: "projectId",
                operator: "eq",
                value: projectId,
            },
        ],
    });

    return (
        <Edit
            title={<Text style={{ fontSize: '24px', fontWeight: 900, color: '#2D3748' }}>Modifica Risorsa</Text>}
            footerButtons={() => (
                <Button {...saveButtonProps} variant="primary">
                    Salva Modifiche
                </Button>
            )}
        >
            <Card style={{ padding: "32px" }}>
                <Form
                    {...formProps}
                    form={formProps.form} // Fix warning istanza non connessa
                    layout="vertical"
                    onFinish={(values: any) => {
                        if (formProps.onFinish) {
                            formProps.onFinish({
                                ...values,
                                // Forza il projectId del contesto e mappa correttamente l'ID categoria
                                projectId: projectId,
                                categoryId: values.category?.id || values.categoryId,
                            });
                        }
                    }}
                >
                    <Form.Item
                        label="Nome"
                        name="nome"
                        rules={[{ required: true, message: "Il nome è obbligatorio" }]}
                    >
                        <Input />
                    </Form.Item>

                    <Form.Item
                        label="Descrizione"
                        name="descrizione"
                    >
                        <Input />
                    </Form.Item>

                    <Form.Item
                        label="URL Documentazione"
                        name="url"
                        rules={[{ required: true, message: "L'URL è obbligatorio" }]}
                    >
                        <Input />
                    </Form.Item>

                    <Form.Item
                        label="Categoria"
                        name={["category", "id"]}
                        rules={[{ required: true, message: "La categoria è obbligatoria" }]}
                    >
                        <Select
                            {...categorySelectProps}
                            placeholder="Seleziona categoria"
                            style={{ height: '56px' }}
                        />
                    </Form.Item>
                </Form>
            </Card>
        </Edit>
    );
};