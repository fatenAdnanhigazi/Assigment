package com.niq.activate.repository;

import com.niq.activate.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByProductId(String productId);
}

