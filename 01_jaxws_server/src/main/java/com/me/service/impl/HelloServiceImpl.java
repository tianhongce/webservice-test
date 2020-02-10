package com.me.service.impl;

import com.me.service.HelloService;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace="http://service.me.com/")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name + " hello! ";
    }
}
