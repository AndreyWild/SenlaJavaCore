package eu.senla.task5.ver0_1.containers;


public abstract class AbstractContainer {


    // Массив с плотностью воды.
    final protected int[] DENSITY_WATER = {1000, 2000};
    public int flag;
    // Рандомная плотность воды.
    protected int randomDensWater = DENSITY_WATER[(int) ((Math.random() * DENSITY_WATER.length))];
    // Рандомная высота от 10 до 100
    protected int containerHeight = (int) ((Math.random() * 92) + 10);
    // Диаметр (основание) маленького контейнера
     final protected int SMALL = 10;
    // Диаметр (основание) большого контейнера
     final protected int BIG = 20;
    final protected int[] BIG_OR_SAMLL = {10, 20};
    protected int randomSize = BIG_OR_SAMLL[(int) ((Math.random() * BIG_OR_SAMLL.length))];

    abstract public double getWeight();

    abstract boolean getFlag();

    @Override
    public String toString() {
        return " Высота = " + containerHeight + " Основание = " + randomSize + " Плотность воды = " + randomDensWater;
    }
}

