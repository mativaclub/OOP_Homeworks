package ru.skypro;

public class Service {

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }


    void printVehicle(Vehicle car) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        System.out.println();
    }

    void printVehicle2(Vehicle truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        System.out.println();
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            updateTyre();
        }
        System.out.println();
        checkEngine();
        System.out.println();
    }

    void printVehicle3(Vehicle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            updateTyre();
        }
        System.out.println();
    }

}
