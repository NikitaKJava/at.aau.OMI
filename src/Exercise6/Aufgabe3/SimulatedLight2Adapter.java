package Exercise6.Aufgabe3;

import at.omi.smarthome.interfaces.Actor;
import at.omi.smarthome.simulation2.SimulatedLight2;

/**
 * Created by Nikita on 09.05.2021 at 19:40
 */
public class SimulatedLight2Adapter extends SimulatedLight2 implements Actor{

    private String id;

    private String name;

    private boolean on;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void switchOn(){
        this.on = true;
        this.set(1);
    }

    public void switchOff(){
        this.on = false;
        this.set(0);
    }

    public boolean isOn(){
        return this.on;
    }
}
