package Exercise4.Aufgabe2;

/**
 * Bagger: Mit einem Bagger werden natürlich Löcher bzw. Gräben ausgehoben.
 * Für MitarbeiterInnen der Firma sind in dem Fall neben Leistung und Gewicht die mögliche
 * Grabtiefe (in Meter) und die Reichweite (Meter) des Baggerarms interessant um je nach
 * Auftrag das richtige Gerät zuzuweisen.
 */
public interface Bagger extends Baumaschine {
    final double MAX_GRABTIEFE = 15;
    final double MAX_REICHWEITE = 18;

    double getGrabtiefe();

    void setGrabtiefe(double grabtiefe);

    double getReichweite();

    void setReichweite(double reichweite);

    void druckeBeschreibung();

    void graben();
}
