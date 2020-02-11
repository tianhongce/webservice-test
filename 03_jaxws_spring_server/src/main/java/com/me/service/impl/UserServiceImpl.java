package com.me.service.impl;

import com.me.entity.User;
import com.me.service.UserService;

import javax.jws.WebService;

@WebService(targetNamespace="http://service.me.com/")
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(String userId) {
        User user = new User("1","jerry",3);
        return user;
    }

    @Override
    public String getIdbyUser(User user) {
        return "2";
    }
}
