package com.example.diplommaket.repository;

import com.example.diplommaket.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GroupRepository extends JpaRepository<Group, Long> {
   Optional<Group> findById(Long id);

   Optional<Group> findGroupByGroupName(String name);

   @Override
   void deleteById(Long aLong);
}
