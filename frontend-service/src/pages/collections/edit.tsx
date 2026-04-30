import React from "react";
import { Edit, useForm, useSelect } from "@refinedev/antd";
import { Form, Select, Typography } from "antd";
import { Card } from "../../components/ui/Primitives";

const { Text } = Typography;

export const CollectionEdit = () => {
    const { formProps, saveButtonProps, queryResult } = useForm({});

    const { selectProps: developerSelectProps } = useSelect({
        resource: "developers",
        optionLabel: "nome",
        defaultValue: queryResult?.data?.data?.developerId,
    });

    const { selectProps: resourceSelectProps } = useSelect({
        resource: "resources",
        optionLabel: "nome",
        defaultValue: queryResult?.data?.data?.resourceId,
    });

    return (
        <Edit
            saveButtonProps={saveButtonProps}
            title={<Text style={{ fontSize: '24px', fontWeight: 900, color: '#2D3748' }}>Modifica Assegnazione</Text>}
        >
            <Card style={{ padding: '24px' }}>
                <Form {...formProps} layout="vertical">
                    <Form.Item
                        label="Sviluppatore"
                        name="developerId"
                        rules={[{ required: true, message: "Obbligatorio" }]}
                    >
                        <Select {...developerSelectProps} size="large" />
                    </Form.Item>
                    <Form.Item
                        label="Risorsa"
                        name="resourceId"
                        rules={[{ required: true, message: "Obbligatorio" }]}
                    >
                        <Select {...resourceSelectProps} size="large" />
                    </Form.Item>
                </Form>
            </Card>
        </Edit>
    );
};