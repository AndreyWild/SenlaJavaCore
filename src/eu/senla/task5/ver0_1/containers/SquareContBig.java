package eu.senla.task5.ver0_1.containers;

public class SquareContBig extends Container {
    double volume = containerHeight * (Math.pow(DIAGONAL_BIG * 2, 2)) * 0.5;
    double weight = volume * randomDensWater;
    double weightFormat = Math.ceil(weight * Math.pow(10, 3)) / Math.pow(10, 3);
}
