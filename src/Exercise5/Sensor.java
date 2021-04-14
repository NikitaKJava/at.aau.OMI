package Exercise5;

/**
 * Created by Nikita on 14.04.2021 at 19:33
 */
public interface Sensor extends Device{
    void setUnit(String unit);
    String getUnit();
    double getValue();
}
