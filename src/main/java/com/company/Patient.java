package com.company;

class Patient extends Human {

    private boolean insured = false;

    boolean isInsured() {
        return insured;
    }

    void setInsured(boolean insured) {
        this.insured = insured;
    }

    String getBasicData() {
        return (super.getBasicData()
                + "\nIs insured: "
                + isInsured());
    }

    @Override
    void setBasicData(String name, String surname, String pesel) {
        super.setBasicData(name, surname, pesel);
        insured = false;
    }

    void setBasicData(String name, String surname, String pesel, boolean insured) {
        super.setBasicData(name, surname, pesel);
        this.insured = insured;
    }
}
