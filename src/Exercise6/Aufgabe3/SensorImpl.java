package Exercise6.Aufgabe3;

import at.omi.smarthome.interfaces.Sensor;

/**
 * Created by Nikita on 09.05.2021 at 20:46
 */
public class SensorImpl extends DefaultDeviceImpl implements Sensor {


    private String unit;


    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getValue() {
        //simulate some real world sensor reading
        return Math.random() * 30;
    }
}