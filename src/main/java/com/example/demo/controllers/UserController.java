package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/api")
public class UserController {
    @Autowired
    UserService userService;

    //POST
    @PostMapping("/users")
        public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
