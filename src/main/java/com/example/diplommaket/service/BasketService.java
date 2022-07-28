package com.example.diplommaket.service;

import com.example.diplommaket.entity.*;
import com.example.diplommaket.repository.BasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<User> userFromDB = userService.loadUserById(id);
        if (userFromDB.get().getBasket() != null) {
            return false;
        }
        BasketItems basketItems = new BasketItems();
        basketItemService.save(basketItems);
        Basket basket = new Basket();
        basket.setBasketItem(basketItems);
        basketService.save(basket);
        userFromDB.get().setBasket(basket);
        userService.save(userFromDB.get());
        return true;
    }
    public boolean addItemInBasket(long id) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (user != null) {
            Optional<User> userFromDB = userService.loadUserById(user.getId());
            Optional<Product> product = productService.findProductById(id);
            Item item = itemService.loadItemById(product.get().getItems().getItemId());
            item.setBasketItems(userFromDB.get().getBasket().getBasketItem());
            itemService.save(item);
        }
        return true;
    }
    public void save(Basket basket) {
        basketRepository.save(basket);
    }
    public Optional<Basket> findBasketById(Long id) {
        return basketRepository.findById(id);
    }
    public List<Item> allItemsInBasket(Long id) {
        return basketService.findBasketById(id).get().getBasketItem().getItem();
    }

    public boolean delete(long id){
        basketRepository.deleteById(id);
        return true;
    }
    public void addQuantityToOrder(long id){
        Item item = itemService.loadItemById(id);
        int basketAmount = item.getQuantityToOrder();
        basketAmount +=1;
        item.setQuantityToOrder(basketAmount);
        itemService.save(item);
    }

    public void minusQuantityToOrder(long id){
        Item item = itemService.loadItemById(id);
        int basketAmount = item.getQuantityToOrder();
        if(basketAmount>0){
            basketAmount -=1;
            item.setQuantityToOrder(basketAmount);
            itemService.save(item);}
    }
}
