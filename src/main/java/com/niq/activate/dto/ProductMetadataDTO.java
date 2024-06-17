package com.niq.activate.dto;


public class ProductMetadataDTO {
    private String productId;
    private String category;
    private String brand;

    //Getter
    public String getProductId() {
        return productId;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }
    //Setter
    
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
