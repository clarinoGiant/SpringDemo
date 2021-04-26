package com.test.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class User {
    private String userName;

    public User(@Value("AAA") String userName) {
        this.userName = userName;
    }

    public void print()
    {
        System.out.println("User name: " + userName);
    }
}
