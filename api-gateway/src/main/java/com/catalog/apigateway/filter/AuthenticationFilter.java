package com.catalog.apigateway.filter;

import com.catalog.apigateway.util.JwtUtil;
import io.jsonwebtoken.Claims;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationFilter extends AbstractGatewayFilterFactory<AuthenticationFilter.Config> {

    private final JwtUtil jwtUtil;

    public AuthenticationFilter(JwtUtil jwtUtil) {
        super(Config.class);
        this.jwtUtil = jwtUtil;
    }

    public static class Config { }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            // STOP ALLE OPTIONS: blocca la richiesta qui e rispondi con 200 OK (Per il Frontend)
            if (exchange.getRequest().getMethod().equals(HttpMethod.OPTIONS)) {
                exchange.getResponse().setStatusCode(HttpStatus.OK);
                return exchange.getResponse().setComplete();
            }

            // 1. Controlla se l'header esiste
            if (!exchange.getRequest().getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
                exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
                return exchange.getResponse().setComplete();
            }

            // 2. Estrai il token pulito
            String authHeader = exchange.getRequest().getHeaders().get(HttpHeaders.AUTHORIZATION).get(0);
            if (authHeader != null && authHeader.startsWith("Bearer ")) {
                authHeader = authHeader.substring(7);
            } else {
                exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
                return exchange.getResponse().setComplete();
            }

            // 3. Valida il token ed estrai i Claims
            Claims claims;
            try {
                jwtUtil.validateToken(authHeader);
                claims = jwtUtil.getClaims(authHeader);
            } catch (Exception e) {
                exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
                return exchange.getResponse().setComplete();
            }

            // 4. LOGICA RBAC (Role-Based Access Control)
            String path = exchange.getRequest().getURI().getPath();
            HttpMethod method = exchange.getRequest().getMethod();
            String role = claims.get("role", String.class);

            // Passiamo l'identità ai microservizi a valle tramite Header (Utile per la Fase 2)
            exchange.getRequest().mutate()
                    .header("X-User-Email", claims.getSubject())
                    .header("X-User-Role", role != null ? role : "UNKNOWN")
                    .build();

            // REGOLA: Se non è GET (quindi è POST/PUT/DELETE) e non fa parte dell'Auth, devi essere ADMIN
            if (!method.equals(HttpMethod.GET) && !path.startsWith("/api/v1/auth")) {
                if (role == null || !role.equals("ADMIN")) {
                    exchange.getResponse().setStatusCode(HttpStatus.FORBIDDEN); // 403 Forbidden
                    return exchange.getResponse().setComplete();
                }
            }

            return chain.filter(exchange);
        };
    }
}