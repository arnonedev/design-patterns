package pl.arnonedev.observer;

import pl.arnonedev.observer.observer.FirstAmbulance;
import pl.arnonedev.observer.observer.SecondAmbulance;
import pl.arnonedev.observer.observer.ThirdAmbulance;
import pl.arnonedev.observer.subject.OperatorAdam;

/**
 * Created by Arek on 2017-04-13.
 */
public class Startup {
    public static void main(String[] args) {
        OperatorAdam operatorAdam = new OperatorAdam();
        FirstAmbulance firstAmbulance = new FirstAmbulance(operatorAdam);
        SecondAmbulance secondAmbulance = new SecondAmbulance(operatorAdam);
        ThirdAmbulance thirdAmbulance = new ThirdAmbulance((operatorAdam));

        operatorAdam.setStatus("Car accident");
        operatorAdam.setStatus("Faint");
        operatorAdam.setStatus("Broken bone");
    }
}
