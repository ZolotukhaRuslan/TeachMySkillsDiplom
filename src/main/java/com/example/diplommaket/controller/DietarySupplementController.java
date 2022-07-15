package com.example.diplommaket.controller;

import com.example.diplommaket.entity.*;
import com.example.diplommaket.repository.*;
import com.example.diplommaket.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class DietarySupplementController {
    @PersistenceContext
    private EntityManager em;
    @Autowired
    private GroupService groupService;
   @Autowired
   private BasketService basketService;

    @Autowired
    private ProductService productService;
    @RequestMapping("/dietarySupplement/{id}")
    public String addItemInBasket(@PathVariable Long id){
       basketService.addItemInBasket(id);
        return "redirect:/dietarySupplement";
  }

    @RequestMapping("/dietarySupplement")
    public String showDietarySupplements(Model model, HttpServletRequest request) {
        model.addAttribute("allDietarySupplement", groupService.allProductByCategoryDietarySupplement());
        return "dietarySupplement";
    }


}

