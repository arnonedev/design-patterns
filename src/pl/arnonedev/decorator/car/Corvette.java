package pl.arnonedev.decorator.car;

/**
 * Created by Arek on 2017-04-20.
 */
public class Corvette extends Car {
    @Override
    public double price() {
        return 550000;
    }

    @Override
    public String getDescription() {
        return "Corvette";
    }
}
