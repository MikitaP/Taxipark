package by.epam.mod4.model;


import java.util.ArrayList;

public class Taxipark {
    private String name;
    private ArrayList<Vehicle> vehicles;

    public Taxipark(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
