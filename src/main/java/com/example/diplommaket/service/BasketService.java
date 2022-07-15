package com.example.diplommaket.service;

import com.example.diplommaket.entity.Basket;
import com.example.diplommaket.entity.BasketItems;
import com.example.diplommaket.entity.Item;
import com.example.diplommaket.entity.User;
import com.example.diplommaket.repository.BasketItemRepository;
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

    public boolean addItemInBasket(long id){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(user!=null){
            Optional<User> userFromDB = userService.loadUserById(user.getId());
           List<Item> itemFromUserDB = userFromDB.get().getBasket().getBasketItem().getItem();
           itemFromUserDB.add(itemService.loadItemById(1L));
           userFromDB.get().getBasket().getBasketItem().setItem(itemFromUserDB);
           userService.save(userFromDB.get());

        }
        return true;
    }


    public void save(Basket basket) {
        basketRepository.save(basket);
    }


}
