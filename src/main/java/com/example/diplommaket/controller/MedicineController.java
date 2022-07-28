package com.example.diplommaket.controller;

import com.example.diplommaket.service.BasketService;
import com.example.diplommaket.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MedicineController {
    @Autowired
    private GroupService groupService;
    @Autowired
    private BasketService basketService;
    @RequestMapping("/medicine")
    public String showMedicineProduct(Model model) {
        model.addAttribute("allMedicine", groupService.allProductByCategoryMedicine());
        return "medicine";
    }
    @RequestMapping("/medicine/{id}")
    public String addItemInBasket(@PathVariable Long id) {
        basketService.addItemInBasket(id);
        basketService.addQuantityToArder(id);
        return "redirect:/medicine";
    }
}
