package com.example.diplommaket.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long itemId;
    private double coast;

  //  @OneToOne(optional = false, mappedBy = "item")
  //  public Product product;

  //  public Product getProduct() {
    /*    return product;
    }
 //   @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
  //  @JoinColumn(name = "group_id", nullable = false)
    private Group groups;

    public Group getGroups() {
        return groups;
    }

    public void setGroups(Group groups) {
        this.groups = groups;
    }*/
}


