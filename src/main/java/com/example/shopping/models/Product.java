package com.example.shopping.models;

import javax.persistence.*;

/**
 * The Product class is a JPA entity class for products.
 */
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;


    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;

    @Column(name = "seller_card_number")
    private String sellerCardNumber;

    /**
     * This constructor is used to create a product.
     * @param id the product ID
     * @param name the product name
     * @param price the product price
     * @param seller the seller
     * @param sellerCardNumber the seller card number
     */
    public Product(Long id, String name, double price, Seller seller, String sellerCardNumber) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.seller = seller;
        this.sellerCardNumber = sellerCardNumber;
    }

    public Product() {

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getSellerCardNumber() {
        return sellerCardNumber;
    }

    public void setSellerCardNumber(String sellerCardNumber) {
        this.sellerCardNumber = sellerCardNumber;
    }
}
