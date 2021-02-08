package eu.senla.task5.containers;



public class ConeContBig extends Container{
    double volume = (containerHeight / 3)* Math.PI * (Math.pow((DIAMETER_BIG / 2), 2));;
    double weight = volume * randomDensWater;
    double weightFormat = Math.ceil(weight * Math.pow(10, 3)) / Math.pow(10, 3);

    @Override
    public String toString() {
        return "ConeContBig{" +
                "weightFormat=" + weightFormat +
                '}';
    }
}
