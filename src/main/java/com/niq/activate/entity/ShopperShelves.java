package com.niq.activate.entity;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "shopper_shelves")
public class ShopperShelf {
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
