package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Magazin> list = new ArrayList<>();
        MagazinAlimentar almt = new MagazinAlimentar(300, 200, 200, "alimentar", 200, 9, "la doi pasi", "centru", 40);
        list.add(almt);
        System.out.println(IDGeneratorUtils.generateIdMagazin(almt.tipMagazin));
        MagazinIndustrial ind = new MagazinIndustrial(700, 600, 700, "industrial", 100, "industrial shop", "popescu", true);
        list.add(ind);
        System.out.println(IDGeneratorUtils.generateIdMagazin(ind.tipMagazin));

        ArrayList<Car> lista = new ArrayList<>();
        Truck truck = new Truck(4, "tRuCk", 100000, "red");
        lista.add(truck);
        System.out.println(IDGeneratorUtils.generateIdCar(truck.tip));
        SuperCar superCar = new SuperCar(4, "super car", "audi", true);
        SuperCar superCar1 = new SuperCar(4, "supercar", "bmw", true);
        lista.add(superCar);
        System.out.println(IDGeneratorUtils.generateIdCar(superCar.tip));
        lista.add(superCar1);
        System.out.println(IDGeneratorUtils.generateIdCar(superCar1.tip));
        Cabrio cabrio = new Cabrio(4, "cabrio", true, "nou");
        System.out.println(IDGeneratorUtils.generateIdCar(cabrio.tip));
        Van van = new Van(4, "van", "yellow", "nou");
        lista.add(van);
        System.out.println(IDGeneratorUtils.generateIdCar(van.tip));
        Suv suv = new Suv(4, "SuV", 300, 2015);
        lista.add(suv);
        System.out.println(IDGeneratorUtils.generateIdCar(suv.tip));
    }
}
