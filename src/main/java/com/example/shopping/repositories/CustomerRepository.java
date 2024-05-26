package com.example.shopping.repositories;

import com.example.shopping.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The CustomerRepository interface is a Spring Data JPA repository for customers.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
