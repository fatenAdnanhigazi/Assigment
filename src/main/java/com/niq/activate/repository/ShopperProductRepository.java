package com.niq.activate.repository;

import com.niq.activate.entity.ShopperProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopperProductRepository extends JpaRepository<ShopperProduct, Long> {
    List<ShopperProduct> findByShopperId(String shopperId);
}

