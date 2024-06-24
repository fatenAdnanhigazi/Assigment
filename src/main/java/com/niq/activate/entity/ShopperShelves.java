package com.niq.activate.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "shopper_shelves")
public class ShopperShelves {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String shopperId;
    private String productId;
    private float relevancyScore;
    // Getters and Setters

    public Long getId() {
        return id;
    }

    public String getShopperId() {
        return shopperId;
    }

    public String getProductId() {
        return productId;
    }

    public float getRelevancyScore() {
        return relevancyScore;
    }

    public void setShopperId(String shopperId) {
        this.shopperId = shopperId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setRelevancyScore(float relevancyScore) {
        this.relevancyScore = relevancyScore;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
