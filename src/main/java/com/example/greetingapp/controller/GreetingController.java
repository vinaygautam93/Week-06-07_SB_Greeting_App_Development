package com.example.greetingapp.controller;

import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// Controller for greeting endpoints
@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    // Endpoint to list all greeting messages
    @GetMapping("/all")
    public List<Greeting> getAllGreetings() {
        // Calling service to get all greetings
        return greetingService.getAllGreetings();
    }
}
