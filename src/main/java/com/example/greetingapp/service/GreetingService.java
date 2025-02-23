package com.example.greetingapp.service;

import com.example.greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Service for greeting logic
@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    // Method to delete a greeting by ID
    public boolean deleteGreeting(Long id) {
        // Check if the greeting exists
        if (greetingRepository.existsById(id)) {
            // If exists, delete it
            greetingRepository.deleteById(id);
            return true;
        } else {
            // Return false if not found
            return false;
        }
    }
}
