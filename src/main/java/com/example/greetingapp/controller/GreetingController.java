package com.example.greetingapp.controller;

import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Controller to handle API endpoints
@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    // Endpoint to find a greeting by its ID
    @GetMapping("/find/{id}")
    public Greeting findGreetingById(@PathVariable Long id) {
        // Calling service to find the greeting
        return greetingService.findGreetingById(id);
    }
}
