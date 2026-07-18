import { List, useTable, EditButton, DeleteButton } from "@refinedev/antd";
import { Table, Space } from "antd";
import { IProject } from "../../interfaces/types";

export const ProjectList = () => {
    const { tableProps } = useTable<IProject>();

    return (
        <List>
            <Table {...tableProps} rowKey="id">
                <Table.Column dataIndex="id" title="ID" width={80} />
                <Table.Column dataIndex="nome" title="Nome Progetto" />
                <Table.Column dataIndex="descrizione" title="Descrizione" />
                <Table.Column
                    title="Azioni"
                    dataIndex="actions"
                    render={(_, record: IProject) => (
                        <Space>
                            <EditButton hideText size="small" recordItemId={record.id} />
                            <DeleteButton hideText size="small" recordItemId={record.id} />
                        </Space>
                    )}
                />
            </Table>
        </List>
    );
};