package com.sinfruits.utils;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class JwtProviderUtils {

//    @Value("$sin_fruits.app.jwtSecret")
//    private String jwtSecret;

    public static final String jwtSecret = "99c7571de87176741a2d3132f82ea909fbd283a69059949b05a63e54d573e689";

/*
    @Value("$sin_fruits.app.jwtExpirationMs")
    private int jwtExpirationMs;
*/


    public boolean validateToken(String authToken) {
        try {
            Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(authToken);
            return true;
        } catch (JwtException ex) {
            log.error("Invalid or expired JWT token: {}", ex.getMessage());
        } catch (IllegalArgumentException ex) {
            log.error("JWT claims string is empty.");
        }
        return false;
    }

    public String getEmailFromJwtToken(String token) {
        return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody().getSubject();
    }

    public String generateTokenUsingUsername(String username) {
        String token = Jwts.builder()
                .setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 24))
                .signWith(SignatureAlgorithm.HS512, jwtSecret).compact();
        return token;
    }
}
