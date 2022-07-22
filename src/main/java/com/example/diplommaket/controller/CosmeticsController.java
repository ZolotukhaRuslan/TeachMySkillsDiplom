package com.example.diplommaket.controller;

import com.example.diplommaket.service.BasketService;
import com.example.diplommaket.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CosmeticsController {
    @Autowired
    private GroupService groupService;
    @Autowired
    private BasketService basketService;
    @RequestMapping("/cosmetics")
    public String showAllCosmetics(Model model)
    { model.addAttribute("allCosmetics" , groupService.allProductByCategoryCosmetic());
        return "cosmetics";
    }
    @RequestMapping("/cosmetics/{id}")
    public String addItemInBasket(@PathVariable Long id) {
        basketService.addItemInBasket(id);
        return "redirect:/cosmetics";
    }
}
