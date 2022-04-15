package com.example.petstore.entities.repositories;

import com.example.petstore.entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
}
