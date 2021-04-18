package Exercise5;

import java.awt.EventQueue;
import java.util.ArrayList;

import at.omi.smarthome.gui.SmarthomeGUI;
import at.omi.smarthome.interfaces.Actor;
import at.omi.smarthome.interfaces.Device;
import at.omi.smarthome.simulation1.SimulatedLight1;
import at.omi.smarthome.simulation2.SimulatedLight2;

/**
 * Created by Nikita on 14.04.2021 at 19:11
 */

/**
 * Aufgabe 5.4: SmarthomeSysteme versprechendie Realisierung von automatisierten bzw.
 * „intelligenten“ Wohnumgebungen durch die Verknüpfung von verschiedenen Geräten und
 * Applikationen im eigenen Zuhause.Einzentraler Punkt ist dabei die Einbindung von Sensoren
 * (Temperaturfühler, Bewegungsmelder, etc.) und sogenannten Aktoren, welche eine Ansteuerung
 * der funktionalen Elemente eines Hauses (Licht, Rollos, etc.) ermöglichen.Ein Problem im
 * Bereich der Gebäude-automatisierung für private Haushalte istdabeinach wie vor die
 * fehlendeStandardisierung von Kommunikationsschnittstellen der verfügbaren Systeme
 * (ein Sensor von Hersteller X kann z.B. nichtohne Weiteres einen Aktor von Hersteller Y
 * ansteuern).SpezielleMiddleware-Plattformen (z.B. openHAB -www.openhab.org) ermöglichen
 * die Einbindung von verschiedenen Systemen in eine einheitliche Kommunikationsstruktur
 * über entsprechendeTreiber-bzw. Adapterlösungen. So können beispielsweise ursprünglich
 * nicht kompatible Komponenten(Sensoren, Aktoren, etc.)dennoch über eine einheitliche,
 * zentrale Benutzerschnittstelle gesteuert werden.Sie erhalten mit diesem Übungsblatt die
 * Implementierung einer sehr vereinfachten Benutzerschnittstelle einer Smarthome-Middleware,
 * mit deren Hilfe sich eingebundeneAktoren wie Lichter oder Lampenvon verschiedenen Herstellern
 * steuern lassensollen:
 */
public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {

//                    SimulatedLight1 sl1 = new SimulatedLight1();
//                    SimulatedLight2 sl2 = new SimulatedLight2();

                    ArrayList<Device> devices = new ArrayList<Device>();

                    /*
                     *  TO-DO: Add devices (instances of adapter classes) to ArrayList device
                     */

                    Actor a1 = new SimulatedLight1Adapter();
                    a1.setId("532521");
                    a1.setName("Lampe Wohnzimmer");

                    Actor a2 = new SimulatedLight2Adapter();
                    a2.setId("552521");
                    a2.setName("Licht Bad");

                    devices.add(a1);
                    devices.add(a2);

                    SmarthomeGUI smarthome = new SmarthomeGUI(devices);
                    smarthome.setVisible(true);

                    a1.switchOn();
                    a2.switchOn();


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
