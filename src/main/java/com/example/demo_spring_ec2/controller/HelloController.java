package com.example.demo_spring_ec2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from Spring Boot on EC2!";
    }

    @GetMapping("/api/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello " + name + ", welcome to our Spring Boot app!";
    }
}
