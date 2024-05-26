package com.example.shopping.models;

import javax.persistence.*;

/**
 * The Payment class is a JPA entity class for payments.
 */
@Entity
@Table(name = "payments")

public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_card_number")
    private String customerCardNumber;

    @Column(name = "seller_card_number")
    private String sellerCardNumber;

    private double amount;

    /**
     * This constructor is used to create a payment.
     * @param id the payment ID
     * @param customerCardNumber the customer card number
     * @param sellerCardNumber the seller card number
     * @param amount the amount
     */
    public Payment(Long id, String customerCardNumber, String sellerCardNumber, double amount) {
        this.id = id;
        this.customerCardNumber = customerCardNumber;
        this.sellerCardNumber = sellerCardNumber;
        this.amount = amount;
    }

    public Payment() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerCardNumber() {
        return customerCardNumber;
    }

    public void setCustomerCardNumber(String customerCardNumber) {
        this.customerCardNumber = customerCardNumber;
    }

    public String getSellerCardNumber() {
        return sellerCardNumber;
    }

    public void setSellerCardNumber(String sellerCardNumber) {
        this.sellerCardNumber = sellerCardNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
