package com.griffan.magalu.controller;

import com.griffan.magalu.dto.CreateCustomerDTO;
import com.griffan.magalu.dto.UpdateCustomerDTO;
import com.griffan.magalu.useCase.CreateCustomerUseCase;
import com.griffan.magalu.useCase.UpdateCustomerUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CreateCustomerUseCase createCustomerUseCase;
    private final UpdateCustomerUseCase updateCustomerUseCase;

    @PostMapping
    public ResponseEntity<String> create(@Valid @RequestBody CreateCustomerDTO createCustomerDTO) {
        return ResponseEntity.ok(createCustomerUseCase.execute(createCustomerDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable("id") String id, @Valid @RequestBody UpdateCustomerDTO updateCustomerDTO) {
        updateCustomerDTO.setId(id);

        return ResponseEntity.ok(updateCustomerUseCase.execute(updateCustomerDTO));
    }
}
