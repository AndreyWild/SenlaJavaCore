package TEST.containers;

public class SquareCont extends AbstrCont {
    // Находим объем контейнера
    double volume = hight * (Math.pow(randomSize * 2, 2)) * 0.5;

    @Override
    public double getWeight() {
        return getWeightCont(volume);
    }


    @Override
    public String toString() {
        return ((randomSize == 10) ? "Маленький " : "Большой ") +
                "квадрат " + super.toString() + " Объем=" + String.format("%.3f",volume) + " Вес=" + getWeightCont(volume) + "(T)";
    }
}
