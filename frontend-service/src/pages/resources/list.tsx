import React from "react";
import { List, useTable, TagField, DateField } from "@refinedev/antd";
import { Table, Space, Typography, Popconfirm } from "antd";
import { IResource } from "../../interfaces/types";
import { Button, Card } from "../../components/ui/Primitives";
import { useNavigation, useDelete } from "@refinedev/core";

const { Link, Text } = Typography;

export const ResourceList = () => {
    const { edit } = useNavigation();
    const { mutate: deleteResource } = useDelete();
    const { tableProps } = useTable<IResource>({
        syncWithLocation: true,
    });

    return (
        <List title={<Text style={{ fontSize: '24px', fontWeight: 900, color: '#2D3748' }}>Catalogo Risorse</Text>}>
            <Card style={{ padding: 0, overflow: 'hidden' }}>
                <Table {...tableProps} rowKey="id" pagination={{ ...tableProps.pagination, size: "small" }}>
                    <Table.Column
                        dataIndex="nome"
                        title="Risorsa"
                        render={(value) => <Text strong style={{ color: '#4A5568' }}>{value}</Text>}
                    />
                    <Table.Column
                        dataIndex="descrizione"
                        title="Descrizione"
                        render={(value) => <Text type="secondary">{value || "---"}</Text>}
                    />
                    <Table.Column
                        dataIndex="category"
                        title="Categoria"
                        render={(value) => (
                            <TagField value={value?.nome} color="blue" style={{ borderRadius: '8px', fontWeight: 700 }} />
                        )}
                    />
                    <Table.Column
                        dataIndex="url"
                        title="Link"
                        render={(value) => (
                            <Link href={value} target="_blank" style={{ color: '#A2C7E5' }}>
                                Apri Documentazione
                            </Link>
                        )}
                    />
                    <Table.Column
                        dataIndex="dataInserimento"
                        title="Data"
                        render={(value) => <DateField value={value} format="DD/MM/YYYY" />}
                    />
                    <Table.Column
                        title="Azioni"
                        dataIndex="actions"
                        render={(_, record: IResource) => (
                            <Space>
                                <Button size="small"
                                        variant="secondary"
                                        style={{ padding: '4px 12px', height: '32px' }}
                                        onClick={() => edit("resources", record.id)}
                                >
                                    Edit
                                </Button>
                                <Popconfirm
                                    title="Sei sicuro di voler eliminare questa risorsa?"
                                    onConfirm={() => deleteResource({ resource: "resources", id: record.id })}
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