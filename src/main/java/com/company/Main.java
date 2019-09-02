package com.company;

public class Main {

    public static void main(String[] args) {

        Human human = new Human();
        human.setBasicData("Jarosław", "Bąkosław", "93021030290");
        System.out.println(human.getBasicData());

        System.out.print("\n");

        Patient testPatient = new Patient();
        testPatient.setBasicData("Patryk", "Pacjenik", "93022039412", true);
        System.out.println(testPatient.getBasicData());

    }
}
