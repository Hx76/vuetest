package com.example.vuetest.controller;

import com.example.vuetest.pojo.User;
import com.example.vuetest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/findAll")
    public List<User> findAll(){
        return userService.findUsersAll();
    }
}
