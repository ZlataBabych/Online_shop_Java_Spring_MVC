package com.example.shopping.repositories;

import com.example.shopping.models.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The SellerRepository interface is a Spring Data JPA repository for sellers.
 */
public interface SellerRepository extends JpaRepository<Seller, Long> {
}
