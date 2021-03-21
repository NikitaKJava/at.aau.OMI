package Exercise2;

import Exercise2.Workshop;

import java.util.ArrayList;

/**
 * Created by Nikita on 13.03.2021 at 12:59
 */
class Vehicle {
    private int id;
    private String name;
    private Brand brand;
    private ArrayList<Workshop> workshops;
    private int weight;
    private int maxPermissibleWeight;
    private double speed;
    private double maxSpeed;
    private static long nextID = 0; // Aufgabe 5

        public Vehicle(){
            workshops = new ArrayList<>();
        }

    public Vehicle(int id, String name, Brand brand,
                   ArrayList<Workshop> workshops, int weight,
                   int maxPermissibleWeight, double maxSpeed) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.workshops = workshops;
        this.weight = weight;
        this.maxPermissibleWeight = maxPermissibleWeight;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
    }

    /**
     * Aufgabe 5
     */

    private static long getNextID() {
        return nextID++;
    }

    private static void setNextID(){
        nextID++;
    }

    public int getId() {
        id = (int) getNextID();
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public double brake() {
        if (speed >= 10) {
            speed -= 10;
            System.out.println("The Vehicle " + this.name + " is decreasing it's speed...");
            System.out.println(speed);
        } else {
            System.out.println("The vehicle " + this.name + " has stopped...");
            speed = 0;
        }
        return speed;
    }


    public double accelerate() {
        if (speed <= maxSpeed - 10) {
            speed += 10;
            System.out.println("The Vehicle " + this.name + " is increasing it's speed...");
        } else {
            System.out.println("The Vehicle " + this.name + " is on it's max speed...");
            speed = maxSpeed;
        }
        return speed;
    }

    /**
     * Simuliert das Fahren eines Fahrzeugs über eine gegebene Strecke. Pro gefahrenem
     * Kilometer soll jeweils dreimal die Methode accelerate() bzw. brake() aufgerufen werden.
     */
    public void drive(int kilometers) {
        for (int i = 0; i < kilometers; i++) {
            for (int j = 0; j < 3; j++) {
                accelerate();
                brake();
            }
        }
        System.out.println("Vehicle " + this.name + " has made a test-drive...");
    }

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
                        "\n-----------------------"
        );
    }

    public Workshop getWorkshop(int postcode) {
        for (int i = 0; i < workshops.size(); i++) {
            if (workshops.get(i).getPostcode() == postcode) {
                System.out.println(workshops.get(i).getName());
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
}