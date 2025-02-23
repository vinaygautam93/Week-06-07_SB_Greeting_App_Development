package com.example.greetingapp.controller;

import com.example.greetingapp.model.User;
import com.example.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Controller class for greeting endpoints
@RestController
@RequestMapping("/greeting")
public class GreetingController {

    // Injecting service layer
    @Autowired
    private GreetingService greetingService;

    // Endpoint to get a simple greeting
    @GetMapping("/hello")
    public String getHelloMessage() {
        return greetingService.getGreetingMessage();
    }

    // Endpoint to get a personalized greeting using query parameters
    @GetMapping("/personalized")
    public String getPersonalizedGreeting(@RequestParam(required = false) String firstName,
                                          @RequestParam(required = false) String lastName) {
        // Creating User object
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);

        // Calling service to get greeting
        return greetingService.getPersonalizedGreeting(user);
    }
}
