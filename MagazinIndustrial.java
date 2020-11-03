package com.company;

public class MagazinIndustrial extends Magazin {
    static String nume;
    static String patron;
    static boolean eDeschis;

    public MagazinIndustrial(float suprafata, float lungime, float latime, String tipMagazin, int id, String nume, String patron, boolean eDeschis) {
        super(suprafata, lungime, latime, tipMagazin, id);
        this.nume = nume;
        this.patron = patron;
        this.eDeschis = eDeschis;

    }


}
