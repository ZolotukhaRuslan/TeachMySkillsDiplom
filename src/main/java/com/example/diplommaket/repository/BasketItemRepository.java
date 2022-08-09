package com.example.diplommaket.repository;
import com.example.diplommaket.entity.BasketItems;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BasketItemRepository extends JpaRepository<BasketItems, Long> {
    BasketItems findBasketItemsById(Long id);
}
