package com.niq.activate.service;


import com.niq.activate.entity.ProductMetadata;
import com.niq.activate.entity.ShopperProduct;
import com.niq.activate.repository.ProductMetadataRepository;
import com.niq.activate.repository.ShopperProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class ProductService {
    @Autowired
    private final ShopperProductRepository shopperProductRepository;

    @Autowired
    private final ProductMetadataRepository productMetadataRepository;

    public ProductService(ShopperProductRepository shopperProductRepository, ProductMetadataRepository productMetadataRepository) {
        this.shopperProductRepository = shopperProductRepository;
        this.productMetadataRepository = productMetadataRepository;
    }

    public void saveShopperProducts(List<ShopperProduct> products) {
        shopperProductRepository.saveAll(products);
    }

    public void saveProductMetadata(ProductMetadata metadata) {
        productMetadataRepository.save(metadata);
    }

    public List<ShopperProduct> getProductsByShopper(String shopperId, String category, String brand, int limit) {
        List<ShopperProduct> products = shopperProductRepository.findByShopperId(shopperId);

        // Filtering and limiting
        if (category != null || brand != null) {
            products = products.stream().filter(product -> {
                ProductMetadata metadata = productMetadataRepository.findByProductId(product.getProductId());
                return (category == null || category.equals(metadata.getCategory())) &&
                        (brand == null || brand.equals(metadata.getBrand()));
            }).collect(Collectors.toList());
        }

        return products.stream().limit(limit).collect(Collectors.toList());
    }
}

