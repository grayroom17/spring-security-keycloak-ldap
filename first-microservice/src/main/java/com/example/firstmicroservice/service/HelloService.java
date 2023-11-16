package com.example.firstmicroservice.service;

import com.example.firstmicroservice.client.SecondMicroserviceClient;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Service
public class HelloService {

    SecondMicroserviceClient secondMicroserviceClient;

    public String hello() {
        return "Hello World!";
    }

    public String sayHelloToSecondMicroservice() {
        return secondMicroserviceClient.hello();
    }

}
