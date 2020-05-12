package com.example.vuetest.service;

import com.example.vuetest.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> findUsersAll();
}
