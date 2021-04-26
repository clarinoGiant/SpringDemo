package com.test.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component
public class Pet {
    @Value("BBB")
    private String petName;

    public void print() {
        System.out.println("Pet name: " + petName);
    }
}

