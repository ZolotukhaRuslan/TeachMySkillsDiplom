package com.example.diplommaket.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Data
@NoArgsConstructor
@Entity
public class BasketItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String address;

    @OneToMany(mappedBy = "basketItems", cascade = CascadeType.ALL)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Item> item ;

    @OneToOne(mappedBy = "basketItem")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Basket basket;
}



