package Exercise4.Aufgabe2;

/**
 * Created by Nikita on 31.03.2021 at 16:00
 */
abstract class BaumaschinenImpl implements Baumaschine {
    private String name;
    private int leistung;
    private double gewicht;
    private double betriebsStunden = 0.0;

    public BaumaschinenImpl(String name, int leistung, double gewicht) {
        this.name = name;
        this.leistung = leistung;
        this.gewicht = gewicht;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getLeistung() {
        return leistung;
    }

    @Override
    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    @Override
    public double getGewicht() {
        return gewicht;
    }

    @Override
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    public void druckeBeschreibung() {
        System.out.println("----SPECS----" +
                "\nName: " + getName() +
                "\nLeistung: " + getLeistung() + " PS" +
                "\nGewicht: " + getGewicht() + " Kg");
    }

    @Override
    public double getBetriebsstunden() {
        return betriebsStunden;
    }

    public void setBetriebsstunden() {
        this.betriebsStunden++;
    }
}
