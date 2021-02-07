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

class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

        }
        CylindricalContBig CB1 = new CylindricalContBig();
        System.out.println(CB1);
    }
}
