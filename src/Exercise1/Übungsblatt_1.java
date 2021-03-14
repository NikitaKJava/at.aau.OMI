package Exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Nikita on 02.03.2021 at 11:36
 */
public class Übungsblatt_1 {
    public static class Vehicle {
        public static ArrayList<Integer> ids = new ArrayList<>();
        public static ArrayList<String> names = new ArrayList<>();
        public static ArrayList<Integer> weights = new ArrayList<>();

        public static void main(String[] args) {

//            Scanner scanner = new Scanner(System.in);
            System.out.println("++++Vehicle Administration++++" + "\n" +
                    "Commands: q=Quit, n=New vehicle, p=Print all vehicles, s=Sort vehicles by weight command");
            start();
        }

        public static void start() {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            while (!input.equals("q")) {
                if (input.equals("n")) {
                    System.out.println("-Add a new vehicle-\n");
                    System.out.println("Enter an id: ");
                    int id = scanner.nextInt();
                    while (id < 0) {
                        System.out.println("id is negative. Enter an id again:");
                        id = scanner.nextInt();
                    }
                    System.out.println("Enter a name:");
                    String name = scanner.next();
                    while (name.isEmpty()) {
                        System.out.println("name is empty! Enter the name again:");
                        name = scanner.nextLine();
                    }
                    System.out.println("Enter a weight:");
                    int weight = scanner.nextInt();
                    while (weight < 0) {
                        System.out.println("weight is negative. Enter weight again:");
                        weight = scanner.nextInt();
                    }
                    addVehicle(id, name, weight);
                } else {

                    if (input.equals("p")) {
                        printAllVehicles();
                    }
                    if (input.equals("s")) {
                        printAllVehiclesByWeight();
                    }
                }
                System.out.println("Commands: q=Quit, n=New vehicle, p=Print all vehicles, s=Sort vehicles by weight command");
                input = scanner.next();
            }
        }


        // Aufgabe 3
        private static void addVehicle(int id, String name, int weight) {
            if (!(id < 0) && !ids.contains(id) && !(weight < 0)) {
                ids.add(id);
                names.add(name);
                weights.add(weight);
            } else {
                throw new IllegalArgumentException("Wrong argument. The program was closed");
            }
        }

        // Aufgabe 4
        private static void printAllVehicles() {
            for (int i = 0; i < ids.size(); i++) {
                System.out.println("Vehicle ID: " + ids.get(i) + ", Brand: " + names.get(i) + ", weight: " +
                        weights.get(i) + "kg");
            }
        }

        private static void printAllVehiclesByWeight() {
            ArrayList<Integer> sIds = new ArrayList<>();
            ArrayList<String> sNames = new ArrayList<>();
            ArrayList<Integer> sWeights = new ArrayList<>();

            for (int i = 0; i < ids.size(); i++) {
                sIds.add(ids.get(i));
                sNames.add(names.get(i));
                sWeights.add(weights.get(i));
            }

            for (int i = 0; i < sWeights.size() - 1; i++) {
                for (int j = 0; j < sWeights.size() - 1; j++) {
                    if (sWeights.get(i) >= sWeights.get(i + 1)) {
                        Collections.swap(sWeights, i, i + 1);
                        Collections.swap(sIds, i, i + 1);
                        Collections.swap(sNames, i, i + 1);
                    }
                }
            }
            for (int i = 0; i < sIds.size(); i++) {
                System.out.println("Vehicle ID: " + sIds.get(i) + ", Brand: " + sNames.get(i) + ", weight: " +
                        sWeights.get(i) + "kg");
            }
        }
    }
}
