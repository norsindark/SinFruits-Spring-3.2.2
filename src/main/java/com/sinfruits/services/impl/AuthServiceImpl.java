package com.sinfruits.services.impl;

import com.sinfruits.exceptions.UserNotFoundException;
import com.sinfruits.payloads.requests.LoginRequest;
import com.sinfruits.payloads.responses.JwtResponse;
import com.sinfruits.services.AuthService;
import org.springframework.stereotype.Component;

@Component
public class AuthServiceImpl implements AuthService {

    @Override
    public JwtResponse signIn(LoginRequest loginRequest) throws UserNotFoundException {
        return null;
    }
}
