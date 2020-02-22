package com.example.builddemo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surName;
    private Long age;

    public Student() {
    }

    public Student(String name, String surName, Long age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }
}
