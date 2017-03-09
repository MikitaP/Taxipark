package by.epam.mod4.builder;

import by.epam.mod4.model.Car;

public class CarInit {

    public static Car initCar(String[] inputFeed) {
        return new Car(inputFeed[0],Double.parseDouble(inputFeed[1]), Integer.parseInt(inputFeed[2]), inputFeed[3], Boolean.parseBoolean(inputFeed[4]));
    }
}

