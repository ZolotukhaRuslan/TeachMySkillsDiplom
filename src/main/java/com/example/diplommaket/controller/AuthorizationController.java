package com.example.diplommaket.controller;

import com.example.diplommaket.entity.User;
import com.example.diplommaket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class AuthorizationController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String homePage() {
        return "homePage";
    }

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "registrationPage";
    }

    @PostMapping(value = "/registration")
    public String addUser(@ModelAttribute("userForm") @Valid User userForm, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "registrationPage";
        }
        if (!userForm.getPassword().equals(userForm.getPasswordConfirm())) {
            model.addAttribute("passwordError", "nonono");
            return "registrationPage";
        }
        if (!userService.saveUser(userForm)) {
            model.addAttribute("usernameError", "use estn");
            return "registrationPage";
        }
        return "redirect:/";
    }
}