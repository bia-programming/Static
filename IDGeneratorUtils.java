package com.company;

public class IDGeneratorUtils {
    static String idIndustrial;
    static String idAlimente;
    static String id = "";
    static String suvId = "ID_SUV_";
    static int suvIdNumber = 1;
    static String truckId = "ID_TRUCK_";
    static int truckIdNumber = 1;
    static String cabrioId = "ID_CABRIO_";
    static int cabrioIdNumber = 1;
    static String superCarID = "ID_SUPERCAR_";
    static int superCarIdNumber = 1;
    static String vanId = "ID_VAN_";
    static int vandIdNumber = 1;

    static String generateIdMagazin(String tipMagazin) {

        if (MagazinIndustrial.tipMagazin.toLowerCase().equals("industrial"))
            id = MagazinIndustrial.id + "-ind-mag";
        else if (MagazinAlimentar.tipMagazin.toLowerCase().equals("alimentar"))
            id = MagazinAlimentar.id + "-almt-mag";
        else
            System.out.println(Erori.INVALID_TYPE);
        return id;
    }

    static String generateIdCar(String tip) {
        if (tip.toLowerCase().equals("suv")) {
            id = suvId + suvIdNumber;
            suvIdNumber++;
        } else if (tip.toLowerCase().equals("truck")) {
            id = truckId + truckIdNumber;
            truckIdNumber++;
        } else if (tip.toLowerCase().equals("cabrio")) {
            id = cabrioId + cabrioIdNumber;
            cabrioIdNumber++;
        } else if (tip.toLowerCase().equals("super car") || tip.toLowerCase().equals("supercar")) {
            id = superCarID + superCarIdNumber;
            superCarIdNumber++;
        } else if (tip.toLowerCase().equals("van")) {
            id = vanId + vandIdNumber;
            vandIdNumber++;
        } else
            System.out.println(Erori.INVALID_TYPE);
        return id;
    }
}
