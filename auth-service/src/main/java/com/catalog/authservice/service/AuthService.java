package com.catalog.authservice.service;

import com.catalog.authservice.dto.AuthRequest;
import com.catalog.authservice.dto.AuthResponse;

public interface AuthService {
    String register(AuthRequest request);
    AuthResponse login(AuthRequest request);
}