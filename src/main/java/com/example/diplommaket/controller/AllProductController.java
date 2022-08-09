package com.example.diplommaket.controller;
import com.example.diplommaket.service.BasketService;
import com.example.diplommaket.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AllProductController {
    @Autowired
    private BasketService basketService;
    @Autowired
    private ItemService itemService;
    @RequestMapping("/allProduct")
    private String allProduct(Model model) {
        model.addAttribute("allItem", itemService.allItem());
        System.out.println(itemService.allItem());
        return "allProduct";
    }
    @RequestMapping("/allProduct/{id}")
    public String addItemInBasket(@PathVariable Long id) {
        basketService.addItemInBasket(id);
        basketService.addQuantityToOrder(id);
        return "redirect:/allProduct";
    }
}
