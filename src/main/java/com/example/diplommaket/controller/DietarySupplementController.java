package com.example.diplommaket.controller;

import com.example.diplommaket.entity.*;
import com.example.diplommaket.repository.BasketItem;
import com.example.diplommaket.repository.GroupRepository;
import com.example.diplommaket.repository.ItemRep;
import com.example.diplommaket.repository.ProductRepository;
import com.example.diplommaket.service.BasketItemService;
import com.example.diplommaket.service.GroupService;
import com.example.diplommaket.service.ProductService;
import com.example.diplommaket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.security.Principal;
import java.util.*;

@Controller
public class DietarySupplementController {
    @PersistenceContext
    private EntityManager em;
    @Autowired
    private GroupService groupService;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private BasketItemService basketItemService;
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private ItemRep itemRep;
    @Autowired
    private BasketItem basketItem;
    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;
    @RequestMapping("/dietarySupplement/{id}")
    public String addIt(@PathVariable Long id){

        System.out.println(id);
      //  basketItemService.add();
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println(user.getUsername());
        System.out.println(user.getId());

        return "redirect:/dietarySupplement";
  }

    @RequestMapping("/dietarySupplement")
    public String showDietarySupplements(Model model, HttpServletRequest request) {
        model.addAttribute("allDietarySupplement", groupService.allProductByCategoryDietarySupplement());
        return "dietarySupplement";
    }


}

