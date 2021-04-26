package com.test.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class FamilyService {

    public void print()
    {
        System.out.println("call FamilyService::print()");
    }
}
