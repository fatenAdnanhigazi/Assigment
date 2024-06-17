package com.niq.activate.controller;

import com.niq.activate.dto.ProductMetadataDTO;
import com.niq.activate.dto.ShopperProductDTO;
import com.niq.activate.entity.ProductMetadata;
import com.niq.activate.entity.ShopperProduct;
import com.niq.activate.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/internal")
public class InternalController {
    @Autowired
    private ProductService productService;

    @PostMapping("/shopper-products")
    public ResponseEntity<Void> uploadShopperProducts(@RequestBody List<ShopperProductDTO> products) {
        List<ShopperProduct> shopperProducts = products.stream()
                .map(dto -> new ShopperProduct(dto.getShopperId(), dto.getProductId(), dto.getRelevancyScore()))
                .collect(Collectors.toList());
        productService.saveShopperProducts(shopperProducts);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/product-metadata")
    public ResponseEntity<Void> uploadProductMetadata(@RequestBody ProductMetadataDTO metadata) {
        ProductMetadata productMetadata = new ProductMetadata(metadata.getProductId(), metadata.getCategory(), metadata.getBrand());
        productService.saveProductMetadata(productMetadata);
        return ResponseEntity.ok().build();
    }
}
