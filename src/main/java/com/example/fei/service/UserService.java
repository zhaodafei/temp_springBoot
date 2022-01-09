package com.example.fei.service;

import com.example.fei.domain.User;


public interface UserService {
    User selectUser(long userId);

    User selectUserTwo(long userId);

    User selectUserThree(long userId);

    User selectUserFour(User user);

    User selectUserFive(User user);
}
