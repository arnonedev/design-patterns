package pl.arnonedev.decorator;

import pl.arnonedev.decorator.car.Car;
import pl.arnonedev.decorator.car.Corvette;
import pl.arnonedev.decorator.car.Mustang;
import pl.arnonedev.decorator.decorator.Audio;
import pl.arnonedev.decorator.decorator.Seats;
import pl.arnonedev.decorator.decorator.Wheels;

/**
 * Created by Arek on 2017-04-20.
 */
public class Startup {
    public static void main(String[] args) {
        Car corvette = new Corvette();
        System.out.println(corvette.price() + " " + corvette.getDescription());
        corvette = new Wheels(corvette);
        corvette = new Audio(corvette);
        System.out.println(corvette.price() + " " + corvette.getDescription());

        Car mustang = new Mustang();
        mustang = new Seats(mustang);
        mustang = new Audio(mustang);
        mustang = new Wheels(mustang);
        System.out.println("\n" + mustang.price() + " " + mustang.getDescription());
    }
}
