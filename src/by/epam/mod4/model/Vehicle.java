package by.epam.mod4.model;

public abstract class Vehicle {
    private String vehicleNumber;
    private double vehicleCost;
    private int humanCapacity;
    private String fuelType;

    public Vehicle(String vehicleNumber, double vehicleCost, int humanCapacity, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleCost = vehicleCost;
        this.humanCapacity = humanCapacity;
        this.fuelType = fuelType;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public int getHumanCapacity() {
        return humanCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getVehicleCost() {
        return vehicleCost;
    }

}
