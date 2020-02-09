package com.me.server;

import com.me.service.impl.HelloServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Server {
    public static void main(String []args){
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();

        factoryBean.setAddress("http://localhost:8000/ws/hello");
        factoryBean.setServiceBean(new HelloServiceImpl());
        factoryBean.getInInterceptors().add(new LoggingInInterceptor());
        factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
        factoryBean.create();

        System.out.println("发布服务成功 8000");

    }



}
