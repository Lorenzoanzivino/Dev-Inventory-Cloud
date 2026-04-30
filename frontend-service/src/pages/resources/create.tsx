import React from "react";
import { Create, useForm, useSelect } from "@refinedev/antd";
import { Form, Select } from "antd";
import { Input, Button, Card } from "../../components/ui/Primitives";
import { IResource, ICategory } from "../../interfaces/types";
import { labels } from "../../assets/labels";

export const ResourceCreate = () => {
    // Gestione del form con Refine
    const { formProps, saveButtonProps } = useForm<IResource>();

    // Caricamento dinamico delle categorie per la Select
    const { selectProps: categorySelectProps } = useSelect<ICategory>({
        resource: "categories",
        optionLabel: "nome", // Visualizza il nome nel dropdown
        optionValue: "id",   // Invia l'ID al backend
    });

    return (
        <Create
            title={labels.forms.resourceTitle}
            footerButtons={() => (
                <Button {...saveButtonProps} variant="primary">
                    {labels.forms.btn}
                </Button>
            )}
        >
            <Card style={{ padding: "32px" }}>
                <Form {...formProps} layout="vertical">
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
                            // Nuova sintassi AntD 5
                            styles={{ popup: { root: { borderRadius: '16px' } } }}
                        />
                    </Form.Item>
                </Form>
            </Card>
        </Create>
    );
};