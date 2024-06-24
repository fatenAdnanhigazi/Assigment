package com.niq.activate.controller;

import com.niq.activate.entity.Product;
import com.niq.activate.entity.ShopperShelves;
import com.niq.activate.repository.ProductRepository;
import com.niq.activate.repository.ShopperShelfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/external")
public class ExternalController {

    @Autowired
    private ShopperShelfRepository shopperShelfRepository;

    @Autowired
    private ProductRepository productMetadataRepository;

    @GetMapping("/products")
    public ResponseEntity<List<ProductResponse>> getProducts(
            @RequestParam String shopperId,
            @RequestParam(required = false) String category,
            @RequestParam(required = false) String brand,
            @RequestParam(defaultValue = "10") int limit) {

        if (limit > 100) {
            limit = 100;
        }

        List<ShopperShelves> shelves = shopperShelfRepository.findByShopperId(shopperId);
        List<ProductResponse> products = new ArrayList<>();

        for (ShopperShelves shelf : shelves) {
            Product metadata = productMetadataRepository.findByProductId(shelf.getProductId());
            if ((category == null || category.equals(metadata.getCategory())) &&
                    (brand == null || brand.equals(metadata.getBrand()))) {
                products.add(new ProductResponse(metadata, shelf.getRelevancyScore()));
            }
        }

        products.sort((a, b) -> Float.compare(b.getRelevancyScore(), a.getRelevancyScore()));
        return ResponseEntity.ok(products.stream().limit(limit).collect(Collectors.toList()));
    }
}
