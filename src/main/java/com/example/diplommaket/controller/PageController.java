package com.example.diplommaket.controller;

import com.example.diplommaket.entity.Group;
import com.example.diplommaket.entity.User;
import com.example.diplommaket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;


@Controller
public class PageController {
    @Autowired
    private UserService userService;


    @RequestMapping("/bad")
    public String bad() {
        return "basePage";
    }

    @GetMapping("/go")
    public String userList(Model model) {
        model.addAttribute("allUsers", userService.allUsers());
        return "list";
    }
@GetMapping("/group")
    public String groupList(Model model) {
model.addAttribute("allGroup",userService.allGroup());
return "list";
}
    @GetMapping("/product")
    public String productList(Model model) {
        model.addAttribute("allProduct", userService.allProduct());
        return "list";


    }
}
