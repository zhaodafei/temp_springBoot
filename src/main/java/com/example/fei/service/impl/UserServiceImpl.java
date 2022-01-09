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

    @Override
    public User selectUserTwo(long userId) {
        return userMapper.selectUserTwo(userId);
    }

    @Override
    public User selectUserThree(long userId) {
        return userMapper.selectUserThree(userId);
    }

    @Override
    public User selectUserFour(User user) {
        return userMapper.selectUserFour(user);
    }

    @Override
    public User selectUserFive(User user) {
        return userMapper.selectUserFive(user);
    }
}
