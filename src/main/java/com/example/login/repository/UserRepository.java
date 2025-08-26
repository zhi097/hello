package com.example.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.login.domain.User;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsernameAndPassword(String username, String password);
}
