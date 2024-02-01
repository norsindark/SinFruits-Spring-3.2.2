package com.sinfruits.repositories;

import com.sinfruits.entities.Token;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, String > {
    Optional<Token> findByToken(String token);

    List<Token> findByExpired(Boolean expired);
}
