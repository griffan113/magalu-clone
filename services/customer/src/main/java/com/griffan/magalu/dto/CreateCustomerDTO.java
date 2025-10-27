package com.griffan.magalu.dto;

import com.griffan.magalu.entity.Address;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CreateCustomerDTO(
        @NotNull(message = "Customer firstname is required")
        String firstName,

        @NotNull(message = "Customer lastname is required")
        String lastName,

        @NotNull(message = "Customer email is required")
        @Email(message = "Invalid email format")
        String email,

        Address address
) {
}
