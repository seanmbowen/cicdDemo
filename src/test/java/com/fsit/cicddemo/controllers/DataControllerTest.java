package com.fsit.cicddemo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by: seanbowen on 2022-07-27
 * Architecting Solutions. Simply.
 */

@SpringBootTest
class DataControllerTest {
    DataController controller;

    @Autowired
    public DataControllerTest(DataController controller) {
        this.controller = controller;
    }

    @Test
    void healthCheck() {
        assertEquals("HEALTH CHECK OK", controller.healthCheck());
    }

    @Test
    void version() {
        assertEquals("The actual version is 1.0.1", controller.version());
    }

    @Test
    void getRandomNations() {
        Integer sizeOfNations = controller.getRandomNations().size();
        assertEquals(10, sizeOfNations);
    }

    @Test
    void getRandomCurrencies() {
        Integer sizeOfCurrencies = controller.getRandomCurrencies().size();
        assertEquals(20, sizeOfCurrencies);
    }
}