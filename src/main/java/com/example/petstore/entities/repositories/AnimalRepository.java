package com.example.petstore.entities.repositories;

import com.example.petstore.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
}
