import { Edit, useForm } from "@refinedev/antd";
import { Form, Input } from "antd";
import { IProject } from "../../interfaces/types";

export const ProjectEdit = () => {
    const { formProps, saveButtonProps } = useForm<IProject>();

    return (
        <Edit saveButtonProps={saveButtonProps}>
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
        </Edit>
    );
};