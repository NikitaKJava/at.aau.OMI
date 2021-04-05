package Exercise4.Aufgabe2;

/**
 * Aufgabe 3: Die Firma „Erdbewegung Maulwurf“ möchte ihre Maschinen (insbesondere Bagger und Lader)
 * über eine Java basierte Web-Plattform verwalten. Die Analyse-und initiale Designphase der
 * Applikationergab die oben abgebildete Architektur.
 */
interface Baumaschine {

    String getName();

    void setName(String name);

    int getLeistung();

    void setLeistung(int leistung);

    double getGewicht();

    void setGewicht(double gewicht);

    void druckeBeschreibung();

    double getBetriebsstunden(); // public ist grau weil interface standard public
}
