package Exercise6.Aufgabe4;

/**
 * Created by Nikita on 09.05.2021 at 21:04
 */
public class Test {

    /**
     * Sie erhalten für diese Aufgabe die Klassen SomeSensorund SomeSensorReader.
     * SomeSensor simuliert einen Sensor, der zu unterschiedlichen Zeitpunkten einen
     * neuen Sensorwert zurückliefert (entsprechend einem realen Sensor sobald sich
     * der gemessene Wert ändert). SomeSensorReader simuliert ein kleines Programm,
     * das den aktuellen Messwert im Abstand von zwei Sekunden ausliestund am Bildschirm
     * ausgibt. Führe Sie die ebenfalls zur Verfügung gestellte Klasse Test aus:
     * •Was beobachten Sie? Arbeitet SomeSensorReaderbesonders effizient bzw. werden
     * öfter Werte ausgelesen als notwendig? Überlegen Sie alle Fälle, die auftreten
     * können und beschreiben Sie diese.
     * •In welchem Zeitabstand müsste SomeSensorReader den Sensor auslesen um
     * sämtliche von SomeSensorgenerierte Werte zu erfassen und gleichzeitig CPU schonend
     * zu agieren? Überlegen Sie wie eine effizientere Lösung mittels eines Observer
     * Patternsrealisiert werden könnte. Implementieren Sie eine entsprechende Lösung.
     */

    /**
     * @param args
     */
    public static void main(String[] args) {
        SomeSensor someSensor = new SomeSensor();
        SomeSensorReader someSensorReader = new SomeSensorReader(someSensor);

        // Registrieren vom Sensor
        someSensor.addObserver(someSensorReader);
    }
}