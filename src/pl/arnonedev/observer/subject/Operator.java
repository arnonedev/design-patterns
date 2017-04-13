package pl.arnonedev.observer.subject;

import pl.arnonedev.observer.observer.Ambulance;

/**
 * Created by Arek on 2017-04-13.
 */
public interface Operator {
    void registerObserver(Ambulance ambulance);
    void removeObserver(Ambulance ambulance);
    void notifyObservers();
}
