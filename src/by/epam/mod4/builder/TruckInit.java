package by.epam.mod4.builder;

import by.epam.mod4.model.FuelType;
import by.epam.mod4.model.Truck;


public class TruckInit {
    private static final String FUEL_TYPE_ERROR = "Not defined";

    public static Truck initTruck(String[] inputFeed) {
        if (inputFeed[3].toUpperCase() == String.valueOf(FuelType.DIESEL) || inputFeed[3].toUpperCase() == String.valueOf(FuelType.BENZIN)) {
            return new Truck(inputFeed[0], Double.parseDouble(inputFeed[1]), Integer.parseInt(inputFeed[2]), inputFeed[3], Double.parseDouble(inputFeed[4]));
        } else
            return new Truck(inputFeed[0], Double.parseDouble(inputFeed[1]), Integer.parseInt(inputFeed[2]), FUEL_TYPE_ERROR, Double.parseDouble(inputFeed[4]));
    }
}
