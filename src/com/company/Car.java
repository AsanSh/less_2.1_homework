package com.company;

public class Car {

    private String transmissionType;

    public Car(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    private String defineCondition(int prodYear, Condition condition) {
        return prodYear + " " + condition;
    }
}
