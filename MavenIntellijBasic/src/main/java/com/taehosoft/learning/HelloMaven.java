package com.taehosoft.learning;

public class HelloMaven {
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public HelloMaven() {
        greeting = "Hello";
    }

    public String greet() {
        return greeting + " Maven!";
    }

}
