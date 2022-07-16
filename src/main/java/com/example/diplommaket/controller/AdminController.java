package com.example.diplommaket.controller;

import com.example.diplommaket.entity.Group;
import com.example.diplommaket.entity.User;
import com.example.diplommaket.repository.GroupRepository;
import com.example.diplommaket.service.BasketService;
import com.example.diplommaket.service.GroupService;
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
public class AdminController {
    @Autowired
    private GroupService groupService;
    @Autowired
    private UserService userService;
    @Autowired
    private BasketService basketService;

    @RequestMapping("/admins")
    public String admin() {
        return "administration";
    }
    @RequestMapping("/operationWithUsers")
    public String usersOperation(){
        return "handlerAdminOperation";
    }

    @RequestMapping("/showAppGroups")
    public String showAllGrops(Model model) {
        model.addAttribute("allGroups", groupService.allGroup());
        return "administration";
    }

    @RequestMapping("/addNewGroup")
    public String addNewGroup() {
        return "administration";
    }

    @GetMapping("/addNewGroup")
    public String registration(Model model) {
        model.addAttribute("groupForm", new Group());
        return "newGroups";
    }

    @PostMapping(value = "/addNewGroup")
    public String addUser(@ModelAttribute("groupForm") @Valid Group groupForm, Model model) {
        groupService.addGroup(groupForm);
        return "redirect:/";
    }

    @RequestMapping("/findGroupById")
    public String searchGroupById() {
        System.out.println(groupService.searchGroupById(4L));
        System.out.println(groupService.searchGroupByName("medicine"));
        return "redirect:/";
    }

    @RequestMapping("/editGroupById")
    public String editGroupById() {
        String a = "cardio";
        Long b = 5L;
        groupService.editGroup(b, a);
        return "redirect:/";
    }

    @RequestMapping("/deleteGroupById")
    public String deleteGroupById() {
        groupService.deleteGroupById(5L);
        return "redirect:/";
    }


    @RequestMapping("/editRole")
    public String editRole() {
        //userService.editRoleById(3L);

        return "redirect:/";
    }

}
