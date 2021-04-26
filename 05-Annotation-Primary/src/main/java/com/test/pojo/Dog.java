package com.test.pojo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Qualifier("Dog")
@Component
public class Dog extends Pet {
    public void print(){
        System.out.println("Dog");
    }
}
