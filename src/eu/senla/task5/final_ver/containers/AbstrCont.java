package eu.senla.task5.final_ver.containers;

public abstract class AbstrCont {

    protected int [] size = {10, 20};
    protected int randomSize = size[(int)((Math.random() * size.length))];
    protected final int [] DENSITY_WATER = {1000, 2000};
    protected int randomDensity = DENSITY_WATER[(int)((Math.random() * DENSITY_WATER.length))];
    protected int hight = (int)((Math.random() * 92) +10);
    protected double scale = Math.pow(10, 3);
    // Метод для расчета массы объекта
    abstract public double getWeight();
    // Метод - флаг
    public boolean getSize(){
        return (randomSize == 10)? true : false;
    }
    // Метод считает массу корабля, переводит кг в Т, и округляет значение до 1,000.
    public double getWeightCont(double volume){
        return Math.ceil(((randomDensity * volume) * 0.001) * scale) / scale;
    }

    @Override
    public String toString() {
        return "Размер=" + randomSize +
                ", Плотность=" + randomDensity +
                ", Высота=" + hight;
    }
}

