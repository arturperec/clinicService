package com.company;

class Human {

    private String name;
    private String surname;
    private String pesel;

//    HumanData(String name, String surname, String pesel) {
//        Human.name = name;
//        Human.surname = surname;
//        Human.pesel = pesel;
//    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getSurname() {
        return surname;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    String getPesel() {
        return pesel;
    }

    void setPesel(String pesel) {
        this.pesel = pesel;
    }

    String getHumanData() {
        return ("Name: " + getName() +
                "\nSurname: " + getSurname() +
                "\nPesel: " + getPesel());
    }

    void setHumanData(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }
}
