package com.sinfruits.controllers;

import com.sinfruits.exceptions.UserNotFoundException;
import com.sinfruits.payloads.requests.LoginRequest;
import com.sinfruits.payloads.responses.JwtResponse;
import com.sinfruits.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/v1/auth")
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping("/sign-In")
    public ResponseEntity<JwtResponse> signIn(@RequestBody LoginRequest loginRequest) throws UserNotFoundException {
        return new ResponseEntity<>(authService.signIn(loginRequest), HttpStatus.OK);
    }
}
