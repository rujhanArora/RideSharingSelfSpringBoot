package com.machineCoding.rideSharing.repositories;

import com.machineCoding.rideSharing.models.Customer;
import org.springframework.stereotype.Component;

@Component
public interface CustomerRepository {
    Customer addCustomer(Customer customer);
    Customer getCustomerById(String customerId);
}
