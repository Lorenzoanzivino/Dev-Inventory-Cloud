package com.catalog.authservice.service;

import com.catalog.authservice.dto.AuthRequest;
import com.catalog.authservice.dto.AuthResponse;
import com.catalog.authservice.dto.UserResponse;

public interface AuthService {
    String register(AuthRequest request);
    UserResponse getMe(String email);
    void updateMe(String currentEmail, AuthRequest updateData);
    AuthResponse login(AuthRequest request);
}