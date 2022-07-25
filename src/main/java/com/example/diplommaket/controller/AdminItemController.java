package com.example.diplommaket.controller;

import com.example.diplommaket.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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
}
