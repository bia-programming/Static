package com.company;

public class Car {
    static int nrUsi;
    static String tip;
    static String id;

    public Car(int nrUsi, String tip) {
        this.nrUsi = nrUsi;
        this.tip = tip;
        this.id = IDGeneratorUtils.generateIdCar(tip);
    }
}
