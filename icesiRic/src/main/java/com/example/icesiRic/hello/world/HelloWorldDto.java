package com.example.icesiRic.hello.world;

public class HelloWorldDto {

    private String greeting;
    private Long id;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HelloWorldDto(String greeting, Long id) {

        this.greeting = greeting;
        this.id = id;
    }
}
