package com.example.shopping.controllers;

import com.example.shopping.models.Customer;
import com.example.shopping.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



/**
 * The CustomerController class is a Spring Boot REST controller class for handling requests related to customers.
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    /**
     * This method is used to get a customer by ID.
     * @param id the customer ID
     * @return the response entity
     */
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
        Customer customer = customerRepository.findById(id).orElse(null);
        if (customer != null) {
            return new ResponseEntity<>(customer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * This method is used to create a customer.
     * @param customer the customer
     * @return the response entity
     */
    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        try {
            Customer createdCustomer = customerRepository.save(customer);
            return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * This method is used to update a customer.
     * @param id the customer ID
     * @param customer the customer
     * @return the response entity
     */
    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        Customer existingCustomer = customerRepository.findById(id).orElse(null);
        if (existingCustomer != null) {
            existingCustomer.setFirstName(customer.getFirstName());
            existingCustomer.setLastName(customer.getLastName());

            existingCustomer.setEmail(customer.getEmail());
            // Оновлення інших полів за потреби
            Customer updatedCustomer = customerRepository.save(existingCustomer);
            return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    /**
     * This method is used to delete a customer.
     * @param id the customer ID
     * @return the response entity
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable Long id) {
        try {
            customerRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
