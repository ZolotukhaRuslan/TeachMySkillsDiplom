package com.example.diplommaket.controller;

import com.example.diplommaket.entity.Group;
import com.example.diplommaket.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class AdminGroupController {
    @Autowired
    private GroupService groupService;

    @RequestMapping("/operationWithGroupProduct")
    public String getGroupOperation() {
        return "handlerGroup";
    }

    @RequestMapping("/showGroup")
    public String showGroup(Model model) {
        model.addAttribute("Group", groupService.allGroup());
        return "showGroup";
    }

    @GetMapping("/createGroup")
    public String createNewGroup(Model model) {
        model.addAttribute("groupForm", new Group());
        return "newGroup";
    }

    @PostMapping("/createGroup")
    public String newGroup(@ModelAttribute("groupForm") @Valid Group groupForm, Model model, BindingResult bindingResult) {
        groupService.addGroup(groupForm);
        return "redirect:/operationWithGroupProduct";
    }
}
