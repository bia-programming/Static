package com.company;

public class Van extends Car {
    static String culoare;
    static String model;

    public Van(int nrUsi, String tip, String culoare, String model) {
        super(nrUsi, tip);
        this.culoare = culoare;
        this.model = model;
    }
}
