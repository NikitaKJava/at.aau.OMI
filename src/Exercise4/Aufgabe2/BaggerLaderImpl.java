package Exercise4.Aufgabe2;

/**
 * Created by Nikita on 01.04.2021 at 20:09
 */

/**
 * Ein Review des initialen Interfacedesigns ergab, dass die Firma
 * auch Baggerlader (= Kombination aus Lader und Bagger) verwalten muss.
 * Erweitern Sie daher die Interfacehierarchie um das Interface
 * Baggerlader, das sowohl Bagger und Lader erweitert (extends).
 * Realisieren Sie auch eine entsprechende Implementierungsklasse, wobei Sie entweder die
 * Implementierungsklasse von Bagger oder Lader erweitern bzw. weiterverwenden können
 */
public abstract class BaggerLaderImpl extends BaumaschinenImpl implements Lader, Bagger {
    private double grabenTiefe;
    private double reichWeite;
    private double kippHoehe;
    private double schaufelVolumen;

    public BaggerLaderImpl(
            String name,
            int leistung,
            double gewicht,
            double grabentiefe,
            double reichWeite,
            double kippHoehe,
            double schaufelVolumen
    ) {
        super(name, leistung, gewicht);
        this.grabenTiefe = grabentiefe;
        this.reichWeite = reichWeite;
        this.kippHoehe = kippHoehe;
        this.schaufelVolumen = schaufelVolumen;
        setGrabtiefe(grabenTiefe);
        setReichweite(reichWeite);
        setKipphoehe(kippHoehe);
        setSchaufelvolumen(schaufelVolumen);
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

    public double getReichweite() {
        return reichWeite;
    }

    @Override
    public void setReichweite(double reichweite) {
        if (reichweite > MAX_REICHWEITE) {
            throw new IllegalArgumentException("Input Reichweite is more than " + MAX_REICHWEITE);
        }
        this.reichWeite = reichweite;
    }

    @Override
    public void graben() {
        setBetriebsStunden();
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
    public void laden() {
        setBetriebsStunden();
    }

    @Override
    public void druckeBeschreibung() {
        super.druckeBeschreibung();
        System.out.println("----BACKHOE LOADER WORKING RANGES----" +
                "\nGrabentiefe: " + getGrabtiefe() + " Meter" +
                "\nReichweite: " + getReichweite() + " Meter" +
                "\nKipphöhe: " + getKipphoehe() + " Meter" +
                "\nSchaufelvolumen: " + getSchaufelvolumen() + " m³" +
                "\n" + getBetriebsStunden() +
                "\n-----------------------------");
    }

    public String getBetriebsStunden() {
        return "Betriebsstunden: " + super.getBetriebsstunden() + " Std.";
    }

    private void setBetriebsStunden() {
        super.setBetriebsstunden();
    }
}

