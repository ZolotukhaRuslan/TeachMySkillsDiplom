package com.example.diplommaket.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @OneToOne(mappedBy = "basket")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private User user;

    @OneToOne
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private BasketItems basketItem;

    @ManyToMany
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<OrderBasketEntity> orderBasketEntity;
}
