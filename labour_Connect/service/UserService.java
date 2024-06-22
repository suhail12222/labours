package com.labours.labour_Connect.service;

import com.labours.labour_Connect.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired

    private UserRepository userRepository;

    public User registerUser(User user) {
        // Logic for registering a user
//        final S save = userRepository.save(user);
//        return save;
user= UserRepository.save(user);
return user;

    }
}
