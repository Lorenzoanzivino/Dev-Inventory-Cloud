package com.catalog.authservice.service;

import com.catalog.authservice.client.DeveloperClient;
import com.catalog.authservice.dto.AuthRequest;
import com.catalog.authservice.dto.AuthResponse;
import com.catalog.authservice.dto.UserResponse;
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
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
    private DeveloperClient developerClient;

    @InjectMocks
    private AuthServiceImpl authService;

    @Test
    void register_WhenNewUser_ShouldSaveAndSync() {
        AuthRequest request = new AuthRequest("Lorenzo", "test@example.com", "password123");
        when(repository.findByEmail(request.email())).thenReturn(Optional.empty());
        when(passwordEncoder.encode(request.password())).thenReturn("encodedPassword");

        String result = authService.register(request);

        assertEquals("Utente registrato e sincronizzato con successo", result);
        verify(repository).save(any(UserCredential.class));
    }

    @Test
    void login_WhenValidCredentials_ShouldReturnToken() {
        AuthRequest request = new AuthRequest(null, "test@example.com", "password123");
        Authentication authentication = mock(Authentication.class);
        UserCredential user = mock(UserCredential.class);

        when(user.getId()).thenReturn(1L);
        when(user.getRole()).thenReturn(Role.DEVELOPER);

        when(authenticationManager.authenticate(any()))
                .thenReturn(authentication);
        when(authentication.isAuthenticated())
                .thenReturn(true);

        when(repository.findByEmail("test@example.com"))
                .thenReturn(Optional.of(user));

        when(jwtUtil.generateToken("test@example.com", "DEVELOPER", 1L))
                .thenReturn("mock-token");

        AuthResponse response = authService.login(request);

        assertEquals("mock-token", response.token());

        verify(authenticationManager).authenticate(any());
        verify(repository).findByEmail("test@example.com");
        verify(jwtUtil).generateToken("test@example.com", "DEVELOPER", 1L);
    }

    @Test
    void getMe_WhenUserExists_ShouldReturnUserResponse() {
        String email = "test@example.com";
        UserCredential user = new UserCredential();
        user.setId(1L);
        user.setNome("Lorenzo");
        user.setEmail(email);
        user.setRole(Role.DEVELOPER);

        when(repository.findByEmail(email)).thenReturn(Optional.of(user));

        UserResponse response = authService.getMe(email);

        assertEquals(1L, response.id());
        assertEquals("Lorenzo", response.nome());
        assertEquals(email, response.email());
    }
}