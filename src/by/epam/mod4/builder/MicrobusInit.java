package by.epam.mod4.builder;

import by.epam.mod4.model.Microbus;


public class MicrobusInit {
    public static Microbus initMicrobus(String[] inputFeed) {
        return new Microbus(inputFeed[0],Double.parseDouble(inputFeed[1]), Integer.parseInt(inputFeed[2]), inputFeed[3], Integer.parseInt(inputFeed[4]));
    }
}
