package pl.arnonedev.factory.method.factory;

import pl.arnonedev.factory.abstracts.factory.PartsFactory;
import pl.arnonedev.factory.method.model.Car;

/**
 * Created by Arek on 2017-05-07.
 */
public abstract class OurCompany {
    private String place;
    private String name;
    private PartsFactory partsFactory;

    public OurCompany(String place, String name, PartsFactory partsFactory) {
        this.place = place;
        this.name = name;
        this.partsFactory = partsFactory;
    }

    public Car orderCar(String model) {
        Car car = null;
        car = makeCar(model);
        car.setWheels(partsFactory.getWheels());
        car.setAudio(partsFactory.getAudio());
        car.setLamps(partsFactory.getLamps());
        return car;
    }

    protected abstract Car makeCar(String model);

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OurCompany{" +
                "place='" + place + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
