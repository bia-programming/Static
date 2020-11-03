package com.company;

public class Suv extends Car {
    static int hp;
    static int an;

    public Suv(int nrUsi, String tip, int hp, int an) {
        super(nrUsi, tip);
        this.hp = hp;
        this.an = an;
    }
}
