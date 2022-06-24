package com.example.diplommaket.controller;

import com.example.diplommaket.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MedicalProductsController {
    @Autowired
    private GroupService groupService;
    @RequestMapping("/medicalProducts")
    public String showMedicalProducts(Model model){
        model.addAttribute("allMedicalProducts" ,groupService.allProductByCategoryMedicalProduct());
        return "medicalProducts";
    }
}
