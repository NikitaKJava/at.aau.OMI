package Exercise6.Aufgabe3;

import at.omi.smarthome.interfaces.Device;
import at.omi.smarthome.interfaces.Sensor;

/**
 * Created by Nikita on 09.05.2021 at 20:04
 */


/**
 *  Aufgabe 6.3
 * Created a Factory to generate object of concrete class based on given information.
 * use getSmarthomeManager method to get object of type shape
 */
public class SmarthomeManagerFactory extends SmarthomeManager {

    /**
     * Code Bereich unten schaut so aus, wie es vorgegeben von Factory Pattern wird,
     * deswegen wird es von SmarthomeManager Klasse uebernommen
     */

    @Override
    public Device createDevice(String id, String name, String model) {

        Device tempDevice = null;

        if (model.equals("A1")) {
            tempDevice = new SimulatedLight1Adapter();
        } else if (model.equals("A2")) {
            tempDevice = new SimulatedLight2Adapter();
        } else if (model.equals("S1")) {
            tempDevice = new SensorImpl();
            ((Sensor) tempDevice).setUnit("SomeUnit");
        }
        return tempDevice;
    }
}
