package com.example.diplommaket.service;

import com.example.diplommaket.entity.Role;
import com.example.diplommaket.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public void save(Role role){
        roleRepository.save(role);
    }

    public Optional<Role> findRoleById(Long id){
        return roleRepository.findById(id);

    }

}
