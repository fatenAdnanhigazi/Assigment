package com.niq.activate.entity;

import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;


@Entity
public class ShopperProduct {
    @Id
    private Long id;

    private String shopperId;
    private String productId;
    private Float relevancyScore;

    public ShopperProduct(String shopperId, String productId, Float relevancyScore) {
        this.shopperId = shopperId;
        this.productId = productId;
        this.relevancyScore = relevancyScore;

    }

    // Getters and Setters

    public String getShopperId() {
        return shopperId;
    }

    public String getProductId() {
        return productId;
    }

    public Float getRelevancyScore() {
        return relevancyScore;
    }

    public void setShopperId(String shopperId) {
        this.shopperId = shopperId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setRelevancyScore(Float relevancyScore) {
        this.relevancyScore = relevancyScore;
    }
}
