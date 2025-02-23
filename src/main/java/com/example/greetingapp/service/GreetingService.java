package com.example.greetingapp.service;

import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

// Service for business logic
@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    // Method to fetch all greetings
    public List<Greeting> getAllGreetings() {
        // Fetching all records from the database
        return greetingRepository.findAll();
    }
}
