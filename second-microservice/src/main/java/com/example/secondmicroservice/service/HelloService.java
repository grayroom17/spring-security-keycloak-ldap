package com.example.secondmicroservice.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello() {
        return "Hello from Second Microservice!";
    }

}
