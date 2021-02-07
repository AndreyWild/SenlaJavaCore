package eu.senla.task5.containers;

public class CylindricalContBig extends Container {
    double weight = (Math.PI * (Math.pow((DIAMETER_BIG_SMALL / 2), 2)) *
            containerHeight) * DENSITY_WATER_2000;

    @Override
    public String toString() {
        return "CylindricalContBig{" +
                "Weight=" + weight +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            CylindricalContBig CB1 = new CylindricalContBig();
            System.out.println(CB1);
        }
    }
}
