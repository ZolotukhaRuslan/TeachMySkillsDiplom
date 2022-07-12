package com.example.diplommaket.service;

import com.example.diplommaket.entity.Basket;
import com.example.diplommaket.entity.BasketItems;
import com.example.diplommaket.entity.User;
import com.example.diplommaket.repository.BasketItem;
import com.example.diplommaket.repository.BasketRepository;
import com.example.diplommaket.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BasketService {
    @Autowired
    private BasketRepository basketRepository;
    @Autowired
    private BasketItem basketItem;
    @Autowired
    private BasketService basketService;
    @Autowired
    private BasketItemService basketItemService;
    @Autowired
    private UserService userService;

    public boolean newBasket(Long id) {
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


    public void save(Basket basket) {
        basketRepository.save(basket);
    }


}
