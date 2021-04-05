package Exercise4.Aufgabe2;

/**
 * Created by Nikita on 22.03.2021 at 20:21
 */
public abstract class LaderImpl extends BaumaschinenImpl implements Lader {
    private double kippHoehe;
    private double schaufelVolumen;

    public LaderImpl(String name,
                     int leistung,
                     double gewicht,
                     double kippHoehe,
                     double schaufelVolumen) {
        super(name, leistung, gewicht);
        this.kippHoehe = kippHoehe;
        this.schaufelVolumen = schaufelVolumen;
        setKipphoehe(kippHoehe);
        setSchaufelvolumen(schaufelVolumen);
    }

    @Override
    public double getSchaufelvolumen() {
        return schaufelVolumen;
    }

    @Override
    public void setSchaufelvolumen(double schaufelVolumen) {
        if (schaufelVolumen > MAX_SCHAUFELVOLUMEN) {
            System.out.println("ACHTUNG: SCHAUFELVOLUMEN ZU GROSS!");
        } else {
            this.schaufelVolumen = schaufelVolumen;
        }
    }

    @Override
    public double getKipphoehe() {
        return kippHoehe;
    }

    @Override
    public void setKipphoehe(double kippHoehe) {
        if (kippHoehe > MAX_KIPPHOEHE) {
            System.out.println("ACHTUNG: KIPPHÖHE ZU GROSS!");
        } else {
            this.kippHoehe = kippHoehe;
        }
    }

    @Override
    public void druckeBeschreibung() {
        super.druckeBeschreibung();
        System.out.println("----LOADER WORKING RANGES----" +
                "\nKipphöhe: " + getKipphoehe() + " Meter" +
                "\nSchaufelvolumen: " + getSchaufelvolumen() + " m³" +
                "\nBetriebsstunden: " + getBetriebsStunden() + " Stunden" +
                "\n--------------------");
    }

    @Override
    public void laden() {
        setBetriebsStunden();
    }

    public double getBetriebsStunden() {
        return super.getBetriebsstunden();
    }

    private void setBetriebsStunden() {
        super.setBetriebsstunden();
    }
}
