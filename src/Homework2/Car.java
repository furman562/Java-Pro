package Homework2;

public class Car {
    public void Start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Запуск елетрики . . . ");
    }

    private void startCommand() {
        System.out.println("Запустити комнаду . . . ");
    }

    private void startFuelSystem() {
        System.out.println("Запуск топливної системи . . . ");
    }

    public static void main(String[] args) {
        Car MyCar = new Car();
        MyCar.Start();

    }
}






