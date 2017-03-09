package test.by.epam.mod4.cost;


import by.epam.mod4.builder.CarInit;
import by.epam.mod4.builder.TaxiInit;
import by.epam.mod4.model.Car;
import by.epam.mod4.model.Taxipark;
import by.epam.mod4.model.Vehicle;
import by.epam.mod4.util.CalculateCost;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CalculateCostTest {

    @Test
    public void calculateCostTest() {
        Taxipark tax = TaxiInit.initTaxipark();
        ArrayList<Vehicle> veh = new ArrayList<>();
        String inputValues [] = new String[5];
        inputValues[0] = "12345";
        inputValues[1] = "0";
        inputValues[2] = "5";
        inputValues[3] = "gas";
        inputValues[4] = "false";
        Car car = CarInit.initCar(inputValues);
        veh.add(car);
        tax.setVehicles(veh);
        double expected = 0.0;
        double actual = CalculateCost.calculateCost(tax);
        Assert.assertEquals(expected,actual,0.01);
    }
}
