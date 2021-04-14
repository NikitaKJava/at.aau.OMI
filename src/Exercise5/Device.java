package Exercise5;

import at.omi.smarthome.gui.SmarthomeGUI;

/**
 * Created by Nikita on 14.04.2021 at 19:27
 */
public interface Device {

    void setId(String id);
    String getId();
    void setName(String name);
    String getName();
}
