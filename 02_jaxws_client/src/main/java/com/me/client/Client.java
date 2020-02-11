package com.me.client;

import com.me.entity.User;
import com.me.service.HelloService;
import com.me.service.UserService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setAddress("http://localhost:8080/ws/hello");
        factoryBean.setServiceClass(HelloService.class);
        HelloService helloService = factoryBean.create(HelloService.class);
        String res = helloService.sayHello("jerry");
        System.out.println(res);

        JaxWsProxyFactoryBean factoryBean1 = new JaxWsProxyFactoryBean();
        factoryBean1.setAddress("http://localhost:8080/ws/user");
        factoryBean1.setServiceClass(UserService.class);
        UserService userService = factoryBean1.create(UserService.class);
        User res1 = userService.getUserById("1");
        System.out.println(res1);
    }
}
