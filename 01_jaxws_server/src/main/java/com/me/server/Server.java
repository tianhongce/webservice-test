package com.me.server;

import com.me.service.impl.HelloServiceImpl;
import com.me.service.impl.UserServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.eclipse.jetty.io.EndPoint;

import javax.xml.ws.Endpoint;

public class Server {
    public static void main(String []args){

        //使用cxf发布服务
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        factoryBean.setAddress("http://localhost:8000/ws/hello");
        factoryBean.setServiceBean(new HelloServiceImpl());
        factoryBean.getInInterceptors().add(new LoggingInInterceptor());
        factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
        factoryBean.create();

        JaxWsServerFactoryBean factoryBean1 = new JaxWsServerFactoryBean();
        factoryBean1.setAddress("http://localhost:8000/ws/user");
        factoryBean1.setServiceBean(new UserServiceImpl());
        factoryBean1.getInInterceptors().add(new LoggingInInterceptor());
        factoryBean1.getOutInterceptors().add(new LoggingOutInterceptor());
        factoryBean1.create();

        //使用Endpoint发布服务
//        String address="http://localhost:8000/ws/hello";
//        Endpoint.publish(address,new HelloServiceImpl());

        System.out.println("发布服务成功 8000");

    }



}
