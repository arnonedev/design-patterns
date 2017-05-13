package pl.arnonedev.decorator.decorator;

import pl.arnonedev.decorator.car.Car;

/**
 * Created by Arek on 2017-04-20.
 */
public class Wheels extends CarDecorator {
    private Car car;

    public Wheels(Car car) {
        this.car = car;
    }

    @Override
    public double price() {
        return car.price() + 40000;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", 22\" wheel";
    }
}
