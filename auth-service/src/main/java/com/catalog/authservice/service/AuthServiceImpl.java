package com.catalog.authservice.service;

import com.catalog.authservice.client.DeveloperClient;
import com.catalog.authservice.dto.AuthRequest;
import com.catalog.authservice.dto.AuthResponse;
import com.catalog.authservice.dto.DeveloperSyncRequest;
import com.catalog.authservice.dto.UserResponse;
import com.catalog.authservice.entity.Role;
import com.catalog.authservice.entity.UserCredential;
import com.catalog.authservice.repository.UserCredentialRepository;
import com.catalog.authservice.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j // Aggiunto per il logging
@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserCredentialRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;
    private final AuthenticationManager authenticationManager;
    private final DeveloperClient developerClient; // Inject del Feign Client

    @Override
    @Transactional
    public String register(AuthRequest request) {
        repository.findByEmail(request.email())
                .ifPresent(u -> { throw new RuntimeException("Utente già registrato con questa email"); });

        UserCredential user = UserCredential.builder()
                .nome(request.nome())
                .email(request.email())
                .password(passwordEncoder.encode(request.password()))
                .role(Role.DEVELOPER) // Default sicuro
                .build();

        // 1. Salva l'utente nel DB locale
        repository.save(user);

        // 2. Sincronizzazione automatica con il Developer Service
        try {
            DeveloperSyncRequest syncReq = new DeveloperSyncRequest(user.getNome(), user.getEmail());
            developerClient.syncDeveloper(syncReq);
            log.info("Sviluppatore sincronizzato con successo nel collection service: {}", user.getEmail());
        } catch (Exception e) {
            log.error("Errore durante la sincronizzazione dello sviluppatore: {}", e.getMessage());
            // In un sistema avanzato qui potresti implementare una logica di retry o Saga Pattern
            throw new RuntimeException("Utente salvato, ma la sincronizzazione col catalogo è fallita: " + e.getMessage());
        }

        return "Utente registrato e sincronizzato con successo";
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
<<<<<<< Updated upstream
            // Recupera l'utente per ottenere il ruolo
            UserCredential user = repository.findByEmail(request.email())
                    .orElseThrow(() -> new RuntimeException("Errore interno: Utente non trovato"));

            // Passa l'email e il ruolo al generatore JWT
            String token = jwtUtil.generateToken(request.email(), user.getRole().name());
=======
            UserCredential user = repository.findByEmail(request.email())
                    .orElseThrow(() -> new RuntimeException("Errore interno: Utente non trovato"));

            // Passa email, ruolo e ID utente (che corrisponde al Developer ID per sincronizzazione)
            String token = jwtUtil.generateToken(request.email(), user.getRole().name(), user.getId());
>>>>>>> Stashed changes
            return new AuthResponse(token);
        } else {
            throw new RuntimeException("Accesso negato: credenziali non valide");
        }
    }
}