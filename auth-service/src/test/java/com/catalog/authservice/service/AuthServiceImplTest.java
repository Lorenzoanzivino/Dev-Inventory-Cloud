package com.catalog.authservice.service;

import com.catalog.authservice.dto.AuthRequest;
import com.catalog.authservice.dto.AuthResponse;
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

    @InjectMocks
    private AuthServiceImpl authService;

    @Test
    void register_WhenNewUser_ShouldSave() {
        AuthRequest request = new AuthRequest("test@example.com", "password123");

        when(repository.findByEmail(request.email())).thenReturn(Optional.empty());
        when(passwordEncoder.encode(request.password())).thenReturn("encodedPassword");

        String result = authService.register(request);

        assertEquals("Utente registrato con successo", result);
        verify(repository).save(any(UserCredential.class));
    }

    @Test
    void register_WhenUserExists_ShouldThrowException() {
        AuthRequest request = new AuthRequest("test@example.com", "password123");

        when(repository.findByEmail(request.email())).thenReturn(Optional.of(new UserCredential()));

        assertThrows(RuntimeException.class, () -> authService.register(request));
        verify(repository, never()).save(any(UserCredential.class));
    }

    @Test
    void login_WhenValidCredentials_ShouldReturnToken() {
        AuthRequest request = new AuthRequest("test@example.com", "password123");
        Authentication authentication = mock(Authentication.class);

        when(authenticationManager.authenticate(any(UsernamePasswordAuthenticationToken.class))).thenReturn(authentication);
        when(authentication.isAuthenticated()).thenReturn(true);
        when(jwtUtil.generateToken(request.email())).thenReturn("mocked-jwt-token");

        AuthResponse response = authService.login(request);

        assertEquals("mocked-jwt-token", response.token());
    }

    @Test
    void login_WhenInvalidCredentials_ShouldThrowException() {
        AuthRequest request = new AuthRequest("test@example.com", "wrongpassword");
        Authentication authentication = mock(Authentication.class);

        when(authenticationManager.authenticate(any(UsernamePasswordAuthenticationToken.class))).thenReturn(authentication);
        when(authentication.isAuthenticated()).thenReturn(false);

        assertThrows(RuntimeException.class, () -> authService.login(request));
    }
}