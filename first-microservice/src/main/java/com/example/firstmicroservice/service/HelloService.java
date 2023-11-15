package com.example.firstmicroservice.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello() {
        return "Hello World!";
    }

}
