package pl.arnonedev.observer.observer;

import pl.arnonedev.observer.subject.Operator;

/**
 * Created by Arek on 2017-04-13.
 */
public class FirstAmbulance implements Ambulance {
    private Operator operator;

    public FirstAmbulance(Operator operator) {
        this.operator = operator;
        operator.registerObserver(this);
    }

    @Override
    public void update() {
        driveToIncident();
    }

    private void driveToIncident() {
        System.out.println(FirstAmbulance.class.getSimpleName() + " received a notification and is driving to incident right now!");
        System.out.println("Incident: " + operator.getStatus());
    }
}
