package Exercise4.Aufgabe2;

/**
 * Created by Nikita on 31.03.2021 at 15:59
 */
public abstract class BaggerImpl extends BaumaschinenImpl implements Bagger {
    private double grabenTiefe;
    private double reichWeite;

    public BaggerImpl(String name,
                      int leistung,
                      double gewicht,
                      double grabenTiefe,
                      double reichWeite) {
        super(name, leistung, gewicht);
        this.grabenTiefe = grabenTiefe;
        this.reichWeite = reichWeite;
        setGrabtiefe(grabenTiefe);
        setReichweite(reichWeite);
    }

    @Override
    public double getGrabtiefe() {
        return grabenTiefe;
    }

    @Override
    public void setGrabtiefe(double grabenTiefe) {
        if (grabenTiefe > MAX_GRABTIEFE) {
            System.out.println("ACHTUNG: GRABTIEFE ZU GROSS!");
        } else {
            this.grabenTiefe = grabenTiefe;
        }
    }
    @Override
    public double getReichweite(){
        return reichWeite;
    }

    @Override
    public void setReichweite(double reichWeite) {
        if (reichWeite > MAX_REICHWEITE) {
            System.out.println("ACHTUNG: REICHWEITE ZU GROSS!");
        } else {
            this.reichWeite = reichWeite;
        }
    }

    @Override
    public void druckeBeschreibung() {
        super.druckeBeschreibung();
        System.out.println("----EXCAVATOR WORKING RANGES----" +
                "\nGrabtiefe: " + getGrabtiefe() + " Meter" +
                "\nReichweite: " + getReichweite() + " Meter" +
                "\nBetriebsstunden: " + getBetriebsstunden() + " Stunden" +
                "\n--------------------");
    }

    @Override
    public void graben() {
        setBetriebsStunden();
    }

    public double getBetriebsStunden() {
        return super.getBetriebsstunden();
    }

    public void setBetriebsStunden() {
        super.setBetriebsstunden();
    }
}
