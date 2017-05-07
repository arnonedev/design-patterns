package pl.arnonedev.factory.method.factory;

import pl.arnonedev.factory.method.model.Accord;
import pl.arnonedev.factory.method.model.Car;
import pl.arnonedev.factory.method.model.Civic;

/**
 * Created by Arek on 2017-05-07.
 */
public class HondaFactory extends OurCompany {
    @Override
    public Car orderCar(String model) {
        switch (model) {
            case "CIVIC":
                return new Civic();
            case "ACCORD":
                return new Accord();
        }
        return null;
    }
}
