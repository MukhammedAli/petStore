package com.example.petstore.entities.repositories;

import com.example.petstore.entities.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {
}
