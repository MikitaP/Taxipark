package by.epam.mod4.model;


public class Car extends Vehicle {
    private boolean climateControlOption;

    public Car(String vehicleNumber,double vehicleCost, int humanCapacity, String fuelType, boolean climateControlOption) {
        super(vehicleNumber, vehicleCost, humanCapacity, fuelType);
        this.climateControlOption = climateControlOption;
    }

    public boolean isClimateControlOption() {
        return climateControlOption;
    }
}
