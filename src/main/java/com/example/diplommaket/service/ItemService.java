package com.example.diplommaket.service;

import com.example.diplommaket.entity.Item;
import com.example.diplommaket.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public Item loadItemById(Long id) {
        Item item = itemRepository.findByItemId(id);
        return item;
    }
    public boolean save(Item item) {
        itemRepository.save(item);
        return true;
    }
}
