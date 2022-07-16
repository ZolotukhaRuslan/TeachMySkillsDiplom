package com.example.diplommaket.repository;

import com.example.diplommaket.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long > {
    User findByLogin(String login);

    Optional<User> findById(Long id);

    @Override
    void deleteById(Long id);
    void deleteByUsername(String userName);


}
