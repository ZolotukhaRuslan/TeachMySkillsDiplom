package com.example.diplommaket.controller;

import com.example.diplommaket.entity.Product;
import com.example.diplommaket.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Controller
public class ImageConroller {
    @Autowired
    private ProductService productService;
    @GetMapping("/img/{id}")
    public void getImage(@PathVariable("id") Long id, HttpServletResponse response) {
        productService.writeImageToRespose(id, response);
    }
    @GetMapping("/addImage")
    public String addArt() {
        return "addImageProduct";
    }
    @PostMapping("/addImage")
    public String upload(@RequestParam("test") MultipartFile file) {
        byte[] bArray = null;
        try {
            bArray = new byte[file.getBytes().length];
            int i = 0;
            for (byte b : file.getBytes()) {
                bArray[i++] = b;
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        Product product = productService.findProductById(1L);
        product.setImageProduct(bArray);
        productService.save(product);
        return "addImageProduct";
    }
}
