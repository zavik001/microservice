package org.example.Service;

import org.example.Customer;
import org.example.Interface.CustomerRegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public record CustomerService() {

    public void registerCustomer(CustomerRegistrationRequest request){
        Customer customer = Customer.builder().
                firstName(request.firstName())
                        .lastName(request.lastName())
                                .email(request.email())
                                        .build();
    }
}
