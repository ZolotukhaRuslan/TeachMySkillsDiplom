package com.example.diplommaket.repository;
import com.example.diplommaket.entity.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BasketRepository extends JpaRepository<Basket, Long> {
   Basket findBasketById(Long id);
}
