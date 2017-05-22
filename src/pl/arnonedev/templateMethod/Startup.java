package pl.arnonedev.templateMethod;

import pl.arnonedev.templateMethod.model.BrickHouse;
import pl.arnonedev.templateMethod.model.House;
import pl.arnonedev.templateMethod.model.WoodHouse;

/**
 * Created by Arek on 2017-05-22.
 */
public class Startup {
    public static void main(String[] args) {
        House brickHouse = new BrickHouse();
        House woodHouse = new WoodHouse();
        brickHouse.buildHouse();
        System.out.println();
        woodHouse.buildHouse();
    }
}
