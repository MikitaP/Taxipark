package by.epam.mod4.main;

import by.epam.mod4.builder.TaxiInit;
import by.epam.mod4.input.Reader;

import by.epam.mod4.model.Taxipark;

import by.epam.mod4.model.Vehicle;
import by.epam.mod4.printer.Report;
import by.epam.mod4.search.FindVehicle;
import by.epam.mod4.sort.SortVehicle;
import by.epam.mod4.util.CalculateCost;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;


public class Main {
    public static final Logger logger = LogManager.getLogger("Logger");
    public static void main(String args[]) {
        Taxipark taxi = TaxiInit.initTaxipark();
        taxi.setVehicles(Reader.readFile());
//        double cost = CalculateCost.calculateCost(taxi);
//        System.out.println("Total cost of cars: " + cost + " in Taxipark - " + taxi.getName());

        //SortVehicle.sortVehicleByVehicleCostAndHumanCapacity(taxi);
        SortVehicle.sortVehicleByVehicleCost(taxi);

//        ArrayList<Vehicle> searchedVehicle = FindVehicle.findCarryingCapacity(taxi);//FindVehicle.findSpecifiedVehicle(taxi);
//        for (int i = 0; i < searchedVehicle.size(); i++) {
//            System.out.println("Vehicle number: " + searchedVehicle.get(i).getVehicleNumber() + "\tVehicle cost: " + searchedVehicle.get(i).getVehicleCost() + "\tHuman capacity: " + searchedVehicle.get(i).getHumanCapacity());
//            //System.out.println(searchedVehicle.get(i).toString());
//
//
//        }
        Report.printTaxipark(taxi,CalculateCost.calculateCost(taxi),FindVehicle.findCarryingCapacity(taxi));
    }
}
