package com.test.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Setter
@Getter
public class User {

    @Autowired
    @Qualifier("Dog")
    private Pet pet;

    public void test()
    {
        pet.print();
    }
}
