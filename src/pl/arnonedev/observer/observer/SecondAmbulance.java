package pl.arnonedev.observer.observer;

/**
 * Created by Arek on 2017-04-13.
 */
public class SecondAmbulance implements Ambulance {
    @Override
    public void update() {
        driveToIncident();
    }

    private void driveToIncident() {
        System.out.println(SecondAmbulance.class.getSimpleName() + " received a notification and is driving to incident right now!");
    }
}
