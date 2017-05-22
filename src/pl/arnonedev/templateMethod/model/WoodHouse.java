package pl.arnonedev.templateMethod.model;

/**
 * Created by Arek on 2017-05-22.
 */
public class WoodHouse extends House {
    @Override
    protected void buildWalls() {
        System.out.println("Building wooded walls");
    }

    @Override
    protected void insertWindows() {
        System.out.println("Inserting brown windows");
    }
}
