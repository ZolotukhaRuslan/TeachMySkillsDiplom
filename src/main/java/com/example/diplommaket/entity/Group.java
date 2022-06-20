package com.example.diplommaket.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "productgroupe")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long groupId;
    private String groupName;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "groups")
    private Set<Product> products;

    public void setProducts(Set<Product> products) {
        this.products = products;
    }


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "groups")
    private Set<Item> items;

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}
