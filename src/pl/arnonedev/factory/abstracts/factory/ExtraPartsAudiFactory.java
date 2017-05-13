package pl.arnonedev.factory.abstracts.factory;

import pl.arnonedev.factory.abstracts.model.audio.BoseAudio;
import pl.arnonedev.factory.abstracts.model.lamp.Lamp;
import pl.arnonedev.factory.abstracts.model.lamp.MatrixLamp;
import pl.arnonedev.factory.abstracts.model.wheel.Wheel;
import pl.arnonedev.factory.abstracts.model.wheel.Wheel17In;

/**
 * Created by Arek on 2017-05-13.
 */
public class ExtraPartsAudiFactory extends PartsFactory {
    public ExtraPartsAudiFactory() {
        wheels = new Wheel[] {
                new Wheel17In(), new Wheel17In(), new Wheel17In(), new Wheel17In()
        };
        audio = new BoseAudio();
        lamps = new Lamp[] {
                new MatrixLamp(), new MatrixLamp()
        };
    }
}
