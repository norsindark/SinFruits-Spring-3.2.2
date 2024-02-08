package com.sinfruits.entities;

import com.sinfruits.enums.RoleName;
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
    private RoleName role_name;

    @OneToMany(mappedBy = "role_id")
    private Set<User> user = new HashSet<>();
}
