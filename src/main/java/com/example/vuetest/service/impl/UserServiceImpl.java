package com.example.vuetest.service.impl;

import com.example.vuetest.mapper.UserMapper;
import com.example.vuetest.pojo.User;
import com.example.vuetest.pojo.UserExample;
import com.example.vuetest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findUsersAll() {
        UserExample example = new UserExample();
        return this.userMapper.selectByExample(example);
    }
}
