package com.example.petstore.entities.repositories;

import com.example.petstore.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
