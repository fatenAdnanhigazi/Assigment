package com.niq.activate.controller;

import java.util.List;

public class ShopperShelfRequest {
    private String shopperId;
    private List<ShelfItem> shelf;

    // Getters and Setters

    public String getShopperId() {
        return shopperId;
    }

    public void setShopperId(String shopperId) {
        this.shopperId = shopperId;
    }

    public List<ShelfItem> getShelf() {
        return shelf;
    }

    public void setShelf(List<ShelfItem> shelf) {
        this.shelf = shelf;
    }

    public static class ShelfItem {
        private String productId;
        private float relevancyScore;

        // Getters and Setters

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public float getRelevancyScore() {
            return relevancyScore;
        }

        public void setRelevancyScore(float relevancyScore) {
            this.relevancyScore = relevancyScore;
        }
    }
}
