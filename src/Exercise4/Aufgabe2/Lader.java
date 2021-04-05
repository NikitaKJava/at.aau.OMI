package Exercise4.Aufgabe2;

/**
 * Lader:Lader werden in erster Linie dafür verwendet um größere Mengen an Material zu bewegen
 * bzw. auf LKWs zu laden. Entsprechend sind für MitarbeiterInnen das Schaufelvolumen
 * (Kubikmeter) und die (Aus-) Kipphöhe (Meter) der Schaufel entscheidend
 * (die Kipphöhe muss z.B. höher sein als einLKW, der beladen wird).
 * Realisieren Sie zunächst die dargestellte Interfacehierarchie. Die Klassenattribute
 * (unterstrichen dargestellt) MAX_GRABTIEFE, MAX_REICHWEITE, MAX_SCHAUFELVOLUMEN,
 * MAX_KIPPHOEHEsollen als final gekennzeichnet werden.
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
