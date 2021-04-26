package com.test.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

// @Service
@Getter
@Setter
public class AddressService {
    private String address;
    public void print()
    {
        System.out.println("call AddressService::print");
    }
}
