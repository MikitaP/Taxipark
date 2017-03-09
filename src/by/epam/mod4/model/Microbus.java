package by.epam.mod4.model;

public class Microbus extends Vehicle {
    private int tvScreensQuantity;

    public Microbus(String vehicleNumber, double vehicleCost, int humanCapacity, String fuelType, int tvScreensQuantity) {
        super(vehicleNumber, vehicleCost, humanCapacity, fuelType);
        this.tvScreensQuantity = tvScreensQuantity;
    }

    public int getTvScreensQuantity() {
        return tvScreensQuantity;
    }
}
