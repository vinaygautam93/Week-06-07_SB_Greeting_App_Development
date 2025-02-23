package com.example.greetingapp.service;

import org.springframework.stereotype.Service;

// This service class contains the business logic for greeting messages
@Service  // Marks this class as a Spring service
public class GreetingService {

    // Method to return a default greeting message
    public String getGreetingMessage() {
        // Returning a static message
        return "Hello World!";
    }
}
