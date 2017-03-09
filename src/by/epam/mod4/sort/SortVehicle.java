package by.epam.mod4.sort;


import by.epam.mod4.model.Taxipark;
import by.epam.mod4.model.Vehicle;

import java.util.Comparator;

public class SortVehicle {
    public static void sortVehicleByVehicleCost(Taxipark taxi) {
        taxi.getVehicles().sort(Comparator.comparing(Vehicle::getVehicleCost));
    }

    public static void sortVehicleByVehicleCostAndHumanCapacity(Taxipark taxi) {
        taxi.getVehicles().sort(Comparator.comparing(Vehicle::getVehicleCost).thenComparing(Vehicle::getHumanCapacity));
    }
}
