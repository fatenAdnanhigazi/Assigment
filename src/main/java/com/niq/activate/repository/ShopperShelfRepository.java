package com.niq.activate.repository;

import com.niq.activate.entity.ShopperShelves;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShopperShelfRepository extends JpaRepository<ShopperShelves, Long> {
    List<ShopperShelves> findByShopperId(String shopperId);
}
