package com.example.diplommaket.controller;

import com.example.diplommaket.entity.Item;
import com.example.diplommaket.entity.User;
import com.example.diplommaket.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BasketController {
    @Autowired
    private BasketService basketService;
    @RequestMapping("/basket")
    public String basketPage(Model model){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<Item> itemsInBasket = basketService.allItemsInBasket(user.getBasket().getId());
        model.addAttribute("allItemsInBasket", itemsInBasket);
        return "basket";
    }
}
