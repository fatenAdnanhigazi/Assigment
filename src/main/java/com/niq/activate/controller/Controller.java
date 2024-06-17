package com.niq.activate.controller;

import com.niq.activate.entity.Product;
import com.niq.activate.entity.Shopper;
import com.niq.activate.repository.ProductRepository;
import com.niq.activate.repository.ShopperRepository;
import com.niq.activate.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private ShopperRepository shopperRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;
    private List<String> productsId;


    @PostMapping("/internal/shopper")
    public void addShopper(@RequestBody Shopper shopper) {
        shopperRepository.save(shopper);

    }

    @PostMapping("/internal/product")
    public void addProduct(@RequestBody Product product) {
        productRepository.save(product);
    }

    @PostMapping("/parseProductIds")
    public List<String> parseProductIds(@RequestBody String jsonArray) throws IOException {
        productsId = productService.parseProductIds(jsonArray);

        return productsId;
    }

    @GetMapping("/external/products")
    public List<Product> getProducts(@RequestParam String shopperId,
                                     @RequestParam(required = false) String category,
                                     @RequestParam(required = false) String brand,
                                     @RequestParam(defaultValue = "10") int limit) {
        // Fetch shopper
        Shopper shopper = shopperRepository.findById(shopperId).orElseThrow();

        List<Product> products = productRepository.findAllById(productsId);

        if (category != null) {
            products = products.stream().filter(p -> p.getCategory().equals(category)).collect(Collectors.toList());
        }

        if (brand != null) {
            products = products.stream().filter(p -> p.getBrand().equals(brand)).collect(Collectors.toList());
        }

        return products.stream().limit(limit).collect(Collectors.toList());
    }
}
