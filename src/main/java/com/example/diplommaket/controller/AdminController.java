package com.example.diplommaket.controller;

import com.example.diplommaket.entity.User;
import com.example.diplommaket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

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
        return "showUserById";
    }

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
        return "showUsersByName";
    }

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
    public String createNewUser(Model model) {
        model.addAttribute("usersForm", new User());
        return "createUser";
    }

    @PostMapping("/createNewUser")
    public String newUser(@ModelAttribute("usersForm") @Valid User usersForm, Model model) {
        if (!usersForm.getPassword().equals(usersForm.getPasswordConfirm())) {
            model.addAttribute("passwordError", "nonono");
            return "createUser";
        }
        if (!userService.saveUser(usersForm)) {
            model.addAttribute("usernameError", "use estn");
            return "createUser";
        }
        return "createUser";
    }

    @RequestMapping("/updateUserById")
    public String update() {
        return "updateUserById";
    }

    //this method needs improvement
    @RequestMapping("/updateUser")
    public String updateUserById(Model model, HttpServletRequest request) {
        Long id = Long.valueOf(request.getParameter("id"));
        model.addAttribute("User", userService.loadUserById(id).get());
        return "updateUserById";
    }

    @RequestMapping("/updateLogin/{id}")
    public String updateLogin(@PathVariable Long id, HttpServletRequest request) {
        User user = userService.loadUserById(id).get();
        user.setLogin(request.getParameter("login"));
        userService.save(user);
        return "updateLogin";
    }

    @RequestMapping("/updateUserByLogin")
    public String updateUserById() {
        return "updateUserByLogin";
    }

    @RequestMapping("/updateLoginUser/{login}")
    public String updateLoginUser(@PathVariable String login, HttpServletRequest request) {
        User user = userService.loadUserByLogin(login);
        String log = request.getParameter("logins");
        if (log != null) {
            user.setLogin(log);
            userService.save(user);
        }
        return "updateUserLogin";
    }

    @RequestMapping("/updateUserWithLogin")
    public String updateUserByLogin(Model model, HttpServletRequest request) {
        String login = request.getParameter("login");
        model.addAttribute("User", userService.loadUserByLogin(login));
        return "updateUserByLogin";
    }

    @RequestMapping("/updateUserName/{id}")
    public String updateUserNameById(@PathVariable Long id, HttpServletRequest request) {
        User user = userService.loadUserById(id).get();
        user.setUsername(request.getParameter("userName"));
        userService.save(user);
        return "updateUserNameById";
    }

    @RequestMapping("/updateUserNameByLogin/{login}")
    public String updateUserNameByLogin(@PathVariable String login, HttpServletRequest request) {
        User user = userService.loadUserByLogin(login);
        user.setUsername(request.getParameter("userName"));
        userService.save(user);
        return "updateUserNameByLogin";
    }


    @RequestMapping("/updateAge/{id}")
    public String updateAgeById(@PathVariable Long id, HttpServletRequest request){
        User user = userService.loadUserById(id).get();
       String age = request.getParameter("age");
       if(age!=null){
        user.setAge(Integer.parseInt(request.getParameter("age")));
        userService.save(user);}
        return "updateAgeById";
    }

    @RequestMapping("/updateAgeByLogin/{login}")
    public String updateAgeByLogin(@PathVariable String login, HttpServletRequest request){
        User user = userService.loadUserByLogin(login);
        String age = request.getParameter("age");
        if(age!=null){
        user.setAge(Integer.parseInt(request.getParameter("age")));
        userService.save(user);}
    return "updateAgeByLogin";
    }


}



