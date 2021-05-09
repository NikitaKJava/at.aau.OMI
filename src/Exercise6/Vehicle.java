package Exercise6.Aufgabe2;

import java.util.ArrayList;

/**
 * Created by Nikita on 13.03.2021 at 12:59
 */
public abstract class Vehicle{
    private int id;
    private String name;
    private Brand brand;
    private ArrayList<Workshop> workshops;
    private int weight;
    private int maxPermissibleWeight;
    protected double speed;
    private double maxSpeed;
    private static int nextID = 0; // Aufgabe 5

        public Vehicle(){
            workshops = new ArrayList<>();
        }

    public Vehicle(String name, Brand brand,
                   ArrayList<Workshop> workshops, int weight,
                   int maxPermissibleWeight, double maxSpeed) {
        this.id = getNextID();
        this.name = name;
        this.brand = brand;
        this.workshops = workshops;
        this.weight = weight;
        this.maxPermissibleWeight = maxPermissibleWeight;
        this.speed = 0;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Aufgabe 5
     */

    private static int getNextID() {
        return nextID++;
    }

    private static void setNextID(){
        nextID++;
    }

    public int getId() {
        return id;
    }

    public double brake() {
        if (speed >= 10) {
            speed -= 10;
            System.out.println("-----braking-----");
            System.out.println("The vehicle " + brand.getName() + " " + this.name + " is decreasing it's speed --> " + speed + " km/h");
        }
        if (speed == 0) {
            System.out.println("The vehicle " + brand.getName() + this.name + " has stopped...");
        } else {
            System.out.println("The vehicle " + brand.getName() + this.name + " has stopped...");
            speed = 0;
        }
        return speed;
    }


    public double accelerate() {
        if (speed <= maxSpeed - 10) {
            speed += 10;
            System.out.println("The vehicle " + brand.getName() + " " + getName() + " is increasing it's speed --> " + speed + " km/h");
        } else {
            System.out.println("The vehicle " + brand.getName() + this.name + " is on it's max speed...");
            speed = maxSpeed;
        }
        return speed;
    }


    /**
     * Simuliert das Fahren eines Fahrzeugs über eine gegebene Strecke. Pro gefahrenem
     * Kilometer soll jeweils dreimal die Methode accelerate() bzw. brake() aufgerufen werden.
     */

//    public void drive(int kilometers) {
//        for (int i = 0; i < kilometers; i++) {
//            for (int j = 0; j < 3; j++) {
//                accelerate();
//                brake();
//            }
//        }
//        System.out.println("Testdrive with " + this.brand.getName() + " " + this.name + " has been made.");
//    }

    /**
     * Aufgabe5.3.1 Die Klasse Vehiclesollnun als abstrakte Klasse definiert werden.
     * Ebenfalls soll die Methode drive(int kilometers) nun abstrakt sein.
     * •Sind in Ihrer Implementierung dadurch weitere Änderungen notwendig? Falls ja, welche?
     * @param kilometers
     */
    public abstract void drive(int kilometers);



    /**
     * Gibt alle verfügbaren Informationen (Werte
     * der Instanzvariablen) auf dem Bildschirm aus.
     */

    public void printInfo() {
        System.out.println(
                "ID Num " + this.id +
                        "\nVehicle: " + this.name +
                        "\nBrand: " + this.brand.getName() +
                        "\nWeight: " + this.weight + " kg" +
                        "\nMax Permissible Weight: " + this.maxPermissibleWeight + " kg" +
                        "\nMax Speed: " + this.maxSpeed + " km/h" +
                        "\n--------------------------------"
        );
    }

    public Workshop getWorkshop(int postcode) {
        for (int i = 0; i < workshops.size(); i++) {
            if (workshops.get(i).getPostcode() == postcode) {
//                System.out.println(workshops.get(i).getName());
                return workshops.get(i);
            }
        }
        return workshops.get(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxPermissibleWeight() {
        return maxPermissibleWeight;
    }

    public void setMaxPermissibleWeight(int maxPermissibleWeight) {
        this.maxPermissibleWeight = maxPermissibleWeight;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}