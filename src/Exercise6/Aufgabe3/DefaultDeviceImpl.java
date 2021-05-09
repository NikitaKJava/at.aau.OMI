package Exercise6.Aufgabe3;

import at.omi.smarthome.interfaces.Device;

/**
 * Created by Nikita on 09.05.2021 at 21:23
 */


public abstract class DefaultDeviceImpl implements Device{

    private String id;
    private String name;


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
}