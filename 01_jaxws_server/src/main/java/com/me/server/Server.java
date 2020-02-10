package com.me.server;

import com.me.service.impl.HelloServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.eclipse.jetty.io.EndPoint;

import javax.xml.ws.Endpoint;

public class Server {
    public static void main(String []args){
//        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
//
//        factoryBean.setAddress("http://localhost:8000/ws/hello");
//        factoryBean.setServiceBean(new HelloServiceImpl());
//        factoryBean.getInInterceptors().add(new LoggingInInterceptor());
//        factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
//        factoryBean.create();

        String address="http://localhost:8000/ws/hello";
        Endpoint.publish(address,new HelloServiceImpl());

        System.out.println("发布服务成功 8000");

    }



}
