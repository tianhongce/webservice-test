package com.me.client;

import com.me.service.HelloService;
import com.me.service.HelloServiceImplService;

public class Client {
    public static void main(String[] args) {
        HelloServiceImplService helloServiceImplService = new HelloServiceImplService();
        HelloService helloServiceImplPort = helloServiceImplService.getHelloServiceImplPort();
        String res = helloServiceImplPort.sayHello("heha");
        System.out.println(res);

    }
}
