package com.example.diplommaket.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@Data
public class Product {
    public Product(Long id){
        this.id = id;
    }
    public Product(Long id, String name){
        this.id = id;
        this.productName = name;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String productName;
@ManyToOne(optional=false, cascade=CascadeType.ALL)
@ToString.Exclude
@EqualsAndHashCode.Exclude
    private  Group groups ;



}
