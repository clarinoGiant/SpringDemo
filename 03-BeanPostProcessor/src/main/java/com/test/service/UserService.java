package com.test.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.annotation.Order;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class UserService {
    private String name;

    public void print()
    {
        System.out.println("call UserService::print");
    }
}
