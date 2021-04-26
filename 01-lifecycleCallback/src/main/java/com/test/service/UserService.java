package com.test.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Getter
@Setter
public class UserService{

    @Value("AAAA")
    private String name;

    @PostConstruct
    private void init11()
    {
        System.out.println("call init(): @PostConstruct");
    }

    @PreDestroy
    private void destroy11()
    {
        System.out.println("call destroy: @PreDestroy");
    }

    public void print() {
        System.out.println("call print(), name = " + name);
    }
}

