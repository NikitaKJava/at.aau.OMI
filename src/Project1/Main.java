package Project1;

/**
 * Created by Nikita on 21.04.2021 at 20:49
 */
public class Main {
    public static void main(String[] args) {

/**
 * Objektorientierte Modellierung und Implementierung
 *              Projekt 1
 *          Fercher, Qureshi
 * Implementieren Sie folgendes Szenario in Java:
 * Überlegen  Sie  selbst,  welche (abstrakte)Klassen, Methodenund  Variablen benötigt  werden bzw. wie mögliche Vererbungsstrukturen
 * aufgebaut werden sollen.
 *
 * Ein auf Personenverkehr spezialisiertes Eisenbahnunternehmen betreibt    mehrere Schienenfahrzeuge   bzw.   Züge.
 * Schienenfahrzeuge   sind   entweder   Lokomotiven   oder Waggons.
 *
 * Jedes   Schienenfahrzeug   hat   eine   ID, eine   Beschreibung   sowie
 * einmaximal zulässiges Gesamtgewicht.Eine Lokomotive  hateine  Leistung,  eine  bestimmte  Zugkraft  sowie  eine bestimmte   Bremskraft.
 * Ein   Waggon   hat   eine   Sitzklasse   sowie   eine   Angabe   zu   den vorhandenen   Sitzplätzen.Die vorhandenen   Schienenfahrzeuge
 * sollen   in   einem   Pool verwaltet   werden,   welcher   Methodenzur   Verwaltung   der   Fahrzeuge   bereitstellt. Von diesem
 * Pool  soll  es  im  System  immer  nur  eine  Instanz  geben  können(überlegen  Sie  sich dafür ein entsprechendes Design Pattern).
 *
 * Aus  den  einzelnen  Schienenfahrzeugen können Züge  zusammengestellt  werden.  Jeder Zug hat   wiederum eine ID und einen   Namen.
 * Ein   Zug   besteht   aus   ein   oder   mehreren Schienenfahrzeugen. Ein  Schienenfahrzeug  kann  zu  einem  bestimmten  Zeitpunkt
 * nur  in einem  Zug  eingesetzt  werden. Mindestens  ein Schienenfahrzeug  muss  dabei  natürlich  eineLokomotive sein.Es kann auch
 * mehrere Lokomotiven geben. Das gesamte maximal zulässige Gesamtgewicht  der  angehängten  Waggonsdarf  die  Zug-bzw.  Bremskraft  der
 * eingesetzten Lokomotiven  nicht  überschreiten.Dafür  soll  eseine  eigene  Methoden  geben,  welche  das überprüftbzw. prüft ob überhaupt
 * eine Lokomotive vorhanden ist.
 *
 * In zukünftigen   Implementierungen   solle   es   auch sogenannt   Triebwagen   geben.   Ein Treibwagen  ist
 * sowohl  eine  Lokomotive  als  auch  einWaggon  mit  Sitzplätzen.  Skizzieren  Sie hierfür (aber implementieren Sie notwendigerWeise nicht)
 * eine mögliche Lösung.
 *
 * Schreiben Sie auch eine Testklasse mit einer main-Methode, in der Sie Ihre Implementierung testen.
 */

        LokomotiveImpl DIESELLOK1 = new LokomotiveImpl(1001, "DIESEL V200", 20, 6400, 250, 250){};
        LokomotiveImpl DIESELELEKTROLOK2 = new LokomotiveImpl(1002, "DIESEL-ELEKTRO HYBRID DEH-300", 21, 6600, 260, 260){};

        WaggonImpl Waggon1 = new WaggonImpl(2001, "ERSTE KLASSE WAGGON", 10, 1, 10){};
        WaggonImpl Waggon2 = new WaggonImpl(2002, "ZWEITE KLASSE WAGGON", 10, 2, 30){};
        WaggonImpl Waggon3 = new WaggonImpl(2003, "ZWEITE KLASSE WAGGON", 10, 2, 30){};
        WaggonImpl Waggon4 = new WaggonImpl(2004, "ERSTE KLASSE WAGGON", 10, 1, 10){};
        WaggonImpl Waggon5 = new WaggonImpl(2005, "ZWEITE KLASSE WAGGON", 10, 2, 30){};

        Pool zug1 = new Pool(1101, "ICE WIEN - KLAGENFURT") {};
        zug1.addSchienenfahrzeug(DIESELLOK1);
        zug1.addSchienenfahrzeug(Waggon1);
        zug1.addSchienenfahrzeug(Waggon2);
        zug1.addSchienenfahrzeug(Waggon3);

//        zug1.printInfoZug();

        Pool zug2 = new Pool(1102, "ICE WIEN - SALZBURG") {};
        zug2.addSchienenfahrzeug(DIESELELEKTROLOK2);
        zug2.addSchienenfahrzeug(Waggon4);
        zug2.addSchienenfahrzeug(Waggon5);

        zug2.printInfoZug();

//        zug2.listSchienenfahrzeuge(zug2.zugs);

        zug2.undock(2004, zug2.zugs);

        zug2.printInfoZug();

    }
}
