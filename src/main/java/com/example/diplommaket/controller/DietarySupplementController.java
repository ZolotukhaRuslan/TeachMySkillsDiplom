package com.example.diplommaket.controller;

import com.example.diplommaket.repository.GroupRepository;
import com.example.diplommaket.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DietarySupplementController {
@Autowired
private GroupService groupService;

   @RequestMapping("/dietarySupplement")
    public String showDietarySupplements(Model model){
       model.addAttribute("allDietarySupplement", groupService.allProductByCategoryDietarySupplement());
       return "dietarySupplement";
    }
}
