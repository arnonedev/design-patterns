package pl.arnonedev.decorator.car;

/**
 * Created by Arek on 2017-04-20.
 */
public class Mustang extends Car {
    @Override
    public double price() {
        return 210000;
    }

    @Override
    public String getDescription() {
        return "Mustang";
    }
}
