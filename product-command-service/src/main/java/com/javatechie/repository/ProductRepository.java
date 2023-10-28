package com.javatechie.repository;

import com.javatechie.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query("SELECT e FROM Product e WHERE e.uuid = :uuid")
    Product findByUUID(UUID uuid);
}
