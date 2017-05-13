package pl.arnonedev.factory.method.factory;

import pl.arnonedev.factory.abstracts.factory.PartsFactory;
import pl.arnonedev.factory.method.model.Accord;
import pl.arnonedev.factory.method.model.Car;
import pl.arnonedev.factory.method.model.Civic;

/**
 * Created by Arek on 2017-05-07.
 */
public class HondaFactory extends OurCompany {
    public HondaFactory(String place, String name, PartsFactory partsFactory) {
        super(place, name, partsFactory);
    }

    @Override
    protected Car makeCar(String model) {
        switch (model) {
            case "CIVIC":
                return new Civic();
            case "ACCORD":
                return new Accord();
        }
        return null;
    }
}
