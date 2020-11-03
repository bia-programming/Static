package com.company;

public class Cabrio extends Car {
    static boolean decapotabila;
    static String model;

    public Cabrio(int nrUsi, String tip, boolean decapotabila, String model) {
        super(nrUsi, tip);
        this.decapotabila = decapotabila;
        this.model = model;
    }
}
