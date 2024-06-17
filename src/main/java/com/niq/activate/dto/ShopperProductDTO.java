package com.niq.activate.dto;


public class ShopperProductDTO {
    private String shopperId;
    private String productId;
    private Float relevancyScore;

    //Getter

    public String getShopperId() {
        return shopperId;
    }

    public String getProductId() {
        return productId;
    }

    public Float getRelevancyScore() {
        return relevancyScore;
    }
    //Setter

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

