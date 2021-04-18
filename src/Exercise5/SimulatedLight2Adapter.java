package Exercise5;

import at.omi.smarthome.interfaces.Actor;
import at.omi.smarthome.simulation2.SimulatedLight2;

/**
 * Created by Nikita on 14.04.2021 at 19:40
 */
public class SimulatedLight2Adapter extends SimulatedLight2 implements Actor {

    private String id;
    private String name;

    public SimulatedLight2Adapter(){
        this.id = id;
        this.name = name;
    }

    @Override
    public void switchOn() {
        set(1);
    }

    @Override
    public void switchOff() {
        set(0);
    }

    @Override
    public void setId(String iD) {
        id = iD;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setName(String n) {
        name = n;
    }

    @Override
    public String getName() {
        return name;
    }
}
