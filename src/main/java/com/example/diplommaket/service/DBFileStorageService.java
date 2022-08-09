package com.example.diplommaket.service;

import com.example.diplommaket.entity.Product;
import com.example.diplommaket.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
public class DBFileStorageService {
    /*
    @Autowired
    private ProductRepository productRepository;

    public Product storeFile(MultipartFile file, Long id) {
        // Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        try {
            Optional<Product> dbFile = productRepository.findById(id);
            dbFile.get().setImageProduct(file.getBytes());
            return productRepository.save(dbFile.get());
        } catch (IOException ex) {
        }
        return null;
    }

    public Product getFile(String fileId) {
        return productRepository.findById(Long.valueOf(fileId)).get();

    }*/
}

