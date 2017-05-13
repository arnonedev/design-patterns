package pl.arnonedev.factory.method.factory;

import pl.arnonedev.factory.abstracts.factory.PartsFactory;
import pl.arnonedev.factory.method.model.A4;
import pl.arnonedev.factory.method.model.A6;
import pl.arnonedev.factory.method.model.A8;
import pl.arnonedev.factory.method.model.Car;

/**
 * Created by Arek on 2017-05-07.
 */
public class AudiFactory extends OurCompany {
    public AudiFactory(String place, String name, PartsFactory partsFactory) {
        super(place, name, partsFactory);
    }

    @Override
    protected Car makeCar(String model) {
        switch (model) {
            case "A4":
                return new A4();
            case "A6":
                return new A6();
            case "A8":
                return new A8();
        }
        return null;
    }
}
