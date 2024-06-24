package com.niq.activate.controller;

import com.niq.activate.entity.Product;

public class ProductResponse {
    private String productId;
    private String category;
    private String brand;
    private float relevancyScore;

    public ProductResponse(Product metadata, float relevancyScore) {
        this.productId = metadata.getProductId();
        this.category = metadata.getCategory();
        this.brand = metadata.getBrand();
        this.relevancyScore = relevancyScore;
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

    public float getRelevancyScore() {
        return relevancyScore;
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

    public void setRelevancyScore(float relevancyScore) {
        this.relevancyScore = relevancyScore;
    }
}
