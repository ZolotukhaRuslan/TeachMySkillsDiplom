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
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.net.http.HttpRequest;

@Controller
public class AdminController {
    @Autowired
    private UserService userService;

    @RequestMapping("/admins")
    public String admin() {
        return "administration";
    }
    @RequestMapping("/operationWithUsers")
    public String usersOperation() {
        return "handlerAdminOperation";
    }
    @RequestMapping("/showAllUsers")
    public String showAllUsers(Model model) {
        model.addAttribute("allUsers", userService.allUsers());
        return "allUsers";
    }
    @RequestMapping("/showUserById")
    public String showUserById() {
        return "loadUserById";
    }
    @RequestMapping("/loadUserById")
    public String loadUserById(Model model, HttpServletRequest request) {
        Long id = Long.valueOf(request.getParameter("id"));
        model.addAttribute("User", userService.loadUserById(id).get());
        return "showUserById";}
    @RequestMapping("/showUserByLogin")
    public String showUserByLogin() {
        return "loadUserByLogin";
    }
    @RequestMapping("/loadUserByLogin")
    public String loadUserByLogin(Model model, HttpServletRequest request) {
        String login = request.getParameter("login");
        model.addAttribute("User", userService.loadUserByLogin(login));
        return "showUserByLogin";
    }
    @RequestMapping("/showUsersByName")
    public String loadUsersByName() {
        return "loadUsersByName";
    }
    @RequestMapping("/loadUsersByName")
    public String showUsersByName(Model model, HttpServletRequest request) {
        String name = request.getParameter("nameUser");
        model.addAttribute("User", userService.findByUsernameContains(name));
        return "showUsersByName";}
    @RequestMapping("/deleteUserById")
    public String deleteUserById() {
        return "deleteUserById";
    }
    @RequestMapping("/loadUserByIdForDelete")
    public String loadUserByIdForDelete(Model model, HttpServletRequest request) {
        Long id = Long.valueOf(request.getParameter("id"));
        model.addAttribute("User", userService.loadUserById(id).get());
        return "deleteUserById";
    }
    @RequestMapping("/loadUserByLoginForDelete")
    public String loadUserByLoginForDelete(Model model, HttpServletRequest request) {
        String login = (request.getParameter("login"));
        model.addAttribute("User", userService.loadUserByLogin(login));
        return "deleteUserByLogin";
    }
    @RequestMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
        return "deleteUserById";
    }
    @RequestMapping("/deleteUserLogin/{login}")
    public String deleteUserLogin(@PathVariable String login) {
        Long id = userService.loadUserByLogin(login).getId();
        userService.deleteUserById(id);
        return "deleteUserByLogin";
    }
    @RequestMapping("/deleteUserByLogin")
    public String deleteUserByLogin() {
        return "deleteUserByLogin";
    }


@GetMapping("/createNewUser")
    public String createNewUser(Model model){
        model.addAttribute("UserForm", new User());
        return null;
}
@PostMapping("/createNewUser")
    public String newUser(@ModelAttribute("usersForm") @Valid User userForm, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "";
        }
        if (!userForm.getPassword().equals(userForm.getPasswordConfirm())) {
            model.addAttribute("passwordError", "nonono");
            return null;
        }
        if (!userService.saveUser(userForm)) {
            model.addAttribute("usernameError", "use estn");
            return "";
        }
        return "";
    }


    /*
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
*/
}
