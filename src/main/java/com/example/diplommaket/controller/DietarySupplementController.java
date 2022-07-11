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
    private BasketService basketService;

    @Autowired
    private ProductService productService;
    @RequestMapping("/dietarySupplement/{id}")
    public String addItem(@PathVariable Long id){

        System.out.println(id);
      //  basketItemService.add();
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Optional<User> userFromDB = userService.loadUserById(id);
if(userFromDB.get().getBasket() == null){
    BasketItems basketItems = new BasketItems();
    basketItemService.save(basketItems);
    Basket basket = new Basket();
    basket.setBasketItem(basketItems);
    basketService.save(basket);
    userFromDB.get().setBasket(basket);
    System.out.println( userFromDB.get().getBasket());
   userService.save(userFromDB.get());



   // userFromDB.get().setBasket(basket);
   // userService.saveUser();

}

        return "redirect:/dietarySupplement";
  }

    @RequestMapping("/dietarySupplement")
    public String showDietarySupplements(Model model, HttpServletRequest request) {
        model.addAttribute("allDietarySupplement", groupService.allProductByCategoryDietarySupplement());
        return "dietarySupplement";
    }


}

