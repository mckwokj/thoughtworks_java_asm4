package com.company;

import java.util.ArrayList;
import java.util.List;

import Phasianidae.Chickens;
import Phasianidae.Cock;
import Phasianidae.Hen;
import Phasianidae.Phasianidae;
import Transportation.*;

public class Main {
    public static void shopping () {
        Phasianidae cock = new Cock();
        Phasianidae hen = new Hen();
        Phasianidae chickens = new Chickens();

        double maxMoney = 100;

        int maxCock = (int) (maxMoney / cock.getPrice());
        int maxHen = (int) (maxMoney / hen.getPrice());
        int maxChickens = (int) (maxMoney / chickens.getPrice());

        for (int i=1; i<=maxCock; i++) {
            for (int j = 1; j <= maxHen; j++) {
                for (int k = 1; k <= maxChickens; k++) {
                    if ((i + j + k * 3 == 100) && (i * cock.getPrice() + j * hen.getPrice() + k * chickens.getPrice() == 100)) {
                        System.out.println("Result: ");
                        System.out.println("Number of cock: " + i + ", with price = $" + i * cock.getPrice());
                        System.out.println("Number of hen: " + j + ", with price = $" + j * hen.getPrice());
                        System.out.println("Number of chickens: " + k * 3 + ", with price = $" + k * chickens.getPrice());
                    }
                }
            }
        }
    }

    public static void transportationMeans (int maxAmount) {
        Drivable driving = new Driving();
        Drivable bus = new Bus();
        Drivable train = new Train();
        Drivable plane  = new Plane();

        List<Drivable> vehicles = new ArrayList<>();

        vehicles.add(driving);
        vehicles.add(bus);
        vehicles.add(train);
        vehicles.add(plane);

        String result = "";

        for (Drivable vehicle: vehicles) {
            if (vehicle.getCost() <= maxAmount) {
                result += vehicle.getVehicleName() + " ";
            }
        }

        System.out.println("You can travel by " + result + "with $" + maxAmount);
    }
    public static void main(String[] args) {
        // write your code here
        shopping();
        System.out.println();
        transportationMeans(500);
    }
}
