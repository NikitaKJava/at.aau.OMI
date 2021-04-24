package Project1;

/**
 * Created by Nikita on 21.04.2021 at 21:14
 */
public abstract class LokomotiveImpl extends SchienenfahrzeugImpl implements Lokomotive {
    private int leistung;
    private int zugkraft;
    private int bremskraft;

    public LokomotiveImpl(int id, String beschreibung, int maxGewicht, int leistung, int zugkraft, int bremskraft) {
        super(id, beschreibung, maxGewicht);
        this.leistung = leistung;
        this.zugkraft = zugkraft;
        this.bremskraft = bremskraft;
        setLeistung(leistung);
        setZugkraft(zugkraft);
        setBremskraft(bremskraft);
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
    public int getZugkraft() {
        return zugkraft;
    }

    @Override
    public void setZugkraft(int zugkraft) {
        this.zugkraft = zugkraft;
    }

    @Override
    public int getBremskraft() {
        return bremskraft;
    }

    @Override
    public void setBremskraft(int bremskraft) {
        this.bremskraft = bremskraft;
    }
}
