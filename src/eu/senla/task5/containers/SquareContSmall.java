package eu.senla.task5.containers;

public class SquareContSmall extends Container{
    double volume = containerHeight * (Math.pow(DIAGONAL_SMALL * 2, 2)) * 0.5;
    double weight = volume * randomDensWater;
    double weightFormat = Math.ceil(weight * Math.pow(10, 3)) / Math.pow(10, 3);
}