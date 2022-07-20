package com.example.diplommaket.service;

import com.example.diplommaket.entity.*;
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
import java.util.*;

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
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = userRepository.findByLogin(login);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return user;
    }
    public User loadUserByLogin(String login){
        return userRepository.findByLogin(login);
    }
    public List<User> findByUsernameContains(String userName){
        return userRepository.findByUsernameContains(userName);
    }
    public Optional<User> loadUserById(Long id) {
        return userRepository.findById(id);
    }

    public boolean saveUser(User user) {
        User userFromDB = userRepository.findByLogin(user.getLogin());
        if (userFromDB != null) {
            return false;
        }
        user.setRoles(Collections.singleton(new Role(1L, "ROLE_USER")));
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return true;
    }

    public void save(User user){
        userRepository.save(user);
    }

    public boolean deleteUserById(Long id) {
        userRepository.deleteById(id);
        return true;
    }
    public boolean deleteUserByLogin(String login){
        userRepository.deleteByLogin(login);
        return true;
    }

    public boolean deeByUserName(String userName) {
        userRepository.deleteByUsername(userName);
        return true;
    }

    public void editRoleById(Long id) {
        Optional<User> user = userRepository.findById(id);
        Set<Role> roless = user.get().getRoles();
        Set<Role> newRole = new HashSet<>();
        newRole.add(new Role(1L, "ROLE_USER"));
        user.get().setRoles(newRole);
        userRepository.save(user.get());
    }

    public List<User> allUsers() {
        return userRepository.findAll();
    }


    //Delete after
    @Transactional
    public List<Group> allGroup() {
        return groupRepository.findAll();
    }

    public List<Product> allProduct() {
        return productRepository.findAll();


    }

    public List<Group> category() {
        return groupRepository.findAllById(Collections.singleton(1L));
    }
    //up to this line


}