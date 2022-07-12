package com.example.diplommaket.controller;

import com.example.diplommaket.entity.BasketItems;
import com.example.diplommaket.entity.Item;
import com.example.diplommaket.repository.BasketItem;
import com.example.diplommaket.repository.ItemRep;
import com.example.diplommaket.repository.ProductRepository;
import com.example.diplommaket.service.BasketItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Controller
public class AddBasket {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private BasketItem basketItem;
    @Autowired
  private  BasketItemService basketItemService;
    @Autowired
    private ItemRep itemRep;
    @RequestMapping("/addBasketItem")
    public String addBasket(HttpServletRequest req, Long id){
BasketItems basket = new BasketItems();
Optional<Item> item ;
item = itemRep.findById(1L);
basket.getItem().add(item.get());
        System.out.println("1");
        System.out.println(basket.getItem().add(item.get()));
        return "dietarySupplement";
    }
}
