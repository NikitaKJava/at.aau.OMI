package Project1;

/**
 * Created by Nikita on 21.04.2021 at 20:57
 */
public interface Lokomotive extends Schienenfahrzeug{

    int getLeistung();
    void setLeistung(int leistung);

    int getZugkraft();
    void setZugkraft(int zugkraft);

    int getBremskraft();
    void setBremskraft(int bremskraft);
}
