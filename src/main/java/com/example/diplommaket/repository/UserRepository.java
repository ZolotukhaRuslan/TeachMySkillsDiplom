package com.example.diplommaket.repository;
import com.example.diplommaket.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface UserRepository extends JpaRepository<User, Long> {
    User findByLogin(String login);
    List<User> findByUsernameContains(String userName);
    User findUserById(Long id);
    void deleteByLogin(String login);
    @Override
    void deleteById(Long id);
    void deleteByUsername(String userName);
}
