package by.epam.mod4.search;


import by.epam.mod4.model.Taxipark;
import by.epam.mod4.model.Truck;
import by.epam.mod4.model.Vehicle;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FindVehicle {
    public final static int MIN_HUMAN_CAPACITY = 6;
    public final static int MAX_HUMAN_CAPACITY = 15;
    public final static int MIN_CARRYING_CAPACITY = 3000;
    public final static int MAX_CARRYING_CAPACITY = 5500;

    public static ArrayList<Vehicle> findSpecifiedVehicle(Taxipark taxi) {
        return taxi.getVehicles().stream()
                .filter(vehicle -> vehicle.getHumanCapacity() >= FindVehicle.MIN_HUMAN_CAPACITY && vehicle.getHumanCapacity() <= FindVehicle.MAX_HUMAN_CAPACITY)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static ArrayList<Vehicle> findCarryingCapacity(Taxipark taxi) {
        return taxi.getVehicles().stream()
                .filter(sc -> sc instanceof Truck)
                .map (sc -> (Truck) sc)
                .filter(vehicle -> vehicle.getCarryingCapacity() >= FindVehicle.MIN_CARRYING_CAPACITY && vehicle.getCarryingCapacity() <= FindVehicle.MAX_CARRYING_CAPACITY)
                .collect(Collectors.toCollection(ArrayList::new));

    }
}
