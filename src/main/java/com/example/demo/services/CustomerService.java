package com.example.demo.services;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.entites.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void saveCustomer(Customer customerSave) {
        customerRepository.save(customerSave);
    }

    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerByFirstName(String firstName) {
        return customerRepository.findByFirstName(firstName);
    }

    public List<Customer> getAllCustomersByFirstNameContains(String firstName) {
        return customerRepository.findByFirstNameContains(firstName);
    }
}
