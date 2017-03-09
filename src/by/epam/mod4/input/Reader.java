package by.epam.mod4.input;

import by.epam.mod4.builder.MicrobusInit;
import by.epam.mod4.builder.TruckInit;
import by.epam.mod4.main.Main;
import by.epam.mod4.model.Car;
import by.epam.mod4.model.Microbus;
import by.epam.mod4.model.Truck;
import by.epam.mod4.model.Vehicle;
import by.epam.mod4.builder.CarInit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

import org.apache.logging.log4j.Level;


public class Reader {

    private static final String FILE_PATH;

    static {
        FILE_PATH = "data\\inputFeed.txt";
    }

    private static final String CAR_TYPE = "typeCar:";
    private static final String TRUCK_TYPE = "typeTruck:";
    private static final String MICROBUS_TYPE = "typeMicrobus:";

    public static ArrayList<Vehicle> readFile()

    {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(FILE_PATH))) {
            stream.forEach((String line) -> {
                try {
                    if (line.contains(CAR_TYPE)) {
                        String[] inputFeed = line.substring(8).split(",");
                        Car car = CarInit.initCar(inputFeed);
                        vehicles.add(car);
                    } else if (line.contains(TRUCK_TYPE)) {
                        String[] inputFeed = line.substring(10).split(",");
                        Truck truck = TruckInit.initTruck(inputFeed);
                        vehicles.add(truck);
                    } else if (line.contains(MICROBUS_TYPE)) {
                        String[] inputFeed = line.substring(13).split(",");
                        Microbus microbus = MicrobusInit.initMicrobus(inputFeed);
                        vehicles.add(microbus);
                    } else {
                        String logStr = line;
                        Main.logger.log(Level.INFO, "Incorrect string format: " + logStr);
                    }
                } catch (NumberFormatException e) {
                    String logErrorString = line;
                    Main.logger.log(Level.ERROR, "Incorrect values in string: " + logErrorString + ".  Reason: " + e.getMessage());
                    return;
                }
            });
        } catch (IOException e) {
            Main.logger.log(Level.FATAL, "Feed file not found", e);
            throw new RuntimeException(e);

        }

        return vehicles;
    }
}
