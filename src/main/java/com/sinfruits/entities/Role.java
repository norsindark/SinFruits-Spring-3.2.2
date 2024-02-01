package com.sinfruits.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private String role_name;

    @OneToMany(mappedBy = "role")
    private Set<User> user = new HashSet<>();
}
