import React from "react";
import { Create, useForm, useSelect } from "@refinedev/antd";
import { Form, Select, Typography } from "antd";
import { Card } from "../../components/ui/Primitives";

const { Text } = Typography;

export const CollectionCreate = () => {
    const { formProps, saveButtonProps } = useForm({});

    const { selectProps: developerSelectProps } = useSelect({
        resource: "developers",
        optionLabel: "nome",
    });

    const { selectProps: resourceSelectProps } = useSelect({
        resource: "resources",
        optionLabel: "nome",
    });

    return (
        <Create
            saveButtonProps={saveButtonProps}
            title={<Text style={{ fontSize: '24px', fontWeight: 900, color: '#2D3748' }}>Nuova Assegnazione</Text>}
        >
            <Card style={{ padding: '24px' }}>
                <Form {...formProps} layout="vertical">
                    <Form.Item
                        label="Seleziona Sviluppatore"
                        name="developerId"
                        rules={[{ required: true, message: "Obbligatorio" }]}
                    >
                        <Select {...developerSelectProps} placeholder="Scegli lo sviluppatore" size="large" />
                    </Form.Item>
                    <Form.Item
                        label="Seleziona Risorsa"
                        name="resourceId"
                        rules={[{ required: true, message: "Obbligatorio" }]}
                    >
                        <Select {...resourceSelectProps} placeholder="Scegli la risorsa da assegnare" size="large" />
                    </Form.Item>
                </Form>
            </Card>
        </Create>
    );
};