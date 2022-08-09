package com.example.diplommaket.service;

import com.example.diplommaket.entity.*;
import com.example.diplommaket.repository.BasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class BasketService {
    @Autowired
    private BasketRepository basketRepository;
    @Autowired
    private BasketService basketService;
    @Autowired
    private BasketItemService basketItemService;
    @Autowired
    private UserService userService;
    @Autowired
    private ItemService itemService;
    @Autowired
    private ProductService productService;
    public boolean CreateNewBasket(Long id) {
        User userFromDB = userService.loadUserById(id);
        if (userFromDB.getBasket() != null) {
            return false;
        }
        BasketItems basketItems = new BasketItems();
        basketItemService.save(basketItems);
        Basket basket = new Basket();
        basket.setBasketItem(basketItems);
        basketService.save(basket);
        userFromDB.setBasket(basket);
        userService.save(userFromDB);
        return true;
    }
    public boolean newBasket(Long id) {
        User userFromDB = userService.loadUserById(id);
        BasketItems basketItems = new BasketItems();
        basketItemService.save(basketItems);
        Basket basket = new Basket();
        basket.setBasketItem(basketItems);
        basketService.save(basket);
        userFromDB.setBasket(basket);
        userService.save(userFromDB);
        return true;
    }
    public boolean addItemInBasket(long id) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (user != null) {
            User userFromDB = userService.loadUserById(user.getId());
            Product product = productService.findProductById(id);
            Item item = itemService.loadItemById(product.getItems().getItemId());
            item.setBasketItems(userFromDB.getBasket().getBasketItem());
            itemService.save(item);
        }
        return true;
    }
    public void save(Basket basket) {
        basketRepository.save(basket);
    }
    public Basket findBasketById(Long id) {
        return basketRepository.findBasketById(id);
    }
    public List<Item> allItemsInBasket(Long id) {
        return basketService.findBasketById(id).getBasketItem().getItem();
    }
    public BasketItems getBasketItems(Long id) {
        return basketService.findBasketById(id).getBasketItem();
    }
    public boolean delete(long id) {
        basketRepository.deleteById(id);
        return true;
    }
    public void addQuantityToOrder(long id) {
        Item item = itemService.loadItemById(id);
        int basketAmount = item.getQuantityToOrder();
        basketAmount += 1;
        item.setQuantityToOrder(basketAmount);
        itemService.save(item);
    }
    public void minusQuantityToOrder(long id) {
        Item item = itemService.loadItemById(id);
        int basketAmount = item.getQuantityToOrder();
        if (basketAmount > 0) {
            basketAmount -= 1;
            item.setQuantityToOrder(basketAmount);
            itemService.save(item);
        }
    }
}
