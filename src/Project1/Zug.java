package Project1;

/**
 * Created by Nikita on 21.04.2021 at 21:06
 */
public abstract class Zug implements Lokomotive, Waggon{
    String ID;
    String Name;



    @Override
    public int getLeistung() {
        return 0;
    }

    @Override
    public void setLeistung(int leistung) {

    }

    @Override
    public int getZugkraft() {
        return 0;
    }

    @Override
    public void setZugkraft(int zugkraft) {

    }

    @Override
    public int getBremskraft() {
        return 0;
    }

    @Override
    public void setBremskraft(int bremskraft) {

    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public void setID(int id) {

    }

//    @Override
    public String getBeschreibung() {
        return null;
    }

//    @Override
    public void setBeschreibung(String beschreibung) {

    }

    @Override
    public int getMaxGewicht() {
        return 0;
    }

    @Override
    public void setMaxGewicht(int maxGewicht) {

    }

    @Override
    public int getSitzklasse() {
        return 0;
    }

    @Override
    public void setSitzklasse(int sitzklasse) {

    }

    @Override
    public int getSitzplatz() {
        return 0;
    }

    @Override
    public void setSitzplatz(int sitzplatz) {

    }

//    @Override
    public String getAngabe() {
        return null;
    }

//    @Override
    public void setAngabe(String angabe) {

    }
}
