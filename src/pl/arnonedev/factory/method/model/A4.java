package pl.arnonedev.factory.method.model;

/**
 * Created by Arek on 2017-05-07.
 */
public class A4 extends Car {
    @Override
    public void setMake(String make) {
        super.setMake("Audi");
    }

    @Override
    public void setModel(String model) {
        super.setModel("A4");
    }

    @Override
    public void setVin(String vin) {
        super.setVin("AUDI" + vin);
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }
}
