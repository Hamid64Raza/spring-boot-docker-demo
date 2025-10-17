package com.dockerTest.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello from Spring Boot Docker on AWS EC2!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is running successfully!";
    }
    @GetMapping("/update")
    public String update() {
        return "Application is Updating relax----";
    }
    @GetMapping("/first")
    public String test(){
        return "testing";
    }
}

