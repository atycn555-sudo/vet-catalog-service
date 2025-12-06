package com.example.vet_catalog_service.resolver;

import java.util.List;
import java.util.Optional;
import com.example.vet_catalog_service.model.Product;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;


import com.example.vet_catalog_service.repository.ProductRepository;

@Controller
public class ProductResolver {

    private final ProductRepository productRepository;

    public ProductResolver(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @QueryMapping
    public List<Product> allProducts() {
        // El repositorio ya sabe que tiene que devolver List<Product>
        return productRepository.findAll(); 
    }

    @QueryMapping
    public Optional<Product> productById(@Argument Integer id) {
        return productRepository.findById(id);
    }
}
