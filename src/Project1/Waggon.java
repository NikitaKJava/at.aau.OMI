package Project1;

/**
 * Created by Nikita on 21.04.2021 at 21:01
 */
public abstract interface Waggon extends Schienenfahrzeug{

    int getSitzklasse();
    void setSitzklasse(int sitzklasse);

    int getSitzplatz();
    void setSitzplatz(int sitzplatz);

    void druckeAngabe();
}
