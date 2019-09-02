package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest {

    private Patient testPatient;

    @BeforeEach
    void setUp() {
        testPatient = new Patient();
        testPatient.setBasicData("Przemysław", "Pacienciak", "90101055618", true);
    }

    @Test
    void PatientInsurance_isCorrect() {
        assertTrue(testPatient.isInsured());
    }

    @Test
    void PatientOverrideBasicData_isCorrect() {
        assertEquals("Name: Przemysław" +
                "\nSurname: Pacienciak" +
                "\nPesel: 90101055618" +
                "\nIs insured: true", testPatient.getBasicData());
    }

    @Test
    void PatientIsNotInsuredWhenNoInsuranceInfo() {
        testPatient.setBasicData("Norbert", "Nieubezpieczony", "92101020202");
        assertFalse(testPatient.isInsured());
    }

}
