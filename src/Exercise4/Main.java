package Exercise4;

/**
 * Created by Nikita on 22.03.2021 at 20:21
 */

import jdk.swing.interop.SwingInterOpUtils;

/**
 * Aufgabe 3: Die Firma „Erdbewegung Maulwurf“ möchte ihre Maschinen (insbesondere Bagger und Lader)
 * über eine Java basierte Web-Plattform verwalten. Die Analyse-und initiale Designphase der
 * Applikationergab die oben abgebildete Architektur.
 */
    interface Baumaschinen {

        String getName();

        void setName(String name);

        int getLeistung();

        void setLeistung(int leistung);

        double getGewicht();

        void setGewicht(double gewicht);

        void druckeBeschreibung();

        double getBetriebsstunden();
    }

    /**
     * Bagger: Mit einem Bagger werden natürlich Löcher bzw. Gräben ausgehoben.
     * Für MitarbeiterInnen der Firma sind in dem Fall neben Leistung und Gewicht die mögliche
     * Grabtiefe (in Meter) und die Reichweite (Meter) des Baggerarms interessant um je nach
     * Auftrag das richtige Gerät zuzuweisen.
     */
    interface Bagger  {
        final double MAX_GRABTIEFE = 15;
        final double MAX_REICHWEITE = 18;

        double getGrabtiefe();

        void setGrabtiefe(double grabtiefe);

        double setReichweite();

        void setReichweite(double reichweite);

        void druckeBeschreibung();

        void graben();
    }

    /**
     * Lader:Lader werden in erster Linie dafür verwendet um größere Mengen an Material zu bewegen
     * bzw. auf LKWs zu laden. Entsprechend sind für MitarbeiterInnen das Schaufelvolumen
     * (Kubikmeter) und die (Aus-) Kipphöhe (Meter) der Schaufel entscheidend
     * (die Kipphöhe muss z.B. höher sein als einLKW, der beladen wird).
     * Realisieren Sie zunächst die dargestellte Interfacehierarchie. Die Klassenattribute
     * (unterstrichen dargestellt) MAX_GRABTIEFE, MAX_REICHWEITE, MAX_SCHAUFELVOLUMEN,
     * MAX_KIPPHOEHEsollen als finalgekennzeichnet werden.
     */
    interface Lader {
        final double MAX_SCHAUFELVOLUMEN = 10;
        final double MAX_KIPPHOEHE = 5;

        double getSchaufelvolumen();

        void setSchaufelvolumen(double grabtiefe);

        double getKipphoehe();

        void setKipphoehe(double reichweite);

        void druckeBeschreibung();

        void laden();
    }

    abstract class BaumaschinenImpl implements Baumaschinen {

        @Override
        public String getName() {
            return null;
        }

        @Override
        public void setName(String name) {

        }

        @Override
        public int getLeistung() {
            return 0;
        }

        @Override
        public void setLeistung(int leistung) {

        }

        @Override
        public double getGewicht() {
            return 0;
        }

        @Override
        public void setGewicht(double gewicht) {

        }

        @Override
        public void druckeBeschreibung() {

        }

        @Override
        public double getBetriebsstunden() {
            return 0;
        }
    }

    class BaggerImpl implements Bagger {
        int betriebsstunden = 0;

        @Override
        public double getGrabtiefe() {
            return 0;
        }

        @Override
        public void setGrabtiefe(double grabtiefe) {

        }

        @Override
        public double setReichweite() {
            return 0;
        }

        @Override
        public void setReichweite(double reichweite) {

        }

        @Override
        public void druckeBeschreibung() {

        }

        @Override
        public void graben() {
            betriebsstunden++;
        }
    }

    class LaderImpl implements Lader {

        int betriebstunden = 0;
        double kipphoehe = 0;


        @Override
        public double getSchaufelvolumen() {
            return 0;
        }

        @Override
        public void setSchaufelvolumen(double grabtiefe) {

        }

        @Override
        public double getKipphoehe() {
            return 0;
        }

        @Override
        public void setKipphoehe(double reichweite) {
            if(reichweite > MAX_KIPPHOEHE){
                System.out.println("Keipphöhe zu hoch!");
            } else {
//                Lader.kipphoehe = reichweite;
            }
        }

        @Override
        public void druckeBeschreibung() {

        }

        @Override
        public void laden() {
            betriebstunden++;
        }

    public static void main(String[] args) {
        Lader lader = new LaderImpl();
        lader.druckeBeschreibung();
    }
}
