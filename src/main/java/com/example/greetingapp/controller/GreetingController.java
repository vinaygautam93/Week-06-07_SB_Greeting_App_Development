package com.example.greetingapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// This class handles REST API endpoints for greeting messages
@RestController  // Marks this class as a REST controller
@RequestMapping("/greeting")  // Base path for all endpoints in this controller
public class GreetingController {

    // Endpoint to return a simple hello message
    @GetMapping("/hello")
    public String getHelloMessage() {
        // Returning a static greeting message
        return "Hello from BridgeLabz!";
    }
}
