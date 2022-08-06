package com.example.diplommaket.controller;

import com.example.diplommaket.entity.Item;
import com.example.diplommaket.entity.Product;
import com.example.diplommaket.service.ItemService;
import com.example.diplommaket.service.ProductService;
import com.mysql.cj.jdbc.Blob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.*;
import java.sql.PreparedStatement;

import static java.lang.System.out;

@Controller
public class AdminItemController {
    @Autowired
    private ItemService itemService;
    @Autowired
    private ProductService productService;
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
    @RequestMapping("/showItem")
    public String OpenShowsItemPage(){
        return "showItem";
    }
    @GetMapping("/showItemById")
    public String showItem(){
        return "showItem";
    }
    @PostMapping("/showItemById")
    public String showItemPost(HttpServletRequest request, Model model){
        model.addAttribute("Item", itemService.loadItemById(Long.valueOf(request.getParameter("id"))));
        return "showItem";
    }

    @RequestMapping("/updateItem")
    public String openUpdateItemPage(){
        return "updateItem";
    }
    @GetMapping("/updateItemById")
    public String updateItem(HttpServletRequest request, Model model){
        model.addAttribute("Item", itemService.loadItemById(Long.valueOf(request.getParameter("id"))));
        return "updateItem";
    }
    @PostMapping("/updateItemById")
    public String updateItemPost(){

        return "updateItem";
    }






    @GetMapping("/addImage")
    public String addImage() {

        return "addImageItem";
    }
    @PostMapping("/addImage")
    public String addImagePost(Model model, HttpServletRequest request, @RequestParam ("file") MultipartFile file) throws IOException {

       /*
        Product product = productService.findProductById(1L).get();
        byte[] bytes = file.getBytes();
        BufferedOutputStream stream =
                new BufferedOutputStream(System.out);
        stream.write(bytes);
        stream.close();
        product.setImageProduct(bytes);
        productService.save(product);
        return "addImageItem";
    }*/
        return "addImageItem";
    }
}
