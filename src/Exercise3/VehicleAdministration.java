package Exercise3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Nikita on 13.03.2021 at 13:00
 */
class VehicleAdministration {
    private ArrayList<Vehicle> vehicles;

    /**
     * Aufgabe 3: Initialisiert vehicles mit einer neuen, leeren ArrayList.
     */
    public VehicleAdministration() {
        vehicles = new ArrayList<>();
    }

    /**
     * Aufgabe 3: Fügt ein Fahrzeug – Objekt zu vehicles hinzu sofern
     * noch kein Fahrzeug mit derselben Id vorhanden ist.
     */
    public void addVehicle(Vehicle vehicle) throws IllegalArgumentException {
        if (!vehicles.contains(vehicle.getId())) {
            vehicles.add(vehicle);
        } else
            throw new IllegalArgumentException("The vehicle should have an unique id");
    }

    public void addVehicle (String name, Brand brand, ArrayList<Workshop> workshops, int weight, int maxPermissibleWeight, double maxSpeed) {
        Vehicle tempVehicle = new Vehicle(name, brand, workshops, weight,maxPermissibleWeight, maxSpeed);
        this.addVehicle(tempVehicle);
    }

    /**
     * Aufgabe 3: Entfernt das Fahrzeug mit der übergebenen Id aus
     * vehicles (falls vorhanden).
     */
    public void removeVehicle(int vehicleID) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getId() == vehicleID) {
                vehicles.remove(i);
            }
        }
    }

    /**
     * Aufgabe 3: Gibt die Informationen des Fahrzeugs mit der übergebenen Id am Bildschirm aus (falls vorhanden).
     */
    public void search(int vehicleID) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getId() == vehicleID) {
                vehicles.get(i).printInfo();
            }
        }
    }

    /**
     * Aufgabe 5.2: Implementieren Sie in der Klasse VehicleAdministration die Methode public void
     * search(String brandName). Die Methode soll alle Fahrzeuge mit dem übergebenen
     * Markennamen am Bildschirm ausgeben.
     */
    public void search(String name) {
        boolean found = false;
        if(name.equals("")){
            System.out.println("ENTER SEARCHING NAME");
            found = true;
        }
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getName().equals(name)) {
                vehicles.get(i).printInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.print(name + " --> NOT FOUND");
        }
    }
    /**
     * Aufgabe 5.3: Überlegen Sie sich eine sinnvolle Möglichkeit die Methode addVehicle(Vehicle vechicle) der
     * Klasse VehicleAdministration zu überladen und implementieren Sie diese.
     */
    public void search(char character) {
        if(character == '!' || character == '"' || character == '§' || character == '$' || character == '&' || character == '%' || character == '/' || character == '<'){
            System.out.print(character + " --> NOT ALLOWED");
        }
    }

    /**
     * Aufgabe 3: Gibt die Informationen aller in vehicles vorhandene Fahrzeuge am Bildschirm aus indem jeweils die
     * printInfo() – Methode des Fahrzeugs aufgerufen wird.
     */
    public void printAllVehicles() {
        for (Vehicle v : vehicles) {
            v.printInfo();
        }
    }

    /**
     * Aufgabe 4: sorting for printAllVehiclesByWeight()
     */
    private void sortAllVehiclesByWeight() {
        ArrayList<Vehicle> sortedList; // creating a new arraylist for sorting to not destroy initial arraylist
        sortedList = vehicles;
        for (int i = 0; i < sortedList.size() - 1; i++) {
            if (sortedList.get(i).getWeight() > sortedList.get(i + 1).getWeight()) {
                Collections.swap(sortedList, i, i + 1);
                sortAllVehiclesByWeight();
            }
        }
    }
    /**
     * Aufgabe 4: printAllVehiclesByWeight()
     */
    public void printAllVehiclesByWeight() {
        System.out.println("""

                The vehicles are sorted by it's weight...\s
                *********************""");
        sortAllVehiclesByWeight();
        printAllVehicles();
    }

    /** Uebungsblatt 3 Aufgabe 4.2
     * Erweitern Sie VehicleAdministration um folgende Methoden:
     */
    public void fillUpAllCars(double fuel){
        for (Vehicle vehicle: vehicles){
            if (vehicle instanceof Car){
                ((Car) vehicle).fillUp(fuel);
            }
        }
        System.out.println("All cars are filled up on " +  fuel + "litres...");
    }

    public void chargeAllElectricCars(double power, double hours) {
        for (Vehicle vehicle: vehicles) {
            if(vehicle instanceof ElectricCar){
                ((ElectricCar) vehicle).charge(power, hours);
            }
        }
        System.out.println("All e-cars now charged...");
    }
}
