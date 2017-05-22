package pl.arnonedev.templateMethod.model;

/**
 * Created by Arek on 2017-05-22.
 */
public abstract class House {
    public final void buildHouse() {
        pourFoundations();
        buildWalls();
        buildRoof();
        insertWindows();
    }

    private void pourFoundations() {
        System.out.println("Pouring foundations");
    }

    protected abstract void buildWalls();

    private void buildRoof() {
        System.out.println("Building roof");
    }

    protected void insertWindows() {
        System.out.println("Inserting white windows");
    }
}
