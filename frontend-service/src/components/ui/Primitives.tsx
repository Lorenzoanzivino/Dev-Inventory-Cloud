import React from 'react';
import {
    Button as AntdButton,
    Card as AntdCard,
    Input as AntdInput,
    Typography,
    ButtonProps as AntdButtonProps,
    CardProps as AntdCardProps,
    InputProps as AntdInputProps
} from 'antd';

const { Text } = Typography;

interface ButtonProps extends Omit<AntdButtonProps, 'variant'> {
    variant?: 'primary' | 'secondary' | 'danger';
}

export const Button: React.FC<ButtonProps> = ({ children, variant = 'primary', style, ...props }) => {
    const customStyle: React.CSSProperties = {
        fontWeight: 'bold',
        letterSpacing: '0.05em',
        boxShadow: variant === 'primary' ? '8px 8px 20px rgba(162,199,229,0.4), -8px -8px 20px rgba(255,255,255,0.9)' :
            variant === 'secondary' ? '5px 5px 15px #e3e3e3, -5px -5px 15px #ffffff' :
                '4px 4px 10px #f5dada, -4px -4px 10px #ffffff',
        border: 'none',
        ...style
    };

    const typeMap = {
        primary: 'primary',
        secondary: 'default',
        danger: 'primary'
    } as const;

    return (
        <AntdButton
            type={typeMap[variant]}
            danger={variant === 'danger'}
            style={customStyle}
            size="large"
            shape="round"
            {...props}
        >
            {children}
        </AntdButton>
    );
};

interface CardProps extends AntdCardProps {}

export const Card: React.FC<CardProps> = ({ children, style, ...props }) => (
    <AntdCard
        variant="borderless"
        style={{
            backgroundColor: 'rgba(255, 255, 255, 0.6)',
            backdropFilter: 'blur(24px)',
            WebkitBackdropFilter: 'blur(24px)',
            borderRadius: '48px',
            border: '1px solid rgba(255, 255, 255, 0.8)',
            boxShadow: '0 20px 50px rgba(0,0,0,0.04)',
            ...style
        }}
        {...props}
    >
        {children}
    </AntdCard>
);

interface InputProps extends AntdInputProps {
    label?: string;
}

export const Input: React.FC<InputProps> = ({ label, style, ...props }) => (
    <div style={{ display: 'flex', flexDirection: 'column', gap: '12px', width: '100%' }}>
        {label && (
            <Text style={{
                fontSize: '11px',
                fontWeight: 900,
                color: '#A2C7E5',
                marginLeft: '16px',
                textTransform: 'uppercase',
                letterSpacing: '0.2em'
            }}>
                {label}
            </Text>
        )}
        <AntdInput
            style={{
                backgroundColor: '#F8FAFC',
                borderRadius: '24px',
                padding: '16px 24px',
                fontSize: '14px',
                color: '#52525b',
                boxShadow: 'inset 4px 4px 10px rgba(0,0,0,0.03)',
                border: 'none',
                ...style
            }}
            {...props}
        />
    </div>
);

export const Badge: React.FC<{ children: React.ReactNode }> = ({ children }) => (
    <span style={{
        padding: '6px 16px',
        borderRadius: '9999px',
        backgroundColor: 'rgba(255, 255, 255, 0.5)',
        color: '#8ba7c4',
        fontSize: '10px',
        fontWeight: 900,
        textTransform: 'uppercase',
        letterSpacing: '0.15em',
        border: '1px solid white',
        boxShadow: '0 1px 2px rgba(0,0,0,0.05)',
        backdropFilter: 'blur(12px)',
        WebkitBackdropFilter: 'blur(12px)'
    }}>
        {children}
    </span>
);