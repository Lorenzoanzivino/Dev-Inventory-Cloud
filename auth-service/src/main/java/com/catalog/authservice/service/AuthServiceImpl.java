package com.catalog.authservice.service;

import com.catalog.authservice.client.DeveloperClient;
import com.catalog.authservice.dto.AuthRequest;
import com.catalog.authservice.dto.AuthResponse;
import com.catalog.authservice.dto.DeveloperSyncRequest;
import com.catalog.authservice.entity.Role;
import com.catalog.authservice.entity.UserCredential;
import com.catalog.authservice.repository.UserCredentialRepository;
import com.catalog.authservice.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserCredentialRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;
    private final AuthenticationManager authenticationManager;
    private final DeveloperClient developerClient;

    @Override
    public String register(AuthRequest request) {
        Optional<UserCredential> existingUser = repository.findByEmail(request.email());
        if (existingUser.isPresent()) {
            throw new RuntimeException("Utente già registrato con questa email");
        }

        UserCredential user = new UserCredential();
        user.setNome(request.nome());
        user.setEmail(request.email());
        user.setPassword(passwordEncoder.encode(request.password()));
        // Il ruolo di default è DEVELOPER
        user.setRole(Role.DEVELOPER);

        repository.save(user);

        // Sincronizzazione con il Developer Collection Service
        DeveloperSyncRequest syncRequest = new DeveloperSyncRequest(user.getNome(), user.getEmail());
        developerClient.syncDeveloper(syncRequest);

        return "Utente registrato e sincronizzato con successo";
    }

    @Override
    public AuthResponse login(AuthRequest request) {
        Authentication authenticate = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.email(), request.password())
        );

        if (authenticate.isAuthenticated()) {
            UserCredential user = repository.findByEmail(request.email())
                    .orElseThrow(() -> new RuntimeException("Errore interno: Utente non trovato"));

            // Passa email, ruolo e ID utente
            String token = jwtUtil.generateToken(request.email(), user.getRole().name(), user.getId());
            return new AuthResponse(token);
        } else {
            throw new RuntimeException("Accesso negato: credenziali non valide");
        }
    }
}