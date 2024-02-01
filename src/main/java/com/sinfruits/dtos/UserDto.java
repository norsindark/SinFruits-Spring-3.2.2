package com.sinfruits.dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    @NotBlank(message = "Can't be empty")
    private String full_name;

    @Email
    @NotBlank(message = "Can't be empty")
    @Column(unique = true)
    private String email;

    @Pattern(regexp = "^.{6,}$", message = "password need more than 6 character")
    private String password;
}
