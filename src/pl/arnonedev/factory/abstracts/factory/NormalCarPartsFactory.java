package pl.arnonedev.factory.abstracts.factory;

import pl.arnonedev.factory.abstracts.model.audio.Audio;
import pl.arnonedev.factory.abstracts.model.audio.NormalAudio;
import pl.arnonedev.factory.abstracts.model.lamp.Lamp;
import pl.arnonedev.factory.abstracts.model.lamp.NormalLamp;
import pl.arnonedev.factory.abstracts.model.wheel.Wheel;
import pl.arnonedev.factory.abstracts.model.wheel.Wheel15In;

/**
 * Created by Arek on 2017-05-13.
 */
public class NormalCarPartsFactory extends PartsFactory {
    @Override
    public Wheel[] makeWheels() {
        return new Wheel[] {
                new Wheel15In(), new Wheel15In(), new Wheel15In(), new Wheel15In()
        };
    }

    @Override
    public Lamp[] makeLamps() {
        return new Lamp[] {
                new NormalLamp(), new NormalLamp()
        };
    }

    @Override
    public Audio makeAudio() {
        return new NormalAudio();
    }
}
