package pl.arnonedev.decorator.car;

/**
 * Created by Arek on 2017-04-20.
 */
public class Challenger extends Car {
    @Override
    public double price() {
        return 490000;
    }

    @Override
    public String getDescription() {
        return "Challenger";
    }
}
