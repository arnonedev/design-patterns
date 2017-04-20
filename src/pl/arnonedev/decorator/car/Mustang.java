package pl.arnonedev.decorator.car;

/**
 * Created by Arek on 2017-04-20.
 */
public class Mustang extends Car {
    @Override
    double price() {
        return 210000;
    }

    @Override
    String getDescription() {
        return "Mustang";
    }
}
