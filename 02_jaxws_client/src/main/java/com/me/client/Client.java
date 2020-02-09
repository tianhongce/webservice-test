package com.me.client;

import com.me.service.HelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();

        factoryBean.setAddress("http://localhost:8000/ws/hello");
        factoryBean.setServiceClass(HelloService.class);
        HelloService helloService = factoryBean.create(HelloService.class);

        String res = helloService.sayHello("jerry");
        System.out.println(res);
    }
}
