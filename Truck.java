package com.company;

public class Truck extends Car{
    static int price;
    String colorCab;

    public Truck(int nrUsi, String tip,int price, String colorCab) {
        super(nrUsi, tip);
        this.price = price;
        this.colorCab = colorCab;
    }
}

