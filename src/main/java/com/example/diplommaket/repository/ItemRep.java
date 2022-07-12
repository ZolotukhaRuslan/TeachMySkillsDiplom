package com.example.diplommaket.repository;

import com.example.diplommaket.entity.Item;
import com.example.diplommaket.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRep extends JpaRepository<Item, Long> {
    Item findByItemId(Long itemId);
}
