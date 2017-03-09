package by.epam.mod4.printer;


import by.epam.mod4.main.Main;
import by.epam.mod4.model.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import by.epam.mod4.search.FindVehicle;
import org.apache.logging.log4j.Level;

public class Report {
    private static final String FILE_PATH;

    static {
        FILE_PATH = "data\\out_result.txt";
    }

    public static void printTaxipark(Taxipark taxi, double taxiParkCost, ArrayList<Vehicle> specifiedVehicle) {
        try (PrintWriter writer = new PrintWriter(Report.FILE_PATH)) {
            writer.printf(taxi.getName() + "- new taxi service in your district. Taxipark total cost = " + taxiParkCost + "\n");

            for (int i = 0; i < taxi.getVehicles().size(); i++) {
                Vehicle vehicle = taxi.getVehicles().get(i);

                writer.printf((i + 1) +
                        ". " +
                        "Vehicle number = " +
                        vehicle.getVehicleNumber() +
                        ", Vehicle cost = " +
                        vehicle.getVehicleCost() +
                        ", Human capacity = " +
                        vehicle.getHumanCapacity() +
                        ", Fuel type = " +
                        vehicle.getFuelType() +
                        "\n");

                if (vehicle instanceof Car) {
                    if (((Car) vehicle).isClimateControlOption()) {
                        writer.printf("Equipped with climate control\n");
                    } else {
                        writer.printf("Climate control is not installed\n");
                    }
                } else if (vehicle instanceof Truck) {
                    writer.printf("Carrying capacity = " + ((Truck) vehicle).getCarryingCapacity() + "\n");
                } else if (vehicle instanceof Microbus) {
                    writer.printf("Amount of TV screens on the board = " + ((Microbus) vehicle).getTvScreensQuantity() + "\n");
                }
                writer.printf("\n");
            }

            writer.printf("\n");
            writer.printf("Trucks with carrying capacity between " + FindVehicle.MIN_CARRYING_CAPACITY + " and " + FindVehicle.MAX_CARRYING_CAPACITY + ":\n");

            for (int i = 0; i < specifiedVehicle.size(); i++) {
                Vehicle veh = specifiedVehicle.get(i);

                writer.printf(veh.getVehicleNumber());

                if (i != specifiedVehicle.size() - 1) {
                    writer.printf(", ");
                } else {
                    writer.printf(".");
                }
            }
        } catch (IOException e) {
            Main.logger.log(Level.FATAL, "Out file not found", e);
            throw new RuntimeException(e);
        }
    }
}
