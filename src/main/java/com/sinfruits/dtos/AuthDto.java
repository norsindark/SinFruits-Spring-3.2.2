package com.sinfruits.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthDto {

    @NotBlank(message = "username cant be empty")
    private String username;

    @NotBlank(message = "password can't be empty")
    private String password;
}
