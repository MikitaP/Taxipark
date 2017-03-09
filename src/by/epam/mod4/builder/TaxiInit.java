package by.epam.mod4.builder;

import by.epam.mod4.model.Taxipark;


public class TaxiInit {
    final static String TAXIPARK_NAME = "Taxofon";

    public static Taxipark initTaxipark() {
        return new Taxipark(TAXIPARK_NAME);
    }
}
