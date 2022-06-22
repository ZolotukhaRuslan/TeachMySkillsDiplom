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
    public Group(Long id){
        this.id = id;
    }
    public Group(Long id, String name){
        this.id = id;
        this.groupName = name;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String groupName;

@OneToMany(mappedBy = "groups", fetch=FetchType.EAGER)
    private Set<Product> products;

}
