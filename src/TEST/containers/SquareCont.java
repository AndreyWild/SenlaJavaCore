package TEST.containers;

public class SquareCont extends AbstrCont {

    double volume = hight * (Math.pow(randomSize * 2, 2)) * 0.5;
    double weight = Math.ceil((randomDensity / volume) * scale) / scale;

    @Override
    public double getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return ((randomSize == 10) ? "Маленький " : "Большой ") +
                "квадрат " + super.toString() + " Вес=" + weight + '}';
    }
}
