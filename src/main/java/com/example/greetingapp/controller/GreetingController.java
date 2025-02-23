package com.example.greetingapp.controller;

import com.example.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Controller for greeting endpoints
@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    // Endpoint to delete a greeting by ID
    @DeleteMapping("/delete/{id}")
    public String deleteGreeting(@PathVariable Long id) {
        // Calling service to delete the greeting
        if (greetingService.deleteGreeting(id)) {
            return "Greeting with ID " + id + " deleted successfully.";
        } else {
            return "Greeting not found!";
        }
    }
}
