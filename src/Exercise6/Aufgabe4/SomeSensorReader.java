package Exercise6.Aufgabe4;

/**
 * Created by Nikita on 09.05.2021 at 21:06
 */
public class SomeSensorReader implements Observer{
    SomeSensor sensor;

    public SomeSensorReader(SomeSensor sensor){
        this.sensor = sensor;
        System.out.println("Starte Auslesen von Werten...");

//        Thread thread = new Thread(new Reader());
//        thread.start();
    }

    /**
     * Aufgabe 6.4
     */
    @Override
    public void update() {
        System.out.println("SENSOR READER - Gelesener Sensorwert: " + sensor.getCurrentValue());
    }

//    // Read sensor values in a two seconds interval
//    private class Reader implements Runnable{
//
//        @Override
//        public void run(){
//            while (true){
//                System.out.println("SENSOR READER - Gelesener Sensorwert: " + sensor.getCurrentValue());
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e){
//                    //TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
}