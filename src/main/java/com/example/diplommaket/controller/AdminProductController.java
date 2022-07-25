package com.example.diplommaket.controller;

import com.example.diplommaket.entity.Product;
import com.example.diplommaket.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class AdminProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping("/operationWithProduct")
    public String handlerProduct(){
        return "handlerProduct";
    }
    @RequestMapping("/showProductById")
    public String showProductById(){
        return "showProductById";
    }

    @RequestMapping("/showAllProduct")
    public String showAllProduct(Model model) {
        model.addAttribute("allProducts",  productService.getAllProduct());
     return "showAllProduct";
    }
@GetMapping("/createProduct")
    public String createProduct(Model model){
        model.addAttribute("productForm", new Product());
        return "createProduct";
}
@PostMapping("/createProduct")
    public String createProductPost(@ModelAttribute("productForm") @Valid Product productForm){
        productService.addProduct(productForm);
        return "createProduct";
}
}
