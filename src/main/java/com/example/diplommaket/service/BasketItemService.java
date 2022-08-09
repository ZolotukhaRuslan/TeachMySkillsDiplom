package com.example.diplommaket.service;
import com.example.diplommaket.entity.BasketItems;
import com.example.diplommaket.repository.BasketItemRepository;
import com.example.diplommaket.repository.ItemRepository;
import com.example.diplommaket.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BasketItemService {
    @Autowired
    private BasketItemRepository basketItemRepository;
    @Autowired
    private BasketItemRepository basketItem;
    public void save(BasketItems basketItems) {
        basketItem.save(basketItems);
    }
    public BasketItems findById(Long id) {
        return basketItemRepository.findBasketItemsById(id);
    }
}
