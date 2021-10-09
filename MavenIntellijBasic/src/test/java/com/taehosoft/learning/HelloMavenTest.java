package com.taehosoft.learning;

import junit.framework.TestCase;

public class HelloMavenTest extends TestCase {

    private com.taehosoft.learning.HelloMaven helloMaven;

    public void setUp() throws Exception {
        super.setUp();
        helloMaven = new HelloMaven();
    }

    public void tearDown() throws Exception {
    }

    public void testGreetingDefault() {
        assertEquals( "Greeting message should be", helloMaven.getGreeting(), "Hello");
    }

    public void testSetGreeting() {
        String greetingMessage = "How are you?";
        helloMaven.setGreeting(greetingMessage);
        assertEquals( "Greeting message should be", helloMaven.getGreeting(), greetingMessage);
    }

    public void testGreeting() {
        String greetingMessage = "How are you?";
        helloMaven.setGreeting(greetingMessage);
        assertEquals( "Greeting message should be", helloMaven.greet(), greetingMessage + " Maven!");
    }

}