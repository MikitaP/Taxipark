package by.epam.mod4.util;

import by.epam.mod4.model.Taxipark;

public class CalculateCost {
    public static double calculateCost(Taxipark tax) {
        return tax.getVehicles().stream()
                .mapToDouble(veh -> veh.getVehicleCost())
                .sum();
    }
}
