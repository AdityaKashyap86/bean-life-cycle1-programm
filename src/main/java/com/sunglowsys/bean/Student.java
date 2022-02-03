package com.sunglowsys.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Student {
    public void start(){
        System.out.println ("started");
    }

    @PostConstruct
    public  void init() throws Exception{
        System.out.println ("student bean instantiated");
    }
    @PreDestroy
    public void destroy() throws Exception{
        System.out.println ("controller has been closed");
    }

    public void hello(){
        System.out.println ("hello");
    }
}

