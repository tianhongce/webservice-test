package com.me.service;

import com.me.entity.User;

import javax.jws.WebService;

@WebService(targetNamespace="http://service.me.com/")
public interface UserService {
    public User getUserById(String userId);
    public String getIdbyUser(User user);
}
