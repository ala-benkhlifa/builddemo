package com.example.builddemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@SpringBootApplication
@Slf4j
public class BuilddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuilddemoApplication.class, args);
    }

    @Autowired
    private Environment environment;

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository) {
        Student student = new Student("Ala", "Ben Khlifa", 26L);
        repository.save(student);
        log.info("Student added successfully!");
        String[] activeProfiles = environment.getDefaultProfiles();
        Arrays.stream(activeProfiles).forEach(log::info);
        log.info(student.toString());
        return null;
    }
}
