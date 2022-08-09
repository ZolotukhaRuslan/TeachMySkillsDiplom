package com.example.diplommaket.repository;
import com.example.diplommaket.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
public interface GroupRepository extends JpaRepository<Group, Long> {
    Group findGroupById(Long id);
    Group findGroupByGroupName(String name);
    @Override
    void deleteById(Long id);
}
