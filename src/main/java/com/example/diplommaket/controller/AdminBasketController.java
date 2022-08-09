package com.example.diplommaket.controller;

import com.example.diplommaket.entity.*;
import com.example.diplommaket.service.BasketItemService;
import com.example.diplommaket.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
@Controller
public class AdminBasketController {
    @Autowired
    private BasketItemService basketItemService;
    @Autowired
    private BasketService basketService;
    @RequestMapping("/operationWithBasket")
    public String createBasketItem() {
        return "handlerBasketItem";
    }
    @RequestMapping("/createBasketItem")
    public String basketItemPage() {
        return "createBasketItem";
    }
    @GetMapping("/createNewBasketItem")
    public String createNewBasketItem(Model model) {
        BasketItems basketItem = new BasketItems();
        Basket basket = new Basket();
        basketItemService.save(basketItem);
        basket.setBasketItem(basketItem);
        basketService.save(basket);
        model.addAttribute("Basket", basket);
        return "createBasketItem";
    }
    @RequestMapping("/deleteBasket")
    public String deleteBasket() {
        return "deleteBasket";
    }
    @RequestMapping("/deleteBasketById")
    public String delete(HttpServletRequest request) {
        long id = Long.parseLong(request.getParameter("id"));
        basketService.delete(id);
        return "deleteBasket";
    }
    @RequestMapping("/updateBasketItem")
    public String showPageUpdateBasketItemById() {
        return "updateBasketItem";
    }
    @GetMapping("/updateBasketItemById")
    public String showBasketItem(Model model, HttpServletRequest request) {
        model.addAttribute("allItemsInBasket", basketService.allItemsInBasket(Long.parseLong(request.getParameter("id"))));
        model.addAttribute("BasketItemId", basketService.findBasketById(Long.valueOf(request.getParameter("id"))).getBasketItem());
        return "updateBasketItem";
    }
    @RequestMapping("/sumbitBasket")
    public String sumditBasket() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        user.getBasket();
        return "sumbitBasket";
    }
}
