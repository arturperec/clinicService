package com.company;

public class Human {
    public String getName() { return name; }

    void setName(String name) { this.name = name; }

    public String getSurname() { return surname;  }

    void setSurname(String surname) { this.surname = surname; }

    public String getFullName() {return name + " " + surname;}

    private String name, surname;

    public String getPesel() { return pesel; }

    public void setPesel(String pesel) { this.pesel = pesel; }

    private String pesel;

    Human(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    void printHuman() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Pesel: " + pesel);
    }
}
