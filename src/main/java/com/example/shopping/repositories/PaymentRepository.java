package com.example.shopping.repositories;

import com.example.shopping.models.Payment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * The PaymentRepository interface is a Spring Data JPA repository for payments.
 */
public interface PaymentRepository extends CrudRepository<Payment, Long> {
    List<Payment> findBySellerCardNumber(String cardNumber);

}
