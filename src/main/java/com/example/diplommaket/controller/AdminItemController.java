package com.example.diplommaket.controller;

import com.example.diplommaket.entity.Item;
import com.example.diplommaket.service.BasketItemService;
import com.example.diplommaket.service.GroupService;
import com.example.diplommaket.service.ItemService;
import com.example.diplommaket.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
@Controller
public class AdminItemController {
    @Autowired
    private ItemService itemService;
    @Autowired
    private BasketItemService basketItemService;
    @Autowired
    private ProductService productService;
    @RequestMapping("/operationWithItem")
    public String handlerItems() {
        return "handlerItem";
    }
    @RequestMapping("/showAllItems")
    public String showAllItem(Model model) {
        model.addAttribute("Items", itemService.allItem());
        return "showAllItem";
    }
    @RequestMapping("/deleteItem")
    public String deleteItem() {
        return "deleteItem";
    }
    @RequestMapping("/deleteItemById")
    public String deleteItemById(HttpServletRequest request) {
        Long id = Long.valueOf(request.getParameter("id"));
        itemService.deleteItemById(id);
        return "deleteItem";
    }
    @GetMapping("/createItem")
    public String createItem(Model model) {
        model.addAttribute("itemForm", new Item());
        return "createItem";
    }
    @PostMapping("/createItem")
    public String createItemPost(@ModelAttribute("itemForm") @Valid Item itemForm) {
        itemService.save(itemForm);
        return "createItem";
    }
    @RequestMapping("/showItem")
    public String OpenShowsItemPage() {
        return "showItem";
    }
    @GetMapping("/showItemById")
    public String showItem(HttpServletRequest request, Model model) {
        model.addAttribute("Item", itemService.loadItemById(Long.valueOf(request.getParameter("id"))));
        return "showItem";
    }
    @RequestMapping("/updateItem")
    public String openUpdateItemPage() {
        return "updateItem";
    }
    @GetMapping("/updateItemById")
    public String updateItem(HttpServletRequest request, Model model) {
        model.addAttribute("Item", itemService.loadItemById(Long.valueOf(request.getParameter("id"))));
        return "updateItem";
    }
    @GetMapping("/updateCoast/{id}")
    public String updateCoastItem(Model model, @PathVariable Long id) {
        model.addAttribute("Item", itemService.loadItemById(id));
        return "updateCoastItem";
    }
    @PostMapping("/updateCoast/{id}")
    public String updateCoastItemPost(Model model, @PathVariable Long id, HttpServletRequest request) {
        model.addAttribute("Item", itemService.loadItemById(id));
        Item item = itemService.loadItemById(id);
        item.setCoast(Double.parseDouble(request.getParameter("coast")));
        itemService.save(item);
        return "updateCoastItem";
    }
    @GetMapping("/updateAmount/{id}")
    public String updateAmountItem(Model model, @PathVariable Long id) {
        model.addAttribute("Item", itemService.loadItemById(id));
        return "updateAmountItem";
    }
    @PostMapping("/updateAmount/{id}")
    public String updateAmountItemPost(Model model, @PathVariable Long id, HttpServletRequest request) {
        model.addAttribute("Item", itemService.loadItemById(id));
        Item item = itemService.loadItemById(id);
        item.setAmountProduct(Long.parseLong(request.getParameter("amount")));
        itemService.save(item);
        return "updateAmountItem";
    }
    @GetMapping("/updateBasketItemId/{id}")
    public String updateBasketItemId(Model model, @PathVariable Long id) {
        model.addAttribute("Item", itemService.loadItemById(id));
        return "updateBasketItemId";
    }
    @PostMapping("/updateBasketItemId/{id}")
    public String updateBasketItemIdPost(Model model, @PathVariable Long id, HttpServletRequest request) {
        model.addAttribute("Item", itemService.loadItemById(id));
        Item item = itemService.loadItemById(id);
        item.setBasketItems(basketItemService.findById(Long.valueOf(request.getParameter("basketItemId"))));
        itemService.save(item);
        return "updateBasketItemId";
    }
    @GetMapping("/updateProductId/{id}")
    public String updateProductId(Model model, @PathVariable Long id) {
        model.addAttribute("Item", itemService.loadItemById(id));
        return "updateProductId";
    }
    @PostMapping("/updateProductId/{id}")
    public String updateProductIdPost(Model model, @PathVariable Long id, HttpServletRequest request) {
        model.addAttribute("Item", itemService.loadItemById(id));
        Item item = itemService.loadItemById(id);
        item.setProduct(productService.findProductById(Long.valueOf(request.getParameter("productId"))));
        item.setGroup(productService.findProductById(Long.valueOf(request.getParameter("productId"))).getGroups());
        itemService.save(item);
        return "updateProductId";
    }
}
