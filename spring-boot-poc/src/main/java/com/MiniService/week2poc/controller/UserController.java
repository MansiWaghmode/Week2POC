package com.MiniService.week2poc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MiniService.week2poc.model.User;
import com.MiniService.week2poc.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        logger.info("Received request to fetch user with id: {}",id);

        User user = userService.getUserById(id);
        
        logger.info("Returning user details for id:{}",id);
        return user;
    }
}
