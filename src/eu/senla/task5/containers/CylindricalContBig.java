package eu.senla.task5.containers;

public class CylindricalContBig extends Container {
    double volume = Math.PI * (Math.pow((DIAMETER_BIG / 2), 2)) * containerHeight;
    double weight = volume * randomDensWater;
    double weightFormat = Math.ceil(weight * Math.pow(10, 3)) / Math.pow(10, 3);

    @Override
    public String toString() {
        return "CylindricalContBig{" +
                "weightFormat=" + weightFormat +
                '}';
    }
}

