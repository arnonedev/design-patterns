package pl.arnonedev.decorator.car;

/**
 * Created by Arek on 2017-04-20.
 */
public abstract class Car {
    protected String make;
    protected String model;
    protected int year;
    protected String bodyType;

    public abstract double price();
    public abstract String getDescription();

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
}
