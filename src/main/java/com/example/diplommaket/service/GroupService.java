package com.example.diplommaket.service;

import com.example.diplommaket.entity.Group;
import com.example.diplommaket.entity.Item;
import com.example.diplommaket.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
@Service
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;
    public List<Group> allGroup() {
        return groupRepository.findAll();
    }
    public boolean addGroup(Group group) {
        groupRepository.save(group);
        return true;
    }
    public Optional<Group> searchGroupById(Long id) {
        return groupRepository.findById(id);
    }
    public Optional<Group> searchGroupByName(String name) {
        return groupRepository.findGroupByGroupName(name);
    }
    public boolean editGroup(Long id, String name){
        Optional<Group> group = groupRepository.findById(id);
        group.get().setGroupName(name);
        groupRepository.save(group.get());
        return true;
    }
    public boolean deleteGroupById(Long id){
        groupRepository.deleteById(id);
        return true;
    }
    public List<Group> allProductByCategoryMedicine() {
        return groupRepository.findAllById(Collections.singleton(1L));
    }
    public List<Group> allProductByCategoryDietarySupplement() {
        return groupRepository.findAllById(Collections.singleton(2L));
    }
    public List<Group> allProductByCategoryMedicalProduct() {
        return groupRepository.findAllById(Collections.singleton(3L));
    }
    public List<Group> allProductByCategoryCosmetic() {
        return groupRepository.findAllById(Collections.singleton(4L));
    }
}
