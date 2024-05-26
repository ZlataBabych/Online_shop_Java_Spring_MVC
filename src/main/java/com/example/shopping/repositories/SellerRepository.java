package com.example.shopping.repositories;

import com.example.shopping.models.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    // Тут можна додати специфічні методи для взаємодії з об'єктами Seller, якщо потрібно
}
