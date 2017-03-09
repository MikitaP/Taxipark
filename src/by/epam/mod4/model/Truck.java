package by.epam.mod4.model;


public class Truck extends Vehicle {
    private double carryingCapacity;

    public Truck(String vehicleNumber, double vehicleCost, int humanCapacity, String fuelType, double carryingCapacity) {
        super(vehicleNumber, vehicleCost, humanCapacity, fuelType);
        this.carryingCapacity = carryingCapacity;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }
}
