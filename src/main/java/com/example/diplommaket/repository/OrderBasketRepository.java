package com.example.diplommaket.repository;

import com.example.diplommaket.entity.OrderBasket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderBasketRepository extends JpaRepository<OrderBasket, Long> {
}
