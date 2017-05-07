package pl.arnonedev.factory.method.factory;

import pl.arnonedev.factory.method.model.Car;

/**
 * Created by Arek on 2017-05-07.
 */
public abstract class OurCompany {
    private String place;
    private String name;

    public OurCompany(String place, String name) {
        this.place = place;
        this.name = name;
    }

    public Car orderCar(String model) {
        Car car = null;
        car = makeCar(model);
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
