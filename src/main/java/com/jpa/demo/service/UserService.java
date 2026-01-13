package com.jpa.demo.service;

import com.jpa.demo.entity.User;
import com.jpa.demo.repositories.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private userRepository userRepository;

    public void saveUser(User user){
        User user1 = userRepository.save(user);
        System.out.println(user1.getUserId());

    }
}
