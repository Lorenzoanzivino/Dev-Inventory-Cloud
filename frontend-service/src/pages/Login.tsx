import React from "react";
import { useLogin } from "@refinedev/core";
import { Form } from "antd";
import { Input, Button, Card } from "../components/ui/Primitives";
import { labels } from "../assets/labels";

export const Login = () => {
    const { mutate: login, isPending } = useLogin();

    const onFinish = (values: any) => {
        login({ email: values.email, password: values.password });
    };

    const styles = {
        container: {
            minHeight: '100vh',
            backgroundColor: '#F0F2F5',
            display: 'flex',
            overflow: 'hidden',
            fontFamily: 'system-ui, -apple-system, sans-serif',
            position: 'relative' as const,
        },
        backgroundBlob1: {
            position: 'absolute' as const,
            top: '-10%',
            left: '-10%',
            width: '50%',
            height: '50%',
            backgroundColor: 'rgba(162, 199, 229, 0.2)',
            filter: 'blur(120px)',
            borderRadius: '50%',
            pointerEvents: 'none' as const,
            zIndex: 0,
        },
        backgroundBlob2: {
            position: 'absolute' as const,
            bottom: '-10%',
            right: '-10%',
            width: '60%',
            height: '60%',
            backgroundColor: 'rgba(186, 230, 253, 0.2)',
            filter: 'blur(150px)',
            borderRadius: '50%',
            pointerEvents: 'none' as const,
            zIndex: 0,
        },
        contentWrapper: {
            flex: 1,
            position: 'relative' as const,
            zIndex: 10,
            display: 'flex',
            alignItems: 'center',
            justifyContent: 'center',
            padding: '24px',
        },
        formContainer: {
            width: '100%',
            maxWidth: '448px',
        },
        header: {
            display: 'flex',
            flexDirection: 'column' as const,
            alignItems: 'center',
            gap: '16px',
            marginBottom: '40px',
        },
        logoBox: {
            width: '80px',
            height: '80px',
            background: 'linear-gradient(to bottom right, #A2C7E5, #bae6fd)',
            borderRadius: '24px',
            boxShadow: '0 10px 15px -3px rgba(162,199,229,0.3)',
            transform: 'rotate(3deg)',
            display: 'flex',
            alignItems: 'center',
            justifyContent: 'center',
        },
        logoText: {
            fontSize: '30px',
            color: 'white',
            fontWeight: 900,
            textShadow: '0 4px 6px rgba(0,0,0,0.1)',
        },
        brandTitle: {
            fontSize: '36px',
            fontWeight: 900,
            color: '#2D3748',
            letterSpacing: '-0.05em',
            fontStyle: 'italic',
            margin: 0,
        },
        subtitle: {
            color: '#a1a1aa',
            fontWeight: 700,
            fontSize: '12px',
            letterSpacing: '0.3em',
            textTransform: 'uppercase' as const,
            margin: 0,
        },
        footerText: {
            marginTop: '32px',
            textAlign: 'center' as const,
            fontSize: '12px',
            fontWeight: 700,
            color: '#a1a1aa',
            letterSpacing: '0.1em',
        }
    };

    return (
        <div style={styles.container}>
            <div style={styles.backgroundBlob1} />
            <div style={styles.backgroundBlob2} />

            <div style={styles.contentWrapper}>
                <div style={styles.formContainer}>
                    <div style={styles.header}>
                        <div style={styles.logoBox}>
                            <span style={styles.logoText}>DI</span>
                        </div>
                        <h1 style={styles.brandTitle}>{labels.brand}</h1>
                        <p style={styles.subtitle}>System Access</p>
                    </div>

                    <Card style={{ padding: '40px 24px' }}>
                        <Form
                            layout="vertical"
                            onFinish={onFinish}
                            requiredMark={false}
                        >
                            <Form.Item
                                name="email"
                                rules={[{ required: true, message: 'Inserisci la tua email' }]}
                            >
                                <Input
                                    label="Email"
                                    type="email"
                                    placeholder="developer@onyx.com"
                                />
                            </Form.Item>

                            <Form.Item
                                name="password"
                                rules={[{ required: true, message: 'Inserisci la tua password' }]}
                            >
                                <Input
                                    label="Password"
                                    type="password"
                                    placeholder="••••••••"
                                />
                            </Form.Item>

                            <Form.Item style={{ paddingTop: '16px', marginBottom: 0 }}>
                                <Button
                                    variant="primary"
                                    htmlType="submit"
                                    style={{ width: '100%', height: '56px', fontSize: '16px' }}
                                    disabled={isPending}
                                >
                                    {isPending ? "AUTHENTICATING..." : "ENTER"}
                                </Button>
                            </Form.Item>
                        </Form>
                    </Card>

                    <div style={styles.footerText}>
                        <p>SECURE CONNECTION ESTABLISHED</p>
                    </div>
                </div>
            </div>
        </div>
    );
};
