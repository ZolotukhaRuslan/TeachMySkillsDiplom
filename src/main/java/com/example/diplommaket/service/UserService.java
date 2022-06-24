package com.example.diplommaket.service;

import com.example.diplommaket.entity.Group;
import com.example.diplommaket.entity.Product;
import com.example.diplommaket.entity.Role;
import com.example.diplommaket.entity.User;
import com.example.diplommaket.repository.GroupRepository;
import com.example.diplommaket.repository.ProductRepository;
import com.example.diplommaket.repository.RoleRepository;
import com.example.diplommaket.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

@Service
public class UserService implements UserDetailsService {

    Group f = new Group();
    @PersistenceContext
    private EntityManager em;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private GroupRepository groupRepository;




    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return user;
    }

    public boolean saveUser(User user) {
        User userFromDB = userRepository.findByUsername(user.getUsername());
        if (userFromDB != null) {
            return false;
        }
        user.setRoles(Collections.singleton(new Role(1L, "ROLE_USER")));
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return true;
    }


    public List<User> allUsers() {
        return userRepository.findAll();
    }

    @Transactional
    public List<Group> allGroup() {
        return groupRepository.findAll();
    }

    public List<Product> allProduct() {
        return  productRepository.findAll();


    }
    public List<Group> category(){
        return groupRepository.findAllById(Collections.singleton(1L));
    }
}