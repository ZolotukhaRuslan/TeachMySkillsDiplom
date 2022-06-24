package com.example.diplommaket.service;

import com.example.diplommaket.entity.Group;
import com.example.diplommaket.entity.Product;
import com.example.diplommaket.repository.GroupRepository;
import com.example.diplommaket.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class GroupService {

    @Autowired
    private GroupRepository groupRepository;

    public List<Group> allProductByCategoryMedicine(){
        return groupRepository.findAllById(Collections.singleton(1L));
    }

public List<Group> allProductByCategoryDietarySupplement(){
        return  groupRepository.findAllById(Collections.singleton(2L));
}
public List<Group> allProductByCategoryMedicalProduct(){
        return groupRepository.findAllById(Collections.singleton(3L));
}

public List<Group> allProductByCategoryCosmetic(){
        return groupRepository.findAllById(Collections.singleton(4L));
}

}
