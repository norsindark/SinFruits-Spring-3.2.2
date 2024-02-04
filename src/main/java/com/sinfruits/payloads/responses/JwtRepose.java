package com.sinfruits.payloads.responses;

public class JwtRepose {
    private String accessToken;
    private String tokenType = "Bearer";

    public JwtRepose(String accessToken) {
        this.accessToken = accessToken;
    }
}
