package com.niq.activate.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;


@Entity
public class Product {
    @Id
    private Long id;
    @JsonProperty("productId")
    private String productId;
    @JsonProperty("category")
    private String category;
    @JsonProperty("brand")
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
