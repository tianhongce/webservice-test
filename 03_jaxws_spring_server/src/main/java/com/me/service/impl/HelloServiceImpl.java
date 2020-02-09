package com.me.service.impl;

import com.me.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name + " hello! ";
    }
}
