package com.example.diplommaket.controller;

import com.example.diplommaket.entity.Product;
import com.example.diplommaket.service.ProductService;
import com.example.diplommaket.testImage.HibernateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.swing.*;
import javax.validation.Valid;
import java.io.UnsupportedEncodingException;
import java.util.Base64;

@Controller
public class AdminProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private HibernateUtil hibernateUtil;
    @RequestMapping("/operationWithProduct")
    public String handlerProduct(){

        hibernateUtil.testSave();
        return "handlerProduct";
    }
    @RequestMapping("/showProductById")
    public String showProductById(){
        return "showProductById";
    }

    @RequestMapping("/showAllProduct")
    public String showAllProduct(Model model) throws UnsupportedEncodingException {
        model.addAttribute("allProducts",  productService.getAllProduct());

        byte[] encodeBase64 = Base64.getEncoder().encode(productService.findProductById(1L).getImageProduct());
        String base64Encoded = new String(encodeBase64, "UTF-8");
        model.addAttribute("image", base64Encoded);
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

@RequestMapping("/deleteProduct")
public String deleteProduct(){
        return "deleteProduct";
}
@RequestMapping("/deleteProductById")
    public String delete(HttpServletRequest request){
        Long id = Long.valueOf(request.getParameter("id"));
        productService.delete(id);
        return "deleteProduct";
}

}
