package Project1;

/**
 * Created by Nikita on 21.04.2021 at 21:53
 */
public abstract class WaggonImpl extends SchienenfahrzeugImpl implements Waggon {
    private int sitzKlasse;
    private int sitzPlatz;

    public WaggonImpl(int ID, String beschreibung, int maxGewicht, int sitzKlasse, int sitzPlatz) {
        super(ID, beschreibung, maxGewicht);
        this.sitzKlasse = sitzKlasse;
        this.sitzPlatz = sitzPlatz;
        setSitzklasse(sitzKlasse);
        setSitzplatz(sitzPlatz);
    }

    public int getSitzKlasse() {
        return sitzKlasse;
    }

    public void setSitzKlasse(int sitzKlasse) {
        this.sitzKlasse = sitzKlasse;
    }

    public int getSitzPlatz() {
        return sitzPlatz;
    }

    public void setSitzPlatz(int sitzPlatz) {
        this.sitzPlatz = sitzPlatz;
    }

    @Override
    public void druckeAngabe() {
        System.out.println("----SITZ----" +
                "\nSitzklasse: " + getSitzklasse() +
                "\nSitzplatz Nr.: " + getSitzplatz());
    }
}