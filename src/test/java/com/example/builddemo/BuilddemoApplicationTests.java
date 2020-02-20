package com.example.builddemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BuilddemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testSumFunction() {
        DummyClass dummyClass = new DummyClass();
        Assertions.assertEquals(3, dummyClass.somme(1,2));
    }
}
