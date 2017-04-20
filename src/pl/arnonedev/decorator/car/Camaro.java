package pl.arnonedev.decorator.car;

/**
 * Created by Arek on 2017-04-20.
 */
public class Camaro extends Car {
    @Override
    public double price() {
        return 300000;
    }

    @Override
    public String getDescription() {
        return "Camaro";
    }
}
