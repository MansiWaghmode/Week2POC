package com.MiniService.week2poc.service;

import org.springframework.stereotype.Service;
import com.MiniService.week2poc.model.User;

@Service
public class UserService {
    public User getUserById(Long id){
        return new User(id ,"John","john.doe@gmail.com");
    }
}
