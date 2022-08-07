package com.example.diplommaket.repository;

import com.example.diplommaket.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findProductById(Long id);
}
