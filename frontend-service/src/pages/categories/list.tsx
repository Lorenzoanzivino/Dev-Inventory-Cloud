import React, { useContext } from "react";
import { List, useTable } from "@refinedev/antd";
import { Table, Space, Typography, Popconfirm } from "antd";
import { ICategory } from "../../interfaces/types";
import { Button, Card } from "../../components/ui/Primitives";
import { useNavigation, useDelete, useGetIdentity } from "@refinedev/core";
import { ProjectContext } from "../../contexts/ProjectContext";

const { Text } = Typography;

export const CategoryList = () => {
    const { edit } = useNavigation();
    const { mutate: deleteCategory } = useDelete();
    const { projectId } = useContext(ProjectContext);

    // Controllo permessi
    const { data: identity } = useGetIdentity<{ role: string }>();
    const isAdmin = identity?.role === "ADMIN";

    const { tableProps } = useTable<ICategory>({
        resource: "categories",
        syncWithLocation: true,
        permanentFilter: [
            {
                field: "projectId",
                operator: "eq",
                value: projectId,
            },
        ],
    });

    return (
        <List
            title={<Text style={{ fontSize: '24px', fontWeight: 900, color: '#2D3748' }}>Gestione Categorie</Text>}
            canCreate={isAdmin}
        >
            <Card style={{ padding: 0, overflow: 'hidden' }}>
                <Table {...tableProps} rowKey="id" pagination={{ ...tableProps.pagination, size: "small" }}>
                    <Table.Column
                        dataIndex="id"
                        title="ID"
                        render={(value) => <Text type="secondary">#{value}</Text>}
                        width={80}
                    />
                    <Table.Column
                        dataIndex="nome"
                        title="Nome Categoria"
                        render={(value) => <Text strong style={{ color: '#4A5568' }}>{value}</Text>}
                    />
                    {/* Azioni visibili solo per ADMIN */}
                    {isAdmin && (
                        <Table.Column
                            title="Azioni"
                            dataIndex="actions"
                            render={(_, record: ICategory) => (
                                <Space>
                                    <Button size="small"
                                            variant="secondary"
                                            style={{ padding: '4px 12px', height: '32px' }}
                                            onClick={() => edit("categories", record.id)}
                                    >
                                        Edit
                                    </Button>
                                    <Popconfirm
                                        title="Sei sicuro di voler eliminare questa categoria?"
                                        onConfirm={() => deleteCategory({ resource: "categories", id: record.id })}
                                        okText="Sì"
                                        cancelText="No"
                                    >
                                        <Button size="small"
                                                variant="danger"
                                                style={{ padding: '4px 12px', height: '32px' }}
                                        >
                                            Delete
                                        </Button>
                                    </Popconfirm>
                                </Space>
                            )}
                        />
                    )}
                </Table>
            </Card>
        </List>
    );
};