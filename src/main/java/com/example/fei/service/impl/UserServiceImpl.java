package com.example.fei.service.impl;

import com.example.fei.domain.User;
import com.example.fei.mapper.UserMapper;
import com.example.fei.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User selectUser(long userId) {
        return userMapper.selectUser(userId);
    }
}