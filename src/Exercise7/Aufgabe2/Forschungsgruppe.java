package Exercise7.Aufgabe2;

/**
 * Created by Nikita on 12.05.2021 at 14:30
 */
public class Forschungsgruppe implements Forschungsgruppen{

    private String bezeichnung;
    private String boss;
    private int numberEmployees;
    private int numberPublications;

    public Forschungsgruppe(String bezeichnung, String boss, int numberEmployees, int numberPublications){
        this.bezeichnung = bezeichnung;
        this.boss = boss;
        this.numberEmployees = numberEmployees;
        this.numberPublications = numberPublications;
    }

    @Override
    public String getName() {
        return bezeichnung;
    }
    @Override
    public String getLeiter() {
        return boss;
    }

    @Override
    public int getNumberEmployees() {
        return numberEmployees;
    }

    @Override
    public int getNumberPublications() {
        return numberPublications;
    }

    @Override
    public void printInfo(){
        System.out.println( "\n--- FORSCHUNGSGRUPPE INFO ---" +
                            "\nDie Forschungsgruppe: " + getName() +
                            "\nhat den Leiter/Leitering: " + getLeiter() + " und \n" +
                            getNumberEmployees() + " Mitarbeiter mit " +
                            getNumberPublications() + " Publikationen" +
                            "\n-----------------------------");
    }
}
