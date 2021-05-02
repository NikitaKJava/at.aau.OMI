package Project1;

import java.util.ArrayList;

/**
 * Created by Nikita on 21.04.2021 at 21:16
 */
public abstract class SchienenfahrzeugImpl implements Schienenfahrzeug{
    private int schienenID;
    private String beschreibung;
    private int maxGewicht;
    protected boolean isUse;

    public SchienenfahrzeugImpl(int ID, String beschreibung, int maxGewicht){
        this.schienenID = ID;
        this.beschreibung = beschreibung;
        this.maxGewicht = maxGewicht;
        this.isUse = false;
    }


    @Override
    public int getID() {
        return schienenID;
    }

    @Override
    public boolean getUse(){
        return isUse;
    }

    @Override
    public void setUse(boolean usage){
        this.isUse = usage;
    }

    @Override
    public int getMaxGewicht() {
        return maxGewicht;
    }

    @Override
    public void printInfoSchienenfahrzeug() {
        System.out.println("----SPECS----" +
                "\nID: " + getID() +
                "\nMaximales Gewicht: " + getMaxGewicht() + " Kg");
    }
}
