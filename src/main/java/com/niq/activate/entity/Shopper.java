package com.niq.activate.entity;

import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;

@Entity
public class Shopper {
    @Id
    private String shopperId;

    @Column(columnDefinition = "jsonb")
    private String shelf; // JSONB format

// Getters and Setters

    public String getShopperId() {
        return shopperId;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShopperId(String shopperId) {
        this.shopperId = shopperId;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }
}
