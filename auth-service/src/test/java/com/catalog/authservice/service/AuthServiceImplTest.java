package com.catalog.authservice.service;

import com.catalog.authservice.client.DeveloperClient;
import com.catalog.authservice.dto.AuthRequest;
import com.catalog.authservice.dto.AuthResponse;
import com.catalog.authservice.entity.Role;
import com.catalog.authservice.entity.UserCredential;
import com.catalog.authservice.repository.UserCredentialRepository;
import com.catalog.authservice.util.JwtUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AuthServiceImplTest {

    @Mock
    private UserCredentialRepository repository;

    @Mock
    private PasswordEncoder passwordEncoder;

    @Mock
    private JwtUtil jwtUtil;

    @Mock
    private AuthenticationManager authenticationManager;

    @Mock
    private DeveloperClient developerClient; // Aggiunto mock per il Feign Client

    @InjectMocks
    private AuthServiceImpl authService;

    @Test
    void register_WhenNewUser_ShouldSaveAndSync() {
        AuthRequest request = new AuthRequest("Lorenzo", "test@example.com", "password123");

        when(repository.findByEmail(request.email())).thenReturn(Optional.empty());
        when(passwordEncoder.encode(request.password())).thenReturn("encodedPassword");

        String result = authService.register(request);

        // Verifica che il messaggio di ritorno corrisponda alla nuova implementazione
        assertEquals("Utente registrato e sincronizzato con successo", result);
        verify(repository).save(any(UserCredential.class));
        verify(developerClient).syncDeveloper(any()); // Verifica che il sync sia stato chiamato
    }

    @Test
    void register_WhenUserExists_ShouldThrowException() {
        AuthRequest request = new AuthRequest("Lorenzo", "test@example.com", "password123");

        when(repository.findByEmail(request.email())).thenReturn(Optional.of(new UserCredential()));

        assertThrows(RuntimeException.class, () -> authService.register(request));
        verify(repository, never()).save(any(UserCredential.class));
        verify(developerClient, never()).syncDeveloper(any());
    }

    @Test
    void login_WhenValidCredentials_ShouldReturnToken() {
        AuthRequest request = new AuthRequest(null, "test@example.com", "password123");
        Authentication authentication = mock(Authentication.class);

        // Simula l'utente estratto dal database per recuperare il ruolo
        UserCredential user = new UserCredential();
        user.setEmail("test@example.com");
        user.setRole(Role.DEVELOPER);

        when(authenticationManager.authenticate(any(UsernamePasswordAuthenticationToken.class))).thenReturn(authentication);
        when(authentication.isAuthenticated()).thenReturn(true);
        when(repository.findByEmail(request.email())).thenReturn(Optional.of(user)); // Mock del recupero utente
        when(jwtUtil.generateToken(request.email(), "DEVELOPER")).thenReturn("mocked-jwt-token"); // Aggiunto il parametro Ruolo

        AuthResponse response = authService.login(request);

        assertEquals("mocked-jwt-token", response.token());
    }

    @Test
    void login_WhenInvalidCredentials_ShouldThrowException() {
        AuthRequest request = new AuthRequest(null, "test@example.com", "wrongpassword");
        Authentication authentication = mock(Authentication.class);

        when(authenticationManager.authenticate(any(UsernamePasswordAuthenticationToken.class))).thenReturn(authentication);
        when(authentication.isAuthenticated()).thenReturn(false);

        assertThrows(RuntimeException.class, () -> authService.login(request));
    }
}