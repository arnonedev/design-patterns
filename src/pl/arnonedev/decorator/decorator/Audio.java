package pl.arnonedev.decorator.decorator;

import pl.arnonedev.decorator.car.Car;

/**
 * Created by Arek on 2017-04-20.
 */
public class Audio extends CarDecorator {
    private Car car;

    public Audio(Car car) {
        this.car = car;
    }

    @Override
    public double price() {
        return car.price() + 15000;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", bose audio";
    }
}
