package com.niq.activate.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class ShopperShelf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String shopperId;
    private String productId;
    private float relevancyScore;
    // Getters and Setters
}
