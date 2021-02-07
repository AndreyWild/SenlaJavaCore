package eu.senla.task5.containers;

public class CylindricalContSmall extends Container{
    double volume = Math.PI * (Math.pow((DIAMETER_BIG_SMALL/2), 2))*containerHeight;
    double weight = volume * DENSITY_WATER_2000;
    double weightFormat = Math.ceil(weight * Math.pow(10, 3)) / Math.pow(10, 3);
}
