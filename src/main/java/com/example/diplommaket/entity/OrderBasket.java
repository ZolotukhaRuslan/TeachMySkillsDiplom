package com.example.diplommaket.entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
@Entity
@NoArgsConstructor
@Data
public class OrderBasket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String address;
    @OneToOne(mappedBy = "orderBasket")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Basket basket;
}
