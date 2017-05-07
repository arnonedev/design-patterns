package pl.arnonedev.factory.method.model;

/**
 * Created by Arek on 2017-05-07.
 */
public class Civic extends Car {
    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public void setVin(String vin) {
        super.setVin("HONDA" + vin);
    }

    @Override
    public void setModel(String model) {
        super.setModel("Civic");
    }

    @Override
    public void setMake(String make) {
        super.setMake("Honda");
    }
}
