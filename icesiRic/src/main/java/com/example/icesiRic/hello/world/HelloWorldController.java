package com.example.icesiRic.hello.world;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${HELLO:Hello}")
    private String greeting;

    @GetMapping("/hello/{name}")
    public HelloWorldDto helloWorldDto(@PathVariable("name") String name){
        return helloWorldService.getDtoWithTRM(greeting + " " +name);
    }

    @Autowired
    private HelloWorldService helloWorldService;
}
