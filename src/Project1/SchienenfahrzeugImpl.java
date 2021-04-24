package Project1;

/**
 * Created by Nikita on 21.04.2021 at 21:16
 */
public abstract class SchienenfahrzeugImpl implements Schienenfahrzeug{
    private int ID;
    private String beschreibung;
    private int maxGewicht;

    public SchienenfahrzeugImpl(int ID, String beschreibung, int maxGewicht){
        this.ID = ID;
        this.beschreibung = beschreibung;
        this.maxGewicht = maxGewicht;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public int getMaxGewicht() {
        return maxGewicht;
    }

    @Override
    public void setMaxGewicht(int maxGewicht) {
        this.maxGewicht = maxGewicht;
    }

    @Override
    public void druckeBeschreibung() {
        System.out.println("----SPECS----" +
                "\nID: " + getID() +
                "\nMaximales Gewicht: " + getMaxGewicht() + " Kg");
    }
}
