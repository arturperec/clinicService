package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HumanTest {

    private Human testHuman;

    @BeforeEach
    void SetUp() {
        testHuman = new Human();
        testHuman.setHumanData("Janusz", "Parawanik", "93101055893");
    }

    @AfterEach
    void tearDown() {
        // should I set created class for null here for Garbage Collector? and if yes - how?
        testHuman = null; // is it the correct way?
    }

    @Test
    void HumanName_isCorrect() {
        assertEquals("Janusz", testHuman.getName());
    }

    @Test
    void HumanSurname_isCorrect() {
        assertEquals("Parawanik", testHuman.getSurname());
    }

    @Test
    void HumanPesel_isCorrect() {
        assertEquals("93101055893", testHuman.getPesel());
    }

    @Test
    void HumanPrintData_isCorrect() {
        assertEquals("Name: Janusz" +
                "\nSurname: Parawanik" +
                "\nPesel: 93101055893", testHuman.getHumanData());
    }



    //* Czy name obiektu jest zapisywany
    //* Czy SURNAME obiektu jest zapisywany
    //* Czy PESEL jest serializowany
}
