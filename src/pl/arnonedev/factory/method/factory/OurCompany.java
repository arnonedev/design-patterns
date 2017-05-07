package pl.arnonedev.factory.method.factory;

import pl.arnonedev.factory.method.model.Car;

/**
 * Created by Arek on 2017-05-07.
 */
public abstract class OurCompany {
    private String place;
    private String name;

    public abstract Car orderCar(String model);

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
}
