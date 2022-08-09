package com.example.diplommaket.controller;
import com.example.diplommaket.entity.*;
import com.example.diplommaket.service.*;
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
@Controller
public class BasketController {
    @Autowired
    private BasketService basketService;
    @Autowired
    private OrderBasketService orderBasketService;
    @Autowired
    private UserService userService;
    @Autowired
    private BasketItemService basketItemService;
    @GetMapping("/basket")
    public String basketPage(Model model, HttpServletRequest request) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<Item> itemsInBasket = basketService.allItemsInBasket(userService.loadUserById(user.getId()).getBasket().getId());
        model.addAttribute("allItemsInBasket", itemsInBasket);
        double allPrice = 0;
        for (int a = 0; a < itemsInBasket.size(); a++) {
            allPrice += itemsInBasket.get(a).getQuantityToOrder() * itemsInBasket.get(a).getCoast();
        }
        model.addAttribute("AllPrice", allPrice);
        BasketItems basketItems = basketItemService.findById(user.getBasket().getBasketItem().getId());
        System.out.println(request.getParameter("address") + "1");
        return "basket";
    }
    @PostMapping("/basket")
    private String basketPagePost(Model model, HttpServletRequest request) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        BasketItems basketItems = basketItemService.findById(user.getBasket().getBasketItem().getId());
        basketItems.setAddress(request.getParameter("address"));
        basketItemService.save(basketItems);
        System.out.println(request.getParameter("address") + "2");
        return "redirect:/submitBasket";
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
    public String submitBasket(Model model, HttpServletRequest request) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        OrderBasket orderBasket = orderBasketService.createNewOrderBasket();
        orderBasket.setAddress(basketItemService.findById(user.getBasket().getBasketItem().getId()).getAddress());
        System.out.println(basketItemService.findById(user.getBasket().getBasketItem().getId()).getAddress());
        orderBasket.setBasket(user.getBasket());
        orderBasketService.save(orderBasket);
        basketService.newBasket(user.getId());
        model.addAttribute("numberOrder", orderBasket);
        return "submitBasket";
    }
}
