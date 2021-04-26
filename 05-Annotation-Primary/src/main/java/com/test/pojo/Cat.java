package com.test.pojo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Qualifier("Cat")
@Component
public class Cat extends Pet {
    public void print(){
        System.out.println("cat");
    }
}
