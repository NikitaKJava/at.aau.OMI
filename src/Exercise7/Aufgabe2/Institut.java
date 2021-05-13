package Exercise7.Aufgabe2;

import java.util.ArrayList;

/**
 * Created by Nikita on 10.05.2021 at 20:31
 */
public class Institut implements Forschungsgruppen{

    private String bezeichnung;
    private String leiter;
    private ArrayList<Forschungsgruppen> forschungsgruppenArrayList;

    public Institut(String bezeichnung, String boss){
        this.bezeichnung = bezeichnung;
        this.leiter = boss;
        forschungsgruppenArrayList = new ArrayList<Forschungsgruppen>();
    }

    @Override
    public String getName(){
        return bezeichnung;
    }

    @Override
    public String getLeiter(){
        return leiter;
    }

    @Override
    public int getNumberEmployees(){
        int number = 0;
        for(Forschungsgruppen fg : forschungsgruppenArrayList)
            number = number + fg.getNumberEmployees();
        return number;
    }

    @Override
    public int getNumberPublications() {
        int number = 0;
        for(Forschungsgruppen fg : forschungsgruppenArrayList)
            number = number + fg.getNumberPublications();
        return number;
    }

    @Override
    public void printInfo(){
        System.out.println( "\n--- INSTITUT INFO ---" +
                            "\nDie Forschungsrichtung: " + getName() +
                            "\nhat den Leiter/Leitering: " + getLeiter() +
                            "\n---------------------");
    }

    public void add(Forschungsgruppen fg){
        forschungsgruppenArrayList.add(fg);
    }

    public void remove(Forschungsgruppen fg){
        forschungsgruppenArrayList.remove(fg);
    }
}