package com.example.diplommaket.entity;
import lombok.*;
import javax.persistence.*;
@Entity
@NoArgsConstructor
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long itemId;
    private double coast;
    private long amountProduct;
    private int quantityToOrder;
    @OneToOne
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Product product;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "group_id", nullable = false)
    private Group group;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "basket_items_id", referencedColumnName = "id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private BasketItems basketItems;
}


