package com.spring.SpringSecurityJWT;

import com.spring.SpringSecurityJWT.pojo.User;
import com.spring.SpringSecurityJWT.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringSecurityJwtApplication {

    @Autowired
    private UserRepository userRepository;
    @PostConstruct
    public void initUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(101, "ABC", "Admin@123", "abc@gmail.com"));
        users.add(new User(102, "PQR", "Admin@234", "pqr@gmail.com"));
        users.add(new User(103, "XYZ", "Admin@345", "xyz@gmail.com"));
        users.add(new User(104, "WER", "Admin@456", "wer@gmail.com"));

        userRepository.saveAll(users);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtApplication.class, args);
    }

}
