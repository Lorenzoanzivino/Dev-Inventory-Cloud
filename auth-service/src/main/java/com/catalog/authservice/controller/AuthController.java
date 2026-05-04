package com.catalog.authservice.controller;

import com.catalog.authservice.dto.AuthRequest;
import com.catalog.authservice.dto.AuthResponse;
import com.catalog.authservice.dto.UserResponse;
import com.catalog.authservice.service.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@Tag(name = "Auth API", description = "Gestione autenticazione, registrazione e profilo utente")
public class AuthController {

    private final AuthService authService;

    @GetMapping("/me")
    @Operation(summary = "Recupera profilo", description = "Restituisce i dati dell'utente attualmente autenticato.")
    @SecurityRequirement(name = "bearerAuth")
    public ResponseEntity<UserResponse> getMe(Principal principal) {
        return ResponseEntity.ok(authService.getMe(principal.getName()));
    }

    @PutMapping("/me")
    @Operation(summary = "Aggiorna profilo", description = "Aggiorna il nome o la password dell'utente loggato.")
    @SecurityRequirement(name = "bearerAuth")
    public ResponseEntity<Void> updateMe(Principal principal, @RequestBody AuthRequest request) {
        authService.updateMe(principal.getName(), request);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/register")
    @Operation(summary = "Registrazione utente", description = "Crea un nuovo utente nel sistema. Di default viene assegnato il ruolo DEVELOPER.")
    public ResponseEntity<String> register(@Valid @RequestBody AuthRequest request) {
        return new ResponseEntity<>(authService.register(request), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    @Operation(summary = "Login", description = "Autentica un utente e restituisce il token JWT per accedere alle API protette.")
    public ResponseEntity<AuthResponse> login(@Valid @RequestBody AuthRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }
}