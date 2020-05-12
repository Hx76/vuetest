package com.example.vuetest.controller;

import com.example.vuetest.service.UserService;
import com.example.vuetest.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserControllerTest {
    @Autowired
    private UserService userService;

    @Test
    void find(){
        System.out.println("**************");
        System.out.println(userService.findUsersAll());
    }

}