package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "/api/users")
public class UserController {
    @Autowired
    UserService userService;

    //POST new user
    @PostMapping()
        public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    //GET all users
    @GetMapping ("/all")
        public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    //PUT update user
    @PutMapping()
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    //GET specific user by id
    @RequestMapping(value ="/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    //DELETE specific user
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUserById(@PathVariable String id) {
        return userService.deleteUserById(id);
    }


}
