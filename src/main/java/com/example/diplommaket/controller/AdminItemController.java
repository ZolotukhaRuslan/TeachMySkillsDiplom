package com.example.diplommaket.controller;

import com.example.diplommaket.entity.Item;
import com.example.diplommaket.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class AdminItemController {
    @Autowired
    private ItemService itemService;
    @RequestMapping("/operationWithItem")
    public String handlerItems(){
        return "handlerItem";
    }

    @RequestMapping("/showAllItems")
    public String showAllItem(Model model){
model.addAttribute("Items", itemService.allItem());
        return "showAllItem";
    }
    @RequestMapping("/deleteItem")
    public String deleteItem(){
        return "deleteItem";
    }
    @RequestMapping("/deleteItemById")
    public String deleteItemById(HttpServletRequest request){
        Long id = Long.valueOf(request.getParameter("id"));
        itemService.deleteItemById(id);
        return "deleteItem";
    }
    @GetMapping("/createItem")
    public String createItem(Model model){
        model.addAttribute("itemForm", new Item());
        return "createItem";
    }
    @PostMapping("/createItem")
    public String createItemPost(@ModelAttribute("itemForm")@Valid Item itemForm){
        itemService.save(itemForm);
        return "createItem";
    }

}
