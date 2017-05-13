package pl.arnonedev.factory.method.model;

import pl.arnonedev.factory.abstracts.model.audio.Audio;
import pl.arnonedev.factory.abstracts.model.lamp.Lamp;
import pl.arnonedev.factory.abstracts.model.wheel.Wheel;

import java.util.Arrays;

/**
 * Created by Arek on 2017-05-07.
 */
public abstract class Car {
    private String vin;
    private String make;
    private String model;
    private int year;
    private Wheel[] wheels;
    private Lamp[] lamps;
    private Audio audio;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

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

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Lamp[] getLamps() {
        return lamps;
    }

    public void setLamps(Lamp[] lamps) {
        this.lamps = lamps;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", wheels=" + Arrays.toString(wheels) +
                ", lamps=" + Arrays.toString(lamps) +
                ", audio=" + audio +
                '}';
    }
}
