package Project1;

import java.util.ArrayList;

/**
 * Created by Nikita on 21.04.2021 at 21:06
 */

public abstract class Pool {
    int zugID;
    String zugName;

    ArrayList<Schienenfahrzeug> zugs;

    public Pool(int ID, String name) {
        this.zugID = ID;
        this.zugName = name;
        zugs = new ArrayList<>();
    }

    /**
     * Aus  den  einzelnen  Schienenfahrzeugenkönnen Züge  zusammengestellt  werden.  Jeder Zug hat   wiederum eine   ID
     * und einen   Namen.   Ein   Zug   besteht   aus   ein   oder   mehreren Schienenfahrzeugen. Ein  Schienenfahrzeug
     * kann  zu  einem  bestimmten  Zeitpunkt  nur  in einem  Zug  eingesetzt  werden. Mindestens  ein Schienenfahrzeug
     * muss  dabei  natürlich  eine Lokomotive sein. Es kann auch mehrere Lokomotiven geben.
     */
    public void addSchienenfahrzeug(Schienenfahrzeug typeOfSchienenfahrzeug) {
        if (zugs.isEmpty()) {
            if (typeOfSchienenfahrzeug instanceof WaggonImpl) {
                throw new IllegalArgumentException("Lokomotive muss vorne sein");
            } else {
                if (!typeOfSchienenfahrzeug.getUse()) {
                    zugs.add(typeOfSchienenfahrzeug);
                    typeOfSchienenfahrzeug.setUse(true);
                } else {
                    throw new IllegalArgumentException("Schienenfahrzeug ist in Verwendung");
                }
            }
        } else {
            if (!typeOfSchienenfahrzeug.getUse()) {
                zugs.add(typeOfSchienenfahrzeug);
                typeOfSchienenfahrzeug.setUse(true);
            } else {
                throw new IllegalArgumentException("Schienenfahrzeug ist angekoppelt");
            }
        }
    }

    public void listSchienenfahrzeuge(ArrayList<Schienenfahrzeug> train) {
        for (int i = 0; i < train.size(); i++) {
            System.out.println(train.get(i).getID());
        }
    }

    public void undock(int ID, ArrayList<Schienenfahrzeug> train) {
        boolean isExist = false;
        for (int i = 0; i < train.size(); i++) {
            if (train.get(i).getID() == ID) {
                train.remove(i);
                System.out.println("Schienenfahrzeug mit Index " + ID + " wurde abgekoppelt\n");
                isExist = true;
            }
        }
        if(!isExist) {
            throw new IllegalArgumentException("The Schienenfahrzeug mit " + ID + " existiert nicht");
        }
    }


    public int getZugID() {
        return zugID;
    }

    /**
     * Das gesamte maximal zulässige Gesamtgewicht  der  angehängten  Waggonsdarf  die  Zug-bzw.
     * Bremskraft  der  eingesetzten Lokomotiven  nicht  überschreiten.Dafür  soll  eseine  eigene
     * Methoden  geben,  welche  das überprüftbzw. prüft ob überhaupt eine Lokomotive vorhanden ist.
     */
    public int getTrainWeight() {
        int trainWeight = 0;
        for (int i = 0; i < zugs.size(); i++) {
            trainWeight += zugs.get(i).getMaxGewicht();
        }
        return trainWeight;
    }

    public boolean getTrainBrake() {
        if (getTrainWeight() <= (((Lokomotive) zugs.get(0)).getBremskraft())) {
            return true;
        }
        return false;
    }

    public boolean getTrainPower() {
        if (getTrainWeight() <= (((Lokomotive) zugs.get(0)).getZugkraft())) {
            return true;
        }
        return false;
    }

    public int getTrainRamainPower() {
        return (((Lokomotive) zugs.get(0)).getZugkraft()) - getTrainWeight();
    }

    public int getTrainRamainBrake() {
        return (((Lokomotive) zugs.get(0)).getBremskraft()) - getTrainWeight();
    }

    public void printInfoZug() {

        System.out.println(
                "--- ZUG INFO ---" +
                        "\nZug ID: " + zugID +
                        "\nZug Name: " + zugName +
                        "\nAnzahl der Schienenfahrzeuge: " + zugs.size() +
                        "\nGesamtgewicht: " + getTrainWeight() + "t" +
                        "\nBremskraft ausreichend?: " + getTrainBrake() +
                        "\nRestliche Bremskraft: " + getTrainRamainBrake() + " kN" +
                        "\nZugkraft ausreichend?: " + getTrainPower() +
                        "\nRestliche Leistung: " + getTrainRamainPower() + " kN" +
                        "\n----------------------"
        );
    }
}