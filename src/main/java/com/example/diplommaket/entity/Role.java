package com.example.diplommaket.entity;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "roles")
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Role implements GrantedAuthority {
    public Role(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Role(Long id) {
        this.id = id;
    }

    @Id
    private Long id;
    private String name;
    @Transient
    @ManyToMany(mappedBy = "roles", fetch = FetchType.EAGER)
    private Set<User> users;
    @Override
    public String getAuthority() {
        return getName();
    }
}
