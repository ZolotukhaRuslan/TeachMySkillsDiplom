package com.example.diplommaket.service;

import com.example.diplommaket.entity.BasketItems;
import com.example.diplommaket.entity.Item;
import com.example.diplommaket.repository.BasketItem;
import com.example.diplommaket.repository.ItemRep;
import com.example.diplommaket.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BasketItemService {
@Autowired
    private BasketItem basketItem;
@Autowired
private ProductRepository productRepository;
@Autowired
private ItemRep itemRep;


public void add(){
    Optional<BasketItems> b = Optional.of(new BasketItems());
   Item it = itemRep.findByItemId(1L);
    b = basketItem.findById(1L);
    it.setBasketItems(b.get());
    itemRep.save(it);

}
public void save(BasketItems basketItems){
    basketItem.save(basketItems);
}
}
