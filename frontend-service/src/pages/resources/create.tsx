import React, { useContext } from "react";
import { Create, useForm, useSelect } from "@refinedev/antd";
import { Form, Select, Typography } from "antd";
import { Input, Button, Card } from "../../components/ui/Primitives";
import { IResource, ICategory } from "../../interfaces/types";
import { labels } from "../../assets/labels";
import { ProjectContext } from "../../contexts/ProjectContext";

const { Text } = Typography;

export const ResourceCreate = () => {
    const { projectId } = useContext(ProjectContext);

    // Inizializziamo il form normalmente
    const { formProps, saveButtonProps } = useForm<IResource>();

    // Caricamento categorie filtrate per il progetto attivo
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
        <Create
            title={<Text style={{ fontSize: '24px', fontWeight: 900, color: '#2D3748' }}>{labels.forms.resourceTitle}</Text>}
            footerButtons={() => (
                <Button {...saveButtonProps} variant="primary">
                    {labels.forms.btn}
                </Button>
            )}
        >
            <Card style={{ padding: "32px" }}>
                <Form
                    {...formProps}
                    form={formProps.form}
                    layout="vertical"
                    // Usiamo 'any' per evitare il conflitto tra i dati del form e l'interfaccia IResource
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
                        label={labels.forms.name}
                        name="nome"
                        rules={[{ required: true, message: "Il nome è obbligatorio" }]}
                    >
                        <Input placeholder="Es: Spring Boot Starter" />
                    </Form.Item>

                    <Form.Item
                        label={labels.forms.desc}
                        name="descrizione"
                    >
                        <Input placeholder="Breve descrizione della risorsa" />
                    </Form.Item>

                    <Form.Item
                        label={labels.forms.url}
                        name="url"
                        rules={[{ required: true, message: "L'URL è obbligatorio" }]}
                    >
                        <Input placeholder="https://docs.spring.io/..." />
                    </Form.Item>

                    <Form.Item
                        label={labels.forms.select}
                        name="categoryId"
                        rules={[{ required: true, message: "La categoria è obbligatoria" }]}
                    >
                        <Select
                            {...categorySelectProps}
                            placeholder="Seleziona una categoria"
                            style={{ height: '56px' }}
                        />
                    </Form.Item>
                </Form>
            </Card>
        </Create>
    );
};