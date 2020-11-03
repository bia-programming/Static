package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Magazin> list = new ArrayList<>();
        MagazinAlimentar almt = new MagazinAlimentar(300, 200, 200, "alimentar", 200, 9, "la doi pasi", "centru", 40);
        list.add(almt);
        System.out.println(IDGeneratorUtils.generateIdMagazin(almt));
        System.out.println();
        MagazinIndustrial ind = new MagazinIndustrial(700, 600, 700, "industrial", 100, "industrial shop", "popescu", true);
        list.add(ind);
        System.out.println(IDGeneratorUtils.generateIdMagazin(ind));
    }
}
