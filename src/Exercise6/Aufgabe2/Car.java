package Exercise6.Aufgabe2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Nikita on 15.03.2021 at 20:20
 */
public class Car extends Vehicle {
    private double fuel;
    private double maxFuel;
    private double fuelConsumption;

    public Car(String name,
               Brand brand,
               ArrayList<Workshop> workshops,
               int weight,
               int maxPermissibleWeight,
               double maxSpeed,
               double maxFuel,
               double fuelConsumption){
        super(name, brand, workshops, weight, maxPermissibleWeight, maxSpeed);
        this.fuel = 0;
        this.maxFuel = maxFuel;
        this.fuelConsumption = fuelConsumption;
    }

    public void fillUp(double fuel){
        System.out.println("Filling the " + super.getBrand().getName() + " " + super.getName() + " with " + fuel + " liters");
        if (fuel <= getMaxFuel() - fuel) {
            this.fuel += fuel;
            System.out.println("The car " + super.getBrand().getName() + " " + super.getName() + " is filled up with " + getFuel() + " liters");
        } else {
            System.out.println("The car " + super.getBrand().getName() + " " + super.getName() + " is on it's max fuel...");
            this.fuel = maxFuel;
        }
    }
    @Override
    public void drive(int kilometers){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many liters do you want to fill up?");
        fillUp(scanner.nextDouble());
        double tempfuel = fuel;
        int drivenkm = 0;
        for (int i = 0; i < kilometers; i++) {
            drivenkm++;
            for (int j = 0; j < 7; j++) {
                drivenkm++;
                accelerate();
                fuel -= fuelConsumption;
            }
            while (speed > 0){
                drivenkm++;
                brake();
            }
        }
        System.out.println("Driven distance: " + drivenkm + " km");
        System.out.printf("Consumed fuel: %.2f liter(s)\n" , (tempfuel - fuel));
        System.out.println("Test drive with " + getBrand().getName() + " " + getName() + " is over.");

    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println( "--- FUEL INFO " + super.getBrand().getName() + " " + super.getName() + " ---" +
                            "\n fuel: " + getFuel() +
                            "\n maxFuel: " + getMaxFuel() +
                            "\n fuelConsumption: " + getFuelConsumption() + "\n--------------------------------");
    }


    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("set maxFuel");
        maxFuel = scanner.nextDouble();
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
