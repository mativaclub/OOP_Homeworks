package ru.skypro;

public class ServiceStation extends Service {
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            printVehicle(car);

        } else if (truck != null) {
            printVehicle2(truck);
            checkTrailer();
            System.out.println();

        } else if (bicycle != null) {
            printVehicle3(bicycle);
        }
    }
    }

