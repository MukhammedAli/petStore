package com.example.petstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class PetStoreApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(PetStoreApplication.class, args);
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        String sql = "INSERT INTO test(name, description) VALUES('Nurzhas', 'PHP programmer')";

        jdbcTemplate.update(sql);
    }
}