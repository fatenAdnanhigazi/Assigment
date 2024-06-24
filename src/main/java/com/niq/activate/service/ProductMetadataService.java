package com.niq.activate.service;

import com.niq.activate.entity.Product;
import com.niq.activate.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductMetadataService {

    @Autowired
    private ProductRepository productMetadataRepository;

    public void saveProductMetadata(Product metadata) {
        productMetadataRepository.save(metadata);
    }
}
