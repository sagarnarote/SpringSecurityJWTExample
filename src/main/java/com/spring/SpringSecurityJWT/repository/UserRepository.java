package com.spring.SpringSecurityJWT.repository;

import com.spring.SpringSecurityJWT.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String Username);
}
