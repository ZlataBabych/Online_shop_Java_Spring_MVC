package com.example.shopping.repositories;

import com.example.shopping.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Тут можна додати специфічні методи для взаємодії з об'єктами Product, якщо потрібно
}
