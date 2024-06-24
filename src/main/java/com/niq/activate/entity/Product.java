package com.niq.activate.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "product_metadata")
public class Product {
    @Id
    private Long id;

    private String productId;

    private String category;

    private String brand;

    // Getters and Setters

    public String getProductId() {
        return productId;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
