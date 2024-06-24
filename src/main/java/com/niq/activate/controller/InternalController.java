package com.niq.activate.controller;

import com.niq.activate.entity.Product;
import com.niq.activate.entity.ShopperShelves;
import com.niq.activate.repository.ProductRepository;
import com.niq.activate.repository.ShopperShelfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/internal")
public class InternalController {

    @Autowired
    private ShopperShelfRepository shopperShelfRepository;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/shopper-shelves")
    public ResponseEntity<?> addShopperShelves(@RequestBody ShopperShelfRequest request) {
        for (ShopperShelfRequest.ShelfItem item : request.getShelf()) {
            ShopperShelves shelf = new ShopperShelves();
            shelf.setShopperId(request.getShopperId());
            shelf.setProductId(item.getProductId());
            shelf.setRelevancyScore(item.getRelevancyScore());
            shopperShelfRepository.save(shelf);
        }
        return ResponseEntity.ok().build();
    }

    @PostMapping("/product-metadata")
    public ResponseEntity<?> addProductMetadata(@RequestBody Product metadata) {
        productRepository.save(metadata);
        return ResponseEntity.ok().build();
    }
}
