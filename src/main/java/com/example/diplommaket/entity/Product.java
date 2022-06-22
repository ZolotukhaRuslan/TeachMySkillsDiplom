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
    private  Group groups ;



}
