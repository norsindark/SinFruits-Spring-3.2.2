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
public class UserDetailDto {

    @NotBlank(message = "Can't be empty")
    private String address;

    @NotBlank(message = "Can't be empty")
    private int phone;
}
