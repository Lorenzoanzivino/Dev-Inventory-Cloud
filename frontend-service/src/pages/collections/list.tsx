import React from "react";
import { List, useTable } from "@refinedev/antd";
import { Table, Space, Typography, Popconfirm } from "antd";
import { ICollection } from "../../interfaces/types";
import { Button, Card } from "../../components/ui/Primitives";
import { useDelete, useNavigation } from "@refinedev/core";

const { Text } = Typography;

export const CollectionList = () => {
    const { edit } = useNavigation();
    const { mutate: deleteItem } = useDelete();

    // useTable recupera i dati dall'endpoint /api/v1/collections
    const { tableProps } = useTable<ICollection>({
        resource: "collections",
        syncWithLocation: true,
    });

    return (
        <List title={<Text style={{ fontSize: '24px', fontWeight: 900, color: '#2D3748' }}>Assegnazioni Risorse</Text>}>
            <Card style={{ padding: 0, overflow: 'hidden' }}>
                <Table {...tableProps} rowKey="id" pagination={{ ...tableProps.pagination, size: "small" }}>
                    <Table.Column
                        dataIndex="id"
                        title="ID"
                        render={(value) => <Text type="secondary">#{value}</Text>}
                        width={80}
                    />
                    <Table.Column
                        dataIndex="developerName" // Deve corrispondere al campo del DTO Java
                        title="Sviluppatore"
                        render={(value) => <Text strong color="#2D3748">{value || "N/D"}</Text>}
                    />
                    <Table.Column
                        dataIndex="resourceName" // Deve corrispondere al campo del DTO Java
                        title="Risorsa Assegnata"
                        render={(value) => <Text>{value || "Caricamento..."}</Text>}
                    />
                    <Table.Column
                        title="Azioni"
                        render={(_, record: ICollection) => (
                            <Space>
                                <Button
                                    size="small"
                                    variant="secondary"
                                    onClick={() => edit("collections", record.id)}
                                >
                                    Edit
                                </Button>
                                <Popconfirm
                                    title="Rimuovere questa risorsa dalla collezione?"
                                    onConfirm={() => deleteItem({ resource: "collections", id: record.id })}
                                    okText="Sì"
                                    cancelText="No"
                                >
                                    <Button size="small" variant="danger">Rimuovi</Button>
                                </Popconfirm>
                            </Space>
                        )}
                    />
                </Table>
            </Card>
        </List>
    );
};