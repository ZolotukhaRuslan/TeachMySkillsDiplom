package com.example.diplommaket.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String productName;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "group_id", nullable = false)
    private Group groups;

    public Group getGroup() {
        return groups;
    }

    public void setGroup(Group groups) {
        this.groups = groups;
    }

    @OneToOne(optional = false)
    @JoinColumn(name = "item_id", unique = true, nullable = false, updatable = false)
    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}


