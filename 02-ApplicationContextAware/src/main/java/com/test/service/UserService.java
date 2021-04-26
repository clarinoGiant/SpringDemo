package com.test.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

// @Service
@Getter
@Setter
public class UserService implements ApplicationContextAware, BeanNameAware {

    private ApplicationContext context;

    private String userName;

    @PostConstruct
    public void init(){
        userName = "AAA";
    }

    public void print(){
        System.out.println("call UserService::print(), userName = " + userName);
    }

    public  ApplicationContext getApplicationContext() {
        return context;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public AddressService getAddressService()
    {
        return context.getBean("addressService", AddressService.class);
    }

    public void setBeanName(String s) {
        System.out.println("setBeanName:" + s);
    }
}
