package com.example.diplommaket.service;

import com.example.diplommaket.entity.Group;
import com.example.diplommaket.entity.Product;
import com.example.diplommaket.repository.GroupRepository;
import com.example.diplommaket.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private GroupRepository groupRepository;
    public boolean addProduct(Product product) {
        productRepository.save(product);
        return true;
    }
    public Optional<Product> findProductById(Long id) {
        return productRepository.findById(id);
    }
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
}
