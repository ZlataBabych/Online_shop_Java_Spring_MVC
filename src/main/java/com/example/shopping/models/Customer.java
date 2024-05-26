package com.example.shopping.models;

import javax.persistence.*;

/**
 * The Customer class is a JPA entity class for customers.
 */
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    @Column(name = "card_number")
    private String cardNumber;

    /**
     * This constructor is used to create a customer.
     * @param id the customer ID
     * @param firstName the customer first name
     * @param lastName the customer last name
     * @param email the customer email
     * @param cardNumber the customer card number
     */
    public Customer(Long id, String firstName, String lastName, String email, String cardNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.cardNumber = cardNumber;
    }


    public Customer() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
