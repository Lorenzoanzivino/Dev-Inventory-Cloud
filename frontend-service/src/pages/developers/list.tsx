import React from "react";
import { List, useTable, EmailField } from "@refinedev/antd";
import { Table, Space, Typography, Popconfirm } from "antd";
import { IDeveloper } from "../../interfaces/types";
import { Button, Card } from "../../components/ui/Primitives";
import { useNavigation, useDelete } from "@refinedev/core";

const { Text } = Typography;

export const DeveloperList = () => {
    const { edit } = useNavigation();
    const { mutate: deleteDeveloper } = useDelete();
    const { tableProps } = useTable<IDeveloper>({
        resource: "developers",
        syncWithLocation: true,
    });

    return (
        <List title={<Text style={{ fontSize: '24px', fontWeight: 900, color: '#2D3748' }}>Gestione Sviluppatori</Text>}>
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
                        title="Nome Sviluppatore"
                        render={(value) => <Text strong style={{ color: '#4A5568' }}>{value}</Text>}
                    />
                    <Table.Column
                        dataIndex="email"
                        title="Email"
                        render={(value) => <EmailField value={value} />}
                    />
                    <Table.Column
                        title="Azioni"
                        dataIndex="actions"
                        render={(_, record: IDeveloper) => (
                            <Space>
                                <Button size="small"
                                        variant="secondary"
                                        style={{ padding: '4px 12px', height: '32px' }}
                                        onClick={() => edit("developers", record.id)}
                                >
                                    Edit
                                </Button>
                                <Popconfirm
                                    title="Sei sicuro di voler eliminare questo sviluppatore?"
                                    onConfirm={() => deleteDeveloper({ resource: "developers", id: record.id })}
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
                </Table>
            </Card>
        </List>
    );
};