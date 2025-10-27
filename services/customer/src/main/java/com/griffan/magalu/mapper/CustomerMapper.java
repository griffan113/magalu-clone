package com.griffan.magalu.mapper;

import com.griffan.magalu.dto.CreateCustomerDTO;
import com.griffan.magalu.dto.UpdateCustomerDTO;
import com.griffan.magalu.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {

    public Customer toCustomer(CreateCustomerDTO createCustomerDTO) {
        return Customer
                .builder()
                .id(null)
                .firstName(createCustomerDTO.firstName())
                .lastName(createCustomerDTO.lastName())
                .email(createCustomerDTO.email())
                .address(createCustomerDTO.address())
                .build();
    }

    public Customer toCustomer(UpdateCustomerDTO updateCustomerDTO) {
        return Customer
                .builder()
                .id(null)
                .firstName(updateCustomerDTO.getFirstName())
                .lastName(updateCustomerDTO.getLastName())
                .email(updateCustomerDTO.getEmail())
                .address(updateCustomerDTO.getAddress())
                .build();
    }
}
