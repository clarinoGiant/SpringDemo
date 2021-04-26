package com.test.pojo;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Required
    public void setAge(Integer age) {
        this.age = age;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public void print()
    {
        System.out.println("call print()");
    }


}
