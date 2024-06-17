package com.niq.activate.entity;

import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;


@Entity
public class ProductMetadata {
    @Id
    private Long id;

    private String productId;
    private String category;
    private String brand;

    public ProductMetadata(String productId, String category, String brand) {
        this.productId = productId;
        this.category = category;
        this.brand = brand;
    }

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
