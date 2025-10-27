package com.griffan.magalu.dto;

import com.griffan.magalu.entity.Address;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateCustomerDTO {
    private String id;

    @NotBlank
    @NotNull(message = "Customer firstname is required")
    private String firstName;

    @NotBlank
    @NotNull(message = "Customer lastname is required")
    private String lastName;

    @NotBlank
    @NotNull(message = "Customer email is required")
    @Email(message = "Invalid email format")
    private String email;

    private Address address;
}