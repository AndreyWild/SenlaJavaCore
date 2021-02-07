package eu.senla.task5.containers;

import java.util.Random;

public abstract class Container {
    Random random = new Random();
    final protected int [] DENSITY_WATER = {100, 2000};
    protected int randomDensWater = random.nextInt(DENSITY_WATER.length);
    protected int containerHeight = (int)((Math.random() * 91) +10);;
    final protected int DIAMETER_SMALL = 10;
    final protected int DIAMETER_BIG = 20;

}
