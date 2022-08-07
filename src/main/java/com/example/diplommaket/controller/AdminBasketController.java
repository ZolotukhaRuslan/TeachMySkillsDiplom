package com.example.diplommaket.controller;

import com.example.diplommaket.entity.Basket;
import com.example.diplommaket.entity.BasketItems;
import com.example.diplommaket.entity.Item;
import com.example.diplommaket.service.BasketItemService;
import com.example.diplommaket.service.BasketService;
import com.example.diplommaket.service.ItemService;
import com.example.diplommaket.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private ItemService itemService;
    @Autowired
    private ProductService productService;

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

    @RequestMapping("/updateBasketItem")
    public String showPageUpdateBasketItemById(){
        return "updateBasketItem";
    }


    @GetMapping("/updateBasketItemById")
    public String showBasketItem(Model model, HttpServletRequest request){
        model.addAttribute("allItemsInBasket", basketService.allItemsInBasket(Long.parseLong(request.getParameter("id"))));
        return "updateBasketItem";
    }

    @GetMapping("/addProduct")
    public String addProductInBasketItem(Model model, @PathVariable Long id, @ModelAttribute Basket basket){
        model.addAttribute("allItemsInBasket", basketService.allItemsInBasket(id));
        return "addProductInBasketItem";
    }
    @PostMapping("/addProduct")
    String addProductInBasketItemPost(Model model, @PathVariable Long id, HttpServletRequest request, @ModelAttribute Basket basket){
        model.addAttribute("allItemsInBasket", basketService.allItemsInBasket(basket.getId()));
        Item item = itemService.loadItemById(productService.findProductById(Long.valueOf(request.getParameter("productId"))).getId());
        BasketItems basketItems = basketService.findBasketById(id).get().getBasketItem();
        basketItems.getItem().add(item);
        basketItemService.save(basketItems);
        return "addProductInBasketItem";
    }
}
