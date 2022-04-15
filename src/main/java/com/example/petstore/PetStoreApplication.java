package com.example.petstore;

import com.example.petstore.entities.Animal;
import com.example.petstore.entities.Product;
import com.example.petstore.entities.Test;
import com.example.petstore.entities.repositories.AnimalRepository;
import com.example.petstore.entities.repositories.ProductRepository;
import com.example.petstore.entities.repositories.TestRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;

@SpringBootApplication()
@EntityScan("com.example.petstore.entities")
@EnableJpaRepositories(basePackages = {"com.example.petstore.entities.repositories"})

public class PetStoreApplication{
    public static void main(String[] args) {
        SpringApplication.run(PetStoreApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(ProductRepository productRepository) {
//        return args -> {
//            Product product = new Product(
//            );
//            productRepository.save(product);
//        };
//    }

//    @Bean
//    CommandLineRunner commandLineRunner(TestRepository testRepository) {
//        return args -> {
//            Test test = new Test("Mukhammed ALi");
//            testRepository.save(test);
//        };
//    }

//    @Bean
//    CommandLineRunner commandLineRunner(AnimalRepository animalRepository) {
//        return args -> {
//            ArrayList<Animal> animals = new ArrayList<>();
//            animals.add(new Animal("dog"));
//            animals.add(new Animal("cat"));
//            animals.add(new Animal("fish"));
//            animals.add(new Animal("perry"));
//            animalRepository.saveAll(animals);
//        };
//    }
}