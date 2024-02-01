package com.sinfruits.entities;

import com.sinfruits.enums.TokenEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tokens")
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String token;

    @Enumerated(EnumType.STRING)
    private TokenEnum tokenType = TokenEnum.BEARER;

    private boolean evoked;

    private boolean expired;

    @ManyToOne
    @JoinColumn(name = "token_id")
    private User user;
}
