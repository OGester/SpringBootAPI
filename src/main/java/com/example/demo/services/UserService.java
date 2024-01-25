package com.example.demo.services;

import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    //create new user
    public User createUser(User user){
        return userRepository.save(user);
    }

    //get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //update user by id
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    //get user by id
    public User getUserById(String id) {
        return userRepository.findById(id).get();
    }

    //delete specific user by id
    public String deleteUserById(String id) {
        userRepository.deleteById(id);
        return "User successfully deleted!";
    }

}



