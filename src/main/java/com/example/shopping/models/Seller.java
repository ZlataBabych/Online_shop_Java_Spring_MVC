package com.example.shopping.models;

import javax.persistence.*;

/**
 * The Seller class is a JPA entity class for sellers.
 */
@Entity
@Table(name = "sellers")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;

    @Column(name = "card_number")
    private String cardNumber;

    /**
     * This constructor is used to create a seller.
     * @param id the seller ID
     * @param name the seller name
     * @param location the seller location
     * @param cardNumber the seller card number
     */
    public Seller(Long id, String name, String location, String cardNumber) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.cardNumber = cardNumber;
    }

    public Seller() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
