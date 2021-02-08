package eu.senla.task5.containers;

import java.util.Random;

public abstract class Container {
    //Random random = new Random();
    //protected int randomDensWater = random.nextInt(DENSITY_WATER.length);

    // Массив с плотностью воды.
    final protected int [] DENSITY_WATER = {1000, 2000};
    // Рандомная плотность воды.
    protected int randomDensWater = (int)((Math.random() * DENSITY_WATER.length) +1);
    // Рандомная высота от 10 до 100
    protected int containerHeight = (int)((Math.random() * 92) +10);
    // Диаметр маленького контейнера
    final protected int DIAMETER_SMALL = 10;
    // Диаметр большого контейнера
    final protected int DIAMETER_BIG = 20;

    final protected int DIAGONAL_SMALL = 10;
    final protected int DIAGONAL_BIG = 20;


}

