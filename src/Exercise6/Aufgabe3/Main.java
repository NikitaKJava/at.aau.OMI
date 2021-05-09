package Exercise6.Aufgabe3;

/**
 * Created by Nikita on 08.05.2021 at 19:11
 */

public class Main {
    public static void main(String[] args) {

        SmarthomeManager smarthomeManager = new SmarthomeManagerFactory();

        smarthomeManager.addDevice("54654", "Licht Wohnzimmer", "A1");
        smarthomeManager.addDevice("5751", "Licht Bad", "A2");

        smarthomeManager.addDevice("45151", "Temperatur Innen", "S1");
        smarthomeManager.addDevice("3290", "Temperatur Aussen", "S1");

        smarthomeManager.switchActorsOn();
        try {
            // wait 5 seconds...
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        smarthomeManager.switchActorsOff();
        smarthomeManager.printSensorReadings();
    }
}
