import { Create, useForm } from "@refinedev/antd";
import { Form, Input } from "antd";
import { IProject } from "../../interfaces/types";

export const ProjectCreate = () => {
    const { formProps, saveButtonProps } = useForm<IProject>();

    return (
        <Create saveButtonProps={saveButtonProps}>
            <Form {...formProps} layout="vertical">
                <Form.Item
                    label="Nome Progetto"
                    name={["nome"]}
                    rules={[{ required: true }]}
                >
                    <Input />
                </Form.Item>
                <Form.Item
                    label="Descrizione"
                    name={["descrizione"]}
                    rules={[{ required: true }]}
                >
                    <Input.TextArea rows={4} />
                </Form.Item>
            </Form>
        </Create>
    );
};