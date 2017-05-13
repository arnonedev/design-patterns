package pl.arnonedev.factory.abstracts.factory;

import pl.arnonedev.factory.abstracts.model.audio.NormalAudio;
import pl.arnonedev.factory.abstracts.model.lamp.Lamp;
import pl.arnonedev.factory.abstracts.model.lamp.NormalLamp;
import pl.arnonedev.factory.abstracts.model.wheel.Wheel;
import pl.arnonedev.factory.abstracts.model.wheel.Wheel15In;

/**
 * Created by Arek on 2017-05-13.
 */
public class NormalCarPartsFactory extends PartsFactory {
    public NormalCarPartsFactory() {
        wheels = new Wheel[] {
                new Wheel15In(), new Wheel15In(), new Wheel15In(), new Wheel15In()
        };
        audio = new NormalAudio();
        lamps = new Lamp[] {
                new NormalLamp(), new NormalLamp()
        };
    }
}
