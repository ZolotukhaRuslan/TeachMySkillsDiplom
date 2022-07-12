package com.example.diplommaket.repository;

import com.example.diplommaket.entity.BasketItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketItem extends JpaRepository<BasketItems, Long> {


}
