package com.example.sonar;

/**
 * Sample class for demonstrating Maven project structure
 */
public class SampleRule {
    
    /**
     * Sample method that returns a greeting message
     * 
     * @param name the name to greet
     * @return greeting message
     */
    public String greet(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Hello, World!";
        }
        return "Hello, " + name + "!";
    }
}
