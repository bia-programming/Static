package com.company;

public class SuperCar extends Car {
    static String brand;
    static boolean isNew;

    public SuperCar(int nrUsi, String tip, String brand, boolean isNew) {
        super(nrUsi, tip);
        this.brand = brand;
        this.isNew = isNew;
    }
}
