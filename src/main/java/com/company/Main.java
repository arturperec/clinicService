package com.company;

public class Main {

    public static void main(String[] args) {

        Human testHuman = new Human("Jan", "Nowak", "90120512335");
        testHuman.printBasicData();

        Patient testPatient = new Patient("Robert", "Makowski", "94101065415", true);
        testPatient.printBasicData();
        testPatient.printInsuranceStatus();
    }
}
