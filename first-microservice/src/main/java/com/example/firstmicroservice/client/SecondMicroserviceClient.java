package com.example.firstmicroservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        value = "first-microservice-client",
        url = "localhost:8020",
        path = "/hello"
)
public interface SecondMicroserviceClient {

    @GetMapping
    String hello();

}
