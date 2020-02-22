package com.example.builddemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class BuilddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuilddemoApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository) {
        Student student = Student.builder().name("Ala").surName("Ben Khlifa").age(26L).build();
        repository.save(student);
        log.info("Student added successfully!");
        log.info(student.toString());
        return null;
    }
}
