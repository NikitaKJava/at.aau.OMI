package Project1;

/**
 * Created by Nikita on 21.04.2021 at 20:57
 */
public interface Lokomotive extends Schienenfahrzeug{

    int getLeistung();

    int getZugkraft();

    int getBremskraft();

    void printInfoLokomotive();
}
