package com.example.demo.controller;

import com.example.demo.entites.Customer;
import com.example.demo.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public void saveCustomer(@RequestBody Customer customerSave){
        customerService.saveCustomer(customerSave);
    }

    @DeleteMapping(path = "{id}")
    public void deleteCustomer(@PathVariable Integer id){
        customerService.deleteCustomer(id);
    }

    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping(path = "{firstName}")
    public Customer getCustomerByFirstName(@PathVariable String firstName){
        return customerService.getCustomerByFirstName(firstName);
    }

    @GetMapping(path = "v2/{firstName}")
    public List<Customer> getAllCustomersByFirstNameContains(@PathVariable String firstName){
        return customerService.getAllCustomersByFirstNameContains(firstName);
    }
}
