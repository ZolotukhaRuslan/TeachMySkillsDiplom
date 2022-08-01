package com.example.diplommaket.controller;
import com.example.diplommaket.entity.Product;
import com.example.diplommaket.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
public class DietarySupplementController {
    @Autowired
    private GroupService groupService;
    @Autowired
    private BasketService basketService;
    @Autowired
    private ImageService imageService;
    @Autowired
    private ProductService productService;
    @RequestMapping("/dietarySupplement")
    public String showDietarySupplements(Model model) {
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getAuthorities());
        model.addAttribute("allDietarySupplement", groupService.allProductByCategoryDietarySupplement());
        return "dietarySupplement";
    }
    @RequestMapping("/dietarySupplement/{id}")
    public String addItemInBasket(@PathVariable Long id) throws IOException {
        basketService.addItemInBasket(id);
        basketService.addQuantityToOrder(id);
        return "redirect:/dietarySupplement";
    }
}

