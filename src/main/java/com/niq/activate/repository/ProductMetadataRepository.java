package com.niq.activate.repository;

import com.niq.activate.entity.ProductMetadata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductMetadataRepository extends JpaRepository<ProductMetadata, Long> {
    List<ProductMetadata> findByCategory(String category);

    List<ProductMetadata> findByBrand(String brand);

    ProductMetadata findByProductId(String productId);

}
