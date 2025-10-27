package com.griffan.magalu.useCase;

import com.griffan.magalu.dto.CreateCustomerDTO;
import com.griffan.magalu.mapper.CustomerMapper;
import com.griffan.magalu.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateCustomerUseCase {
    private final CustomerRepository repository;
    private final CustomerMapper mapper;

    public String execute(CreateCustomerDTO createCustomerDTO) {
        var customer = repository.save(mapper.toCustomer(createCustomerDTO));

        return customer.getId();
    }
}
