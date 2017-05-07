package pl.arnonedev.factory.method.model;

/**
 * Created by Arek on 2017-05-07.
 */
public class Accord extends Car {
    @Override
    public void setMake(String make) {
        super.setMake("Honda");
    }

    @Override
    public void setModel(String model) {
        super.setModel("Accord");
    }

    @Override
    public void setVin(String vin) {
        super.setVin("HONDA" + vin);
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }
}
