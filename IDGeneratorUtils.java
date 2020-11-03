package com.company;

public class IDGeneratorUtils {
    static String idIndustrial;
    static String idAlimente;
    static String id = "";

    static String generateIdMagazin(String tipMagazin) {

        if (MagazinIndustrial.tipMagazin.toLowerCase().equals("industrial"))
            id = MagazinIndustrial.id + "-ind-mag";
        else if (MagazinAlimentar.tipMagazin.toLowerCase().equals("alimentar"))
            id = MagazinAlimentar.id + "-almt-mag";
        else
            id = "nu exista";
        return id;
    }
}
