package com.niq.activate.controller;

import com.niq.activate.entity.Product;
import com.niq.activate.repository.ProductRepository;
import com.niq.activate.repository.ShopperShelfRepository;
import com.niq.activate.service.ShopperShelfService;
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
    @Autowired
    private ShopperShelfService shopperShelfService;

    @PostMapping("/shopper-shelves")
    public ResponseEntity<?> addShopperShelves(@RequestBody ShopperShelfRequest requests) {
        shopperShelfService.saveShopperShelves(requests);
        return ResponseEntity.ok().build();
    }


    @PostMapping("/product-metadata")
    public ResponseEntity<?> addProductMetadata(@RequestBody Product metadata) {
        productRepository.save(metadata);
        return ResponseEntity.ok().build();
    }
}
