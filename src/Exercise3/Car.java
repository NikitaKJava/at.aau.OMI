package Exercise3;
import java.util.Scanner;

/**
 * Created by Nikita on 15.03.2021 at 20:20
 */
public class Car extends Vehicle{
    private double fuel;
    private double maxFuel;
    private double fuelConsumption;

    public Car(){
        super();
        this.fuel = getFuel();
        this.maxFuel = getMaxFuel();
        this.fuelConsumption = getFuelConsumption();
    }

    public void fillUp(double fuel){
        System.out.println("filling the car with" + fuel + "Liters");
        if (fuel <= getMaxFuel() - fuel) {
            this.fuel += fuel;
            System.out.println("The Vehicle " + super.getBrand() + " " + super.getName() + " is filled up with " + maxFuel + "liters");
        } else {
            System.out.println("The Vehicle " + super.getBrand() + " " + super.getName() + " is on it's max fuel...");
            this.fuel = maxFuel;
        }
    }

    public void drive(int kilometers){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many liters do you want to fill up?");
        fillUp(scanner.nextDouble());

    }

    public void printInfo(){
        System.out.println( "----FUEL----" +
                            "\n fuel: " + getFuel() +
                            "\n maxFuel: " + getMaxFuel() +
                            "\n fuelConsumption: " + getFuelConsumption());
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
