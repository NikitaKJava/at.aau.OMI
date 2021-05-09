package Exercise6.Aufgabe4;

/**
 * Created by Nikita on 09.05.2021 at 22:42
 */

/**
 * Aufgabe 6.4
 */
public interface Observerable {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyAllObservers();
}
