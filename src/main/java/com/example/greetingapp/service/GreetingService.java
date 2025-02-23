package com.example.greetingapp.service;

import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

// Service for business logic
@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    // Method to update a greeting by ID
    public Greeting updateGreeting(Long id, String newMessage) {
        // Fetching the greeting by ID
        Optional<Greeting> optionalGreeting = greetingRepository.findById(id);

        // If found, update the message and save
        if (optionalGreeting.isPresent()) {
            Greeting greeting = optionalGreeting.get();
            greeting.setMessage(newMessage);
            return greetingRepository.save(greeting);
        } else {
            // Return null if not found
            return null;
        }
    }
}
