package Exercise6.Aufgabe4;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Nikita on 09.05.2021 at 21:12
 */
public class SomeSensor implements Observerable {

    private long currentValue;
    private ArrayList<Observer> allObservers; // Aufgabe 6.4

    public SomeSensor() {
        allObservers = new ArrayList<Observer>(); // Aufgabe 6.4
        System.out.println("Initialising sensor...");
        currentValue = -1;
        Thread thread = new Thread(new ValueGenerator()); // Zeigt Zufallswerte und muss bleiben.
        thread.start();
    }

    /**
     * Aufgabe 6.4
     */
    @Override
    public void addObserver(Observer observer) {
        this.allObservers.add(observer); // fuegt den Observer
    }

    @Override
    public void removeObserver(Observer observer) {
        this.allObservers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer observer : allObservers){
            observer.update();
        }
    }


    // Simulate dynamic change of sensor values
    private class ValueGenerator implements Runnable {

        @Override
        public void run() {
            while (true) {
                setCurrentValue(new Random().nextLong());
                System.out.println("SENSOR - Aendere Wert auf: " + getCurrentValue());

                long timeToSleep = new Random().nextInt(12);
                try {
                    Thread.sleep(timeToSleep * 1000);
                } catch (InterruptedException e) {
                    //TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    public long getCurrentValue() {
        return currentValue;
    }

    private void setCurrentValue(long currentValue) {
        this.currentValue = currentValue; // Wird zuerst eingegeben
        this.notifyAllObservers(); // Aufgabe 6.4 - nach dem currentValue
    }
}