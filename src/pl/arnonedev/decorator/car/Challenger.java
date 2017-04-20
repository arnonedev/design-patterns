package pl.arnonedev.decorator.car;

/**
 * Created by Arek on 2017-04-20.
 */
public class Challenger extends Car {
    @Override
    double price() {
        return 490000;
    }

    @Override
    String getDescription() {
        return "Challenger";
    }
}
