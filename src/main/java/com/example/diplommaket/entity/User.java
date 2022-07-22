package com.example.diplommaket.entity;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
@Entity
@Table(name = "users")
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String username;
    private String password;
    private int age;
    private String mail;
    private String gender;
    @Transient
    private String passwordConfirm;

    @ManyToMany(fetch = FetchType.EAGER)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Role> roles;

    @OneToOne
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Basket basket;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
return roles;
    }
    @Override
    public String getUsername() {
        return username;
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
        return true;
    }
}
