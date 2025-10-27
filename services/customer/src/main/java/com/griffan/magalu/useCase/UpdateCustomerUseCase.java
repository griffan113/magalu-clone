package com.griffan.magalu.useCase;

import com.griffan.magalu.dto.CreateCustomerDTO;
import com.griffan.magalu.dto.UpdateCustomerDTO;
import com.griffan.magalu.entity.Customer;
import com.griffan.magalu.exception.CustomerNotFoundException;
import com.griffan.magalu.mapper.CustomerMapper;
import com.griffan.magalu.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateCustomerUseCase {
    private final CustomerRepository repository;
    private final CustomerMapper mapper;

    public String execute(UpdateCustomerDTO updateCustomerDTO) {
        var findCustomer = repository.findById(updateCustomerDTO.getId())
                .orElseThrow(() -> new CustomerNotFoundException(
                        String.format(("Customer with id %s not found"), updateCustomerDTO.getId()))
                );


        var customer = repository.save(mapper.toCustomer(updateCustomerDTO));

        return customer.getId();
    }
}
