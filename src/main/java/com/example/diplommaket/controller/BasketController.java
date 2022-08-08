package com.example.diplommaket.controller;

import com.example.diplommaket.entity.*;
import com.example.diplommaket.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class BasketController {
    @Autowired
    private BasketService basketService;
    @Autowired
    private OrderBasketService orderBasketService;
    @Autowired
    private UserService userService;


    @RequestMapping("/basket")
    public String basketPage(Model model) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<Item> itemsInBasket = basketService.allItemsInBasket(userService.loadUserById(user.getId()).get().getBasket().getId());
        model.addAttribute("allItemsInBasket", itemsInBasket);
        double allPrice = 0;
        for (int a = 0; a < itemsInBasket.size(); a++) {
            allPrice += itemsInBasket.get(a).getQuantityToOrder() * itemsInBasket.get(a).getCoast();
        }
        model.addAttribute("AllPrice", allPrice);
        return "basket";
    }

    @RequestMapping("/add/{id}")
    public String add(@PathVariable Long id) {
        basketService.addQuantityToOrder(id);
        return "redirect:/basket";
    }

    @RequestMapping("/minus/{id}")
    public String minus(@PathVariable long id) {
        basketService.minusQuantityToOrder(id);
        return "redirect:/basket";
    }

    @RequestMapping("/submitBasket")
    public String submitBasket() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        OrderBasket orderBasket = orderBasketService.createNewOrderBasket();
        orderBasket.setBasket(user.getBasket());
        orderBasketService.save(orderBasket);
        basketService.newBasket(user.getId());
        return "submitBasket";
    }

}
