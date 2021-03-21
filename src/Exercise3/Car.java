package Exercise3;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Nikita on 15.03.2021 at 20:20
 */
public class Car extends Vehicle{
    private double fuel;
    private double maxFuel;
    private double fuelConsumption;

    public Car(String name,
               Brand brand,
               ArrayList<Workshop> workshops,
               int weight,
               int maxPermissibleWeight,
               double maxSpeed,
               double fuel,
               double maxFuel,
               double fuelConsumption){
        super(name, brand, workshops, weight, maxPermissibleWeight, maxSpeed);
        this.fuel = 0;
        this.maxFuel = maxFuel;
        this.fuelConsumption = fuelConsumption;
    }

    public void fillUp(double fuel){
        System.out.println("filling the car with" + fuel + "Liters");
        if (fuel <= getMaxFuel() - fuel) {
            this.fuel += fuel;
            System.out.println("The car " + super.getBrand() + " " + super.getName() + " is filled up with " + maxFuel + "liters");
        } else {
            System.out.println("The car " + super.getBrand() + " " + super.getName() + " is on it's max fuel...");
            this.fuel = maxFuel;
        }
    }

    public void drive(int kilometers){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many liters do you want to fill up?");
        fillUp(scanner.nextDouble());

    }
    @Override
    public void printInfo(){
        System.out.println(
                "ID Num " + getId() +
                        "\nVehicle: " + getName() +
                        "\nBrand: " + getBrand().getName() +
                        "\nWeight: " + getWeight() + " kg" +
                        "\nMax Permissible Weight: " + getMaxPermissibleWeight() + " kg" +
                        "\nMax Speed: " + getSpeed() + " km/h" +
                        "\n--------------------------------"
        );
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
