package com.example.diplommaket.service;

import com.example.diplommaket.entity.OrderBasket;
import com.example.diplommaket.repository.OrderBasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderBasketService {
    @Autowired
    private OrderBasketRepository orderBasketRepository;

    public boolean save(OrderBasket orderBasket){
        orderBasketRepository.save(orderBasket);
        return true;
    }
    public OrderBasket createNewOrderBasket(){
        OrderBasket orderBasket = new OrderBasket();
        orderBasketRepository.save(orderBasket);
        return orderBasket;
    }

}
