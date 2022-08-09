package com.example.diplommaket.controller;


import com.example.diplommaket.entity.Product;
import com.example.diplommaket.service.DBFileStorageService;
import com.example.diplommaket.service.ProductService;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;


@Controller
public class ImageConroller {
    @Autowired
    private ProductService productService;
    @GetMapping("/img/{id}")
    public void getImage(@PathVariable("id") Long id, HttpServletResponse response,  Model model) {
        productService.writeImageToRespose(id, response);


    }

    @GetMapping("/addImage")
    public String addArt(){
        return "addImageProduct";
    }
    @PostMapping("/addImage")
    public String upload(@RequestParam("test") MultipartFile file) {
   // public String postAddArticle(Model model,@RequestParam MultipartFile file , HttpServletRequest request) {
        byte[] bArray = null;

        try {
            bArray = new byte[file.getBytes().length];
            int i = 0;
            for(byte b : file.getBytes()){
                bArray[i++] = b;
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        Product product = productService.findProductById(2L);
        product.setImageProduct(bArray);
        productService.save(product);


        return "addImageProduct";
    }

}
