package com.niq.activate.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.niq.activate.entity.Product;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    public List<String> parseProductIds(String jsonArray) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Product> products = objectMapper.readValue(jsonArray, new TypeReference<List<Product>>() {
        });
        return products.stream().map(Product::getProductId).collect(Collectors.toList());
    }
}

