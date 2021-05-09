package Exercise6.Aufgabe2;

import java.util.ArrayList;

/**
 * Created by Nikita on 08.03.2021 at 19:04
 */
public class Main {

    public static void main(String[] args) {


        Brand BENZ = new Brand("Mercedes Benz", "Germany", "+49231311", "mb@benz.de");
        Brand BMW = new Brand("BMW", "Germany", "+49511191", "www.bmw@bmw.de");
        Brand VW = new Brand("VW", "Germany", "+496516516951", "vw@volk.de");
        Brand TESLA = new Brand("TESLA", "USA", "+016516516951", "tesla@tesla.com");

        Workshop workshop1 = new Workshop("MotoSport Klagenfurt", "Austria", 9020, "Klagenfurt", "Voelkermarkter str 18", "+4312345678");
        Workshop workshop2 = new Workshop("MotoSport Berlin", "Germany", 90200, "Berlin", "Muenchner Strasse 26", "+4912388678");
        Workshop workshop3 = new Workshop("Cars4U", "Austria", 9020, "Klagenfurt", "Karawanken Gasse 1", "+43409023289");

        ArrayList<Workshop> workshops = new ArrayList<>(); //initialisation of a list of workshops
        workshops.add(workshop1);
        workshops.add(workshop2);
        workshops.add(workshop3);

        VehicleAdministration admin = VehicleAdministration.getInstance(); // Aufgabe 6.2 - kann nur einmalig aufgerufen werden

//        Vehicle testDrive = new Vehicle();
//        testDrive.drive(20);

//        Vehicle vehicle1 = new Vehicle("C220 TDI", BENZ, workshops, 1950, 2500, 220);
//        Vehicle vehicle2 = new Vehicle("M3", BMW, workshops, 1800, 2300, 300);
//        Vehicle vehicle3 = new Vehicle("ARTEON", VW, workshops, 1900, 2400, 240);
//        Vehicle vehicle4 = new ElectricalCar("X", TESLA, workshops, 2500, 3000, 250, 100, 100, 1);

        Car car1 = new Car("C220 TDI", BENZ, workshops, 1950, 2500, 220, 60, 0.6);
        Car car2 = new Car("M3", BMW, workshops, 1800, 2300, 300, 70, 0.8);
        Car car3 = new Car("ARTEON", VW, workshops, 1900, 2400, 240, 65, 0.9);
        ElectricCar car4 = new ElectricCar("X", TESLA, workshops, 2500, 3000, 250, 100, 1.5);

//        VehicleAdministration admin = new VehicleAdministration();
        admin.addVehicle(car1);
        admin.addVehicle(car2);
        admin.addVehicle(car3);
        admin.addVehicle(car4);

        car4.charge(50, 1);
        car3.drive(2);


//        admin.printAllVehicles(); //demonstration of printing method working
//        admin.printAllVehiclesByWeight(); //demonstration of printing by weight method working
//        admin.removeVehicle(1002); //demonstration of deleting a certain vehicle by ID
//        admin.search(1001); //demonstration of searching a certain vehicle by ID
        /**
         * Aufgabe 5.2: Implementieren Sie in der Klasse VehicleAdministration die Methode public void
         * search(String brandName). Die Methode soll alle Fahrzeuge mit dem übergebenen
         * Markennamen am Bildschirm ausgeben.
         */
//        admin.search('/');    //demo of searchin' vehicles by their name
//        System.out.println("--------printAllVehicles--------" );
//        admin.printAllVehicles();
//        System.out.println("+++++++printVehiclesByWeight++++++");
//        admin.printAllVehiclesByWeight();
//        System.out.println("+++++++printAllVehicles++++++");
//        admin.printAllVehicles();
//        System.out.println("+++++++search++++++");
//        admin.search(3);
//        System.out.println("+++++++remove++++++");
//        admin.removeVehicle(3);
//        System.out.println("+++++++printAllVehicles++++++");
//        admin.printAllVehicles();
//        System.out.println("+++++++search++++++");
        //System.out.println("+++++++getWorkshop++++++");
//        System.out.println("Workshop: "+car4.getWorkshop(9020).getName() + ", " + car4.getWorkshop(9020).getPhone());

//        car4.printInfo();



    }
}