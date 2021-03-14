package Exercise2;

import java.util.ArrayList;

/**
 * Created by Nikita on 08.03.2021 at 19:04
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Workshop> list = new ArrayList<>(); //initialisation of a list of workshops

        Brand BENZ = new Brand("Mercedes Benz", "Germany", "+49231311", "mb@benz.de");
        Brand BMW = new Brand("BMW", "Germany", "+49511191", "www.bmw@bmw.de");
        Brand VW = new Brand("VW", "Germany", "+496516516951", "vw@volk.de");

        Workshop Austria = new Workshop("MotoSport Klagenfurt", "Austria", 9020, "Klagenfurt", "Voelkermarkter str", "+4312345678");
        Workshop Germany = new Workshop("MotoSport Berlin", "Germany", 90200, "Berlin", "Muenchner Strasse", "+4912388678");

        list.add(Austria);
        list.add(Germany);

        VehicleAdministration admin = new VehicleAdministration();
        admin.addVehicle(new Vehicle(1001, "C220 TDI", BENZ, list, 1950, 2500, 220));
        admin.addVehicle(new Vehicle(1002, "M3", BMW, list, 1800, 2300, 300));
        admin.addVehicle(new Vehicle(1003, "ARTEON", VW, list, 1900, 2400, 240));

        /**
         * Test methods
         */

//        admin.printAllVehicles(); //demonstration of printing method working

        admin.printAllVehiclesByWeight(); //demonstration of printing by weight method working

//        admin.removeVehicle(1002); //demonstration of deleting a certain vehicle by ID
//        admin.printAllVehicles();
//        admin.search(1001); //demonstration of searching a certain vehicle by ID
        /**
         * Aufgabe 5.2: Implementieren Sie in der Klasse VehicleAdministration die Methode public void
         * search(String brandName). Die Methode soll alle Fahrzeuge mit dem übergebenen
         * Markennamen am Bildschirm ausgeben.
         */
        admin.search('/');    //demo of searchin' vehicles by their name
    }
}
