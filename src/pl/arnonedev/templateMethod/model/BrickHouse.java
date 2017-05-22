package pl.arnonedev.templateMethod.model;

/**
 * Created by Arek on 2017-05-22.
 */
public class BrickHouse extends House {
    @Override
    protected void buildWalls() {
        System.out.println("Building bricked walls");
    }
}
