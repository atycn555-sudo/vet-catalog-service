package com.example.vet_catalog_service.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.vet_catalog_service.model.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    
    List<Product> findByNameContainingIgnoreCase(String name);
}
