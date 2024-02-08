package com.sinfruits.services;

import com.sinfruits.exceptions.UserNotFoundException;
import com.sinfruits.payloads.requests.LoginRequest;
import com.sinfruits.payloads.responses.JwtResponse;

public interface AuthService {
    JwtResponse signIn(LoginRequest loginRequest) throws UserNotFoundException;
}
