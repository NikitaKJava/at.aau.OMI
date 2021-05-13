package Exercise7.Aufgabe2;

/**
 * Created by Nikita on 12.05.2021 at 14:33
 */
public class Main {
    public static void main(String[] args) {
        Institut institut1 = new Institut("Informatik", "Informatik Generaldirektor");
        Forschungsgruppe fg1 = new Forschungsgruppe("OMI", "OMI 1 DDr. Senior Scientist", 10, 2);
        Forschungsgruppe fg2 = new Forschungsgruppe("Datenbanken", "Datenbanken 2 Dr. Senior Scientist", 12, 1);
        Forschungsgruppe fg3 = new Forschungsgruppe("Webtech", "Webtech Senior Scientist", 25, 1);
        Forschungsgruppe fg4 = new Forschungsgruppe("SE1", "SE1 4 Senior Scientist", 25, 5);
        Forschungsgruppe fg5 = new Forschungsgruppe("SE2", "SE2 5 Senior Scientist", 51, 13);

        institut1.add(fg1);
        institut1.add(fg2);
        institut1.add(fg3);
        institut1.add(fg4);
        institut1.add(fg5);


        institut1.printInfo();
        fg1.printInfo();
        fg2.printInfo();
        fg3.printInfo();
        fg4.printInfo();
        fg5.printInfo();
    }
}
