package pl.arnonedev.factory.abstracts.factory;

import pl.arnonedev.factory.abstracts.model.audio.Audio;
import pl.arnonedev.factory.abstracts.model.audio.BoseAudio;
import pl.arnonedev.factory.abstracts.model.lamp.ADBLamp;
import pl.arnonedev.factory.abstracts.model.lamp.Lamp;
import pl.arnonedev.factory.abstracts.model.wheel.Wheel;
import pl.arnonedev.factory.abstracts.model.wheel.Wheel16In;

/**
 * Created by Arek on 2017-05-13.
 */
public class ExtraPartsHondaFactory extends PartsFactory {
    @Override
    public Wheel[] makeWheels() {
        return new Wheel[] {
                new Wheel16In(), new Wheel16In(), new Wheel16In(), new Wheel16In()
        };
    }

    @Override
    public Lamp[] makeLamps() {
        return new Lamp[] {
                new ADBLamp(), new ADBLamp()
        };
    }

    @Override
    public Audio makeAudio() {
        return new BoseAudio();
    }
}
