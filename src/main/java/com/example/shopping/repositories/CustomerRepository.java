package com.example.shopping.repositories;

import com.example.shopping.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Тут можна додати специфічні методи для взаємодії з об'єктами Customer, якщо потрібно
}
