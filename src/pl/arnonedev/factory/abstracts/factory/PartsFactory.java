package pl.arnonedev.factory.abstracts.factory;

import pl.arnonedev.factory.abstracts.model.audio.Audio;
import pl.arnonedev.factory.abstracts.model.lamp.Lamp;
import pl.arnonedev.factory.abstracts.model.wheel.Wheel;

/**
 * Created by Arek on 2017-05-13.
 */
public abstract class PartsFactory {
    protected Wheel[] wheels;
    protected Audio audio;
    protected Lamp[] lamps;

    public Wheel[] getWheels() {
        return wheels;
    }

    public Audio getAudio() {
        return audio;
    }

    public Lamp[] getLamps() {
        return lamps;
    }
}
