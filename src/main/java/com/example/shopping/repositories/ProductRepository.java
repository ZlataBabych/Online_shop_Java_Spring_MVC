package com.example.shopping.repositories;

import com.example.shopping.models.Product;
import com.example.shopping.models.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * The ProductRepository interface is a Spring Data JPA repository for products.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findBySellerId(Long sellerId);

}
