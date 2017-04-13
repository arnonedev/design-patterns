package pl.arnonedev.observer.observer;

/**
 * Created by Arek on 2017-04-13.
 */
public class ThirdAmbulance implements Ambulance {
    @Override
    public void update() {
        driveToIncident();
    }

    private void driveToIncident() {
        System.out.println(ThirdAmbulance.class.getSimpleName() + " received a notification and is driving to incident right now!");
    }
}
