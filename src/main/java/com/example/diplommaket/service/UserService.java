package com.example.diplommaket.service;

import com.example.diplommaket.entity.Group;
import com.example.diplommaket.entity.Role;
import com.example.diplommaket.entity.User;
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
import java.util.Collections;
@Service
public class UserService implements UserDetailsService {


    @PersistenceContext
    private EntityManager em;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

     public Group group = new Group();


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("User not found");
        }
        return user;
    }

    public boolean saveUser(User user){
        User userFromDB = userRepository.findByUsername(user.getUsername());
if(userFromDB != null){
    return false;
}
        user.setRoles(Collections.singleton(new Role(1L, "ROLE_USER")));
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return true;
    }


    public void  goAll(){
        group.getGroupId();
    }

}
