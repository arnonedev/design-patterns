package pl.arnonedev.observer.subject;

import pl.arnonedev.observer.observer.Ambulance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arek on 2017-04-13.
 */
public class OperatorAdam implements Operator {
    List<Ambulance> ambulances = new ArrayList<>();

    @Override
    public void registerObserver(Ambulance ambulance) {
        ambulances.add(ambulance);
    }

    @Override
    public void removeObserver(Ambulance ambulance) {
        ambulances.remove(ambulance);
    }

    @Override
    public void notifyObservers() {
        ambulances.forEach(Ambulance::update);

//        if you don't know JAVA 8
//        for (Ambulance ambulance : ambulances) {
//            ambulance.update();
//        }
    }
}
