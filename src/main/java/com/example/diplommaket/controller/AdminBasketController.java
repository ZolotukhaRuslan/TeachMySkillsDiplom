package com.example.diplommaket.controller;

import com.example.diplommaket.entity.Basket;
import com.example.diplommaket.entity.BasketItems;
import com.example.diplommaket.service.BasketItemService;
import com.example.diplommaket.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminBasketController {
    @Autowired
    private BasketItemService basketItemService;
    @Autowired
    private BasketService basketService;
    @RequestMapping("/operationWithBasket")
    public String createBasketItem(){
        return "handlerBasketItem";
    }
    @RequestMapping("/createBasketItem")
    public String basketItemPage(){
        return "createBasketItem";
    }
@GetMapping("/createNewBasketItem")
    public String createNewBasketItem(Model model){
    BasketItems basketItem = new BasketItems();
    Basket basket = new Basket();
    basketItemService.save(basketItem);
    basket.setBasketItem(basketItem);
    basketService.save(basket);
    model.addAttribute("Basket", basket);
        return "createBasketItem";
}
@RequestMapping("/deleteBasket")
    public String deleteBasket(){
        return "deleteBasket";
}
@RequestMapping("/deleteBasketById")
    public String delete(HttpServletRequest request){
        long id = Long.parseLong(request.getParameter("id"));
        basketService.delete(id);
        return "deleteBasket";
}
}
