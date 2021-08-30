package com.machineCoding.rideSharing.repositories;

import com.machineCoding.rideSharing.models.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustomerRepositoryInMemoryImpl implements CustomerRepository {
    private List<Customer> customers = new ArrayList<>();
    private Map<String, Integer> idToCustomerIndex = new HashMap<>();

    @Override
    public Customer addCustomer(Customer customer) {
        Customer addedCustomer = new Customer(customer.getAccount(), customer.getName(), customer.getEmail(),
                customer.getDob());
        customers.add(addedCustomer);
        idToCustomerIndex.put(addedCustomer.getId(), customers.size() - 1);
        return addedCustomer;
    }

    @Override
    public Customer getCustomerById(String customerId) {
        return customers.get(idToCustomerIndex.get(customerId));
    }
}
