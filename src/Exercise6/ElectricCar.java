package Exercise6.Aufgabe2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Nikita on 15.03.2021 at 20:20
 */

/**
 * Aufgabe 3: Realisieren Sie eine Klasse ElectricCarfür ein Elektroauto,welche ein Fahrzeug (Vehicle) von Übungsblatt 2erweitert
 * (extends). Ein Elektroauto verbraucht zum Fahren Strom aus einer Batterie. ElectricCar führt dafür die folgenden
 * zusätzlichen Instanzvariablen ein:
 * Führen Sie für ElectricCar einen Konstruktor ein, der alle Instanzvariablen initialisiert. Die InstanzvariablebatteryLevel wird
 * stets mit 0 initialisiert. Der Konstruktor von ElectricCarmuss den Konstruktor von Vehiclemithilfe von super(...) aufrufen.
 * Realisieren Sie auch wieder entsprechende Getter-und Setter-Methoden.
 */
public class ElectricCar extends Vehicle {
    private double batteryLevel;
    private double maxBatteryCapacity;
    private double powerConsumption;

    public ElectricCar(String name,
                         Brand brand,
                         ArrayList<Workshop> workshops,
                         int weight, int maxPermissibleWeight,
                         double maxSpeed,
                         double maxBatteryCapacity,
                         double powerConsumption) {
        super(name, brand, workshops, weight, maxPermissibleWeight, maxSpeed);
        this.batteryLevel = 0; // current battery level kWh
        this.maxBatteryCapacity = maxBatteryCapacity; // kWh
        this.powerConsumption = powerConsumption; // kWh / 100km
    }

    public void charge(double power, double hours) {
        System.out.println("\n Charging the E-CAR with " + power + " kWh. Waiting " + hours + " hour(s)...");
        if (power <= getMaxBatteryCapacity() - power) {
            this.batteryLevel += power;
            System.out.println("The E-CAR " + super.getBrand().getName() + " " + super.getName() + " is charged with " + batteryLevel + " kWh.");
        } else {
            System.out.println("The E-CAR " + super.getBrand().getName() + " " + super.getName() + " is on it's max fuel...");
            this.batteryLevel = maxBatteryCapacity;
        }
    }

    @Override
    public void drive(int kilometers) {
        int tempkm = 0;
        System.out.println("\n🚗 🚗 🚗 🚗  testdrive 🚗 🚗 🚗 🚗");
        for (int i = 0; i < kilometers; i++) {
            tempkm++;
            batteryLevel--;
            if (batteryLevel <= 1) {
                while (speed > 0){
                    this.brake();
                }
                System.out.println("Battery level 1%. Vehicle stopped..." + " Driven range: " + tempkm);
                break;
            }
            for (int j = 0; j < 3; j++) {
                accelerate();
//                brake();
            }
            while (speed > 0){
                brake();
            }
        }
    }
    @Override
    public double brake() {
        if (super.getSpeed() > 0) {
            this.batteryLevel += 0.001;
            super.brake();
        }
        return super.getSpeed();
    }
    @Override
    public void printInfo() {
        super.printInfo();

        System.out.println("--- Battery level " + super.getBrand().getName() + " " + super.getName() + " ---" +
                "\n battery level: " + getBatteryLevel() +
                "\n max battery capacity: " + getMaxBatteryCapacity() +
                "\n power consumption: " + getPowerConsumption() + "\n--------------------------------");
    }


    public double getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public double getMaxBatteryCapacity() {
        return maxBatteryCapacity;
    }

    public void setMaxBatteryCapacity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("set battery capacity");
        maxBatteryCapacity = scanner.nextDouble();
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
}
