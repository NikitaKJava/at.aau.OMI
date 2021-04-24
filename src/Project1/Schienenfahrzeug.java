package Project1;

/**
 * Created by Nikita on 21.04.2021 at 20:51
 */
public interface Schienenfahrzeug {

    int getID();
    void setID(int id);

    int getMaxGewicht();
    void setMaxGewicht(int maxGewicht);

    void druckeBeschreibung();
}
