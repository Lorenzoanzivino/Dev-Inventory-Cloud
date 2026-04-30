package com.catalog.authservice.service;

import com.catalog.authservice.dto.AuthRequest;
import com.catalog.authservice.dto.AuthResponse;
import com.catalog.authservice.dto.UserResponse;
import com.catalog.authservice.entity.UserCredential;
import com.catalog.authservice.repository.UserCredentialRepository;
import com.catalog.authservice.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserCredentialRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;
    private final AuthenticationManager authenticationManager;

    @Override
    public String register(AuthRequest request) {
        repository.findByEmail(request.email())
                .ifPresent(u -> { throw new RuntimeException("Utente già registrato con questa email"); });

        UserCredential user = UserCredential.builder()
                .nome(request.nome())
                .email(request.email())
                .password(passwordEncoder.encode(request.password()))
                .build();

        repository.save(user);
        return "Utente registrato con successo";
    }

    @Override
    @Transactional(readOnly = true)
    public UserResponse getMe(String email) {
        UserCredential user = repository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Utente non trovato"));
        return new UserResponse(user.getId(), user.getNome(), user.getEmail());
    }

    @Override
    @Transactional
    public void updateMe(String currentEmail, AuthRequest updateData) {
        UserCredential user = repository.findByEmail(currentEmail)
                .orElseThrow(() -> new RuntimeException("Utente non trovato"));

        if (updateData.nome() != null) user.setNome(updateData.nome());

        if (updateData.password() != null && !updateData.password().isBlank()) {
            user.setPassword(passwordEncoder.encode(updateData.password()));
        }

        repository.save(user);
    }

    @Override
    public AuthResponse login(AuthRequest request) {
        Authentication authenticate = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.email(), request.password())
        );

        if (authenticate.isAuthenticated()) {
            String token = jwtUtil.generateToken(request.email());
            return new AuthResponse(token);
        } else {
            throw new RuntimeException("Accesso negato: credenziali non valide");
        }
    }
}