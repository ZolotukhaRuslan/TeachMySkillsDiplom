package com.example.diplommaket.controller;

import com.example.diplommaket.entity.Basket;
import com.example.diplommaket.entity.BasketItems;
import com.example.diplommaket.entity.Item;
import com.example.diplommaket.entity.User;
import com.example.diplommaket.service.BasketService;
import com.example.diplommaket.service.ItemService;
import com.example.diplommaket.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@Controller
public class BasketController {
    @Autowired
    private BasketService basketService;



    @RequestMapping("/basket")
    public String basketPage(Model model) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<Item> itemsInBasket = basketService.allItemsInBasket(user.getBasket().getId());
        model.addAttribute("allItemsInBasket", itemsInBasket);
        double allPrice = 0;
        for(int a=0; a< itemsInBasket.size(); a++){
        allPrice +=itemsInBasket.get(a).getQuantityToOrder()*itemsInBasket.get(a).getCoast();
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

}
