package pl.arnonedev.decorator.car;

/**
 * Created by Arek on 2017-04-20.
 */
public class Camaro extends Car {
    @Override
    double price() {
        return 300000;
    }

    @Override
    String getDescription() {
        return "Camaro";
    }
}
