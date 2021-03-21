package Exercise3;

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
public class ElectricalCar extends Vehicle {
    private double batteryLevel;
    private double maxBatteryCapacity;
    private double powerConsumption;

    public ElectricalCar() {
        super();
        this.batteryLevel = getBatteryLevel(); // current battery level kWh
        this.maxBatteryCapacity = getMaxBatteryCapacity(); // kWh
        this.powerConsumption = getPowerConsumption(); // kWh / 100km
    }

    public void charge(double power, double hours) {
        System.out.println("charging the car with" + power + "kWh");
        if (power <= getMaxBatteryCapacity() - power) {
            this.batteryLevel += power;
            System.out.println("The Vehicle " + super.getBrand() + " " + super.getName() + " is charged with " + batteryLevel + "kWh");
        } else {
            System.out.println("The Vehicle " + super.getBrand() + " " + super.getName() + " is on it's max fuel...");
            this.batteryLevel = maxBatteryCapacity;
        }
    }

    public void drive(int kilometers) {
        int tempkm = 0;
        for (int i = 0; i < kilometers; i++) {
            tempkm++;
            batteryLevel--;
            if (batteryLevel <= 1) {
                System.out.println("Battery level 1%. Vehicle stopped" + "Driven range: " + tempkm);
            }
            for (int j = 0; j < 3; j++) {
                accelerate();
                brake();
            }
        }
    }

    public double brake() {
        if (super.getSpeed() > 0) {
            this.batteryLevel += 0.001;
            super.brake();
        }
        return super.getSpeed();
    }

    public void printInfo() {
        System.out.println("----Battery level----" +
                "\n battery level: " + getBatteryLevel() +
                "\n max battery capacity: " + getMaxBatteryCapacity() +
                "\n power consumption: " + getPowerConsumption());
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
