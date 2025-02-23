package com.example.greetingapp.repository;

import com.example.greetingapp.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Repository interface for CRUD operations on Greeting entity
@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}
