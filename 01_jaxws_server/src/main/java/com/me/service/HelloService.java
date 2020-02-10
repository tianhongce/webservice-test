package com.me.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace="http://service.me.com/")
public interface HelloService {
    @WebMethod
    public String sayHello(String name);
}
