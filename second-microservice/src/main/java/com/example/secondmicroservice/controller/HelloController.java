package com.example.secondmicroservice.controller;

import com.example.secondmicroservice.service.HelloService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
@RequiredArgsConstructor
@RestController
@RequestMapping("hello")
public class HelloController {

    HelloService helloService;

    @GetMapping
    ResponseEntity<String> hello(){
        return ResponseEntity.ok(helloService.hello());
    }

}
