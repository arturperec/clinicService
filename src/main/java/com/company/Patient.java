package com.company;

public class Patient extends Human {
    Patient(String name, String surname, String pesel, boolean insured) {
        super(name, surname, pesel);
        this.insured = insured;
    }

    public boolean isInsured() { return insured; }

    public void setInsured(boolean insured) { this.insured = insured; }

    private boolean insured;

    void printBasicData() {
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Pesel: " + getPesel());
        System.out.println("Is insured: " + isInsured());
    }

    void printInsuranceStatus(){
        if (isInsured())
            System.out.println(getFullName() + " is insured.");
        else
            System.out.println(getFullName() + " is NOT insured.");
    }
}
