package Project1;

/**
 * Created by Nikita on 21.04.2021 at 21:53
 */
public abstract class WaggonImpl extends SchienenfahrzeugImpl implements Waggon {

    int sitzKlasse;
    int sitzPlatz;

    public WaggonImpl(
            int ID,
            String beschreibung,
            int maxGewicht,
            int sitzKlasse,
            int sitzPlatz
    ) {
        super(ID, beschreibung, maxGewicht);
        this.sitzKlasse = sitzKlasse;
        this.sitzPlatz = sitzPlatz;
    }
    @Override
    public int getSitzklasse(){
        return sitzKlasse;
    }

    @Override
    public int getSitzplatz() {
        return sitzPlatz;
    }



    @Override
    public void printInfoWaggon() {
        super.printInfoSchienenfahrzeug();
        System.out.println("----SITZ----" + "\n" +
                "Sitzklasse: " + getSitzklasse() + "\n" +
                "Sitzplatz Nr: " + getSitzplatz() + "\n"
        );
    }
}