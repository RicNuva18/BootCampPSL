package com.example.icesiRic.hello.world;

public class HelloWorldDto {

    private String greeting;
    private Long id;
    private double trm;

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

    public double getTrm() {
        return trm;
    }

    public void setTrm(double trm) {
        this.trm = trm;
    }

    public HelloWorldDto(String greeting, Long id, double trm) {
        this.greeting = greeting;
        this.id = id;
        this.trm = trm;
    }
}
