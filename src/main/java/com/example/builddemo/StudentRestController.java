package com.example.builddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class StudentRestController {

    @Autowired
    private StudentRepository repository;

    @GetMapping
    public Student findFirst() {
        return repository.findById(1L).orElseGet(() -> new Student("A", "B", 25L));
    }
}
