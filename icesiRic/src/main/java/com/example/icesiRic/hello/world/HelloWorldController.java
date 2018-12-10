package com.example.icesiRic.hello.world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/Hello")
    public String helloWorld(){
        return "Hello Icesi";
    }
}
