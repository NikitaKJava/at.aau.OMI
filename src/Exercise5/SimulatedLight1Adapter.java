package Exercise5;

import at.omi.smarthome.interfaces.Actor;
import at.omi.smarthome.simulation1.SimulatedLight1;

/**
 * Created by Nikita on 14.04.2021 at 19:39
 */
public class SimulatedLight1Adapter extends SimulatedLight1 implements Actor { // Adapterklasse

    private String id;
    private String name;

    @Override
    public void switchOn() {
        sendCommand("CONTROL;STATUS;ON");
    }

    @Override
    public void switchOff() {
        sendCommand("CONTROL;STATUS;OFF");
    }

    @Override
    public void setId(String iD) {
        this.id = iD;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setName(String n) {
        this.name = n;
    }

    @Override
    public String getName() {
        return name;
    }
}
