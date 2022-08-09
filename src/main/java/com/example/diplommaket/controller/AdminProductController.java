package com.example.diplommaket.controller;

import com.example.diplommaket.entity.Product;
import com.example.diplommaket.service.ImageService;
import com.example.diplommaket.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.UnsupportedEncodingException;
@Controller
public class AdminProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private ImageService imageService;
    @RequestMapping("/operationWithProduct")
    public String handlerProduct() {
        return "handlerProduct";
    }
    @RequestMapping("/showProductById")
    public String showProductById() {
        return "showProductById";
    }
    @RequestMapping("/showAllProduct")
    public String showAllProduct(Model model){
        model.addAttribute("allProducts", productService.getAllProduct());
        return "showAllProduct";
    }
    @GetMapping("/createProduct")
    public String createProduct(Model model) {
        model.addAttribute("productForm", new Product());
        return "createProduct";
    }
    @PostMapping("/createProduct")
    public String createProductPost(@ModelAttribute("productForm") @Valid Product productForm) {
        productService.addProduct(productForm);
        return "createProduct";
    }
    @RequestMapping("/deleteProduct")
    public String deleteProduct() {
        return "deleteProduct";
    }
    @RequestMapping("/deleteProductById")
    public String delete(HttpServletRequest request) {
        Long id = Long.valueOf(request.getParameter("id"));
        productService.delete(id);
        return "deleteProduct";
    }
    @RequestMapping("/addImageById")
    public String showProduct(Model model, HttpServletRequest request){
        model.addAttribute("product", productService.findProductById(Long.valueOf(request.getParameter("id"))));
        System.out.println(productService.findProductById(Long.valueOf(request.getParameter("id"))));
        return "addImageProduct";
    }
    @RequestMapping("/addImageProduct")
    public String addImage() {
        return "addImageProduct";
    }
    @GetMapping("/addImage/{id}")
    public String upload(@PathVariable Long id, Model model){
        model.addAttribute("product", productService.findProductById(id));
        return "addImageProduct";
    }
    @PostMapping("/addImage/{id}")
    public String uploadPost(@RequestParam("test") MultipartFile file, @PathVariable Long id, Model model) throws UnsupportedEncodingException {
        model.addAttribute("product", productService.findProductById(id));
        imageService.uploadImage(file, id);
        return "addImageProduct";
    }
}

