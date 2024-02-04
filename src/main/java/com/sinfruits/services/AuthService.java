package com.sinfruits.services;

import com.sinfruits.payloads.requests.LoginRequest;
import com.sinfruits.payloads.responses.JwtRepose;

public interface AuthService {
    JwtRepose signIn(LoginRequest loginRequest);
}
