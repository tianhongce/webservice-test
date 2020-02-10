package com.me.client;

import com.me.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        HelloService helloService = (HelloService)applicationContext.getBean("helloService");
        System.out.println(helloService);

        String res = helloService.sayHello("Tom");
        System.out.println(res);
    }
}
