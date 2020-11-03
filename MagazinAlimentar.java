package com.company;

public class MagazinAlimentar extends Magazin {
    static int orar;
    static String numeMagazin;
    static String localizare;
    static int nrClientiZi;

    public MagazinAlimentar(float suprafata, float lungime, float latime, String tipMagazin, int id, int orar, String numeMagazin, String localizare, int nrClientiZi) {
        super(suprafata, lungime, latime, tipMagazin, id);
        this.orar = orar;
        this.numeMagazin = numeMagazin;
        this.localizare = localizare;
        this.nrClientiZi = nrClientiZi;

    }


}
