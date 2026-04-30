import React from "react";
import { Edit, useForm, useSelect } from "@refinedev/antd";
import { Form, Select } from "antd";
import { Input, Button, Card } from "../../components/ui/Primitives";
import { IResource, ICategory } from "../../interfaces/types";

export const ResourceEdit = () => {
    // Manteniamo IResource per la gestione della query di caricamento
    const { formProps, saveButtonProps, queryResult } = useForm<IResource>();

    // Recuperiamo i dati per popolare i valori di default se necessario
    const resourceData = queryResult?.data?.data;

    const { selectProps: categorySelectProps } = useSelect<ICategory>({
        resource: "categories",
        defaultValue: resourceData?.category?.id,
        optionLabel: "nome",
        optionValue: "id",
    });

    return (
        <Edit
            title="Modifica Risorsa"
            saveButtonProps={saveButtonProps}
            footerButtons={() => (
                <Button {...saveButtonProps} variant="primary">
                    Salva Modifiche
                </Button>
            )}
        >
            <Card style={{ padding: "32px" }}>
                <Form
                    {...formProps}
                    layout="vertical"
                    // Usiamo 'any' per i valori del form per risolvere il conflitto TS2322.
                    // Questo permette di manipolare l'oggetto values liberamente prima del commit.
                    onFinish={(values: any) => {
                        return formProps.onFinish?.({
                            ...values,
                            // Assicuriamo che categoryId sia presente per il DTO ResourceRequest del backend
                            categoryId: values.category?.id || values.categoryId,
                        });
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
                        name={["category", "id"]} // Mappa direttamente l'ID nidificato nell'oggetto IResource
                        rules={[{ required: true, message: "La categoria è obbligatoria" }]}
                    >
                        <Select
                            {...categorySelectProps}
                            placeholder="Seleziona categoria"
                            style={{ height: '56px' }}
                            styles={{ popup: { root: { borderRadius: '16px' } } }}
                        />
                    </Form.Item>
                </Form>
            </Card>
        </Edit>
    );
};