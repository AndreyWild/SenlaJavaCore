package TEST.containers;

public class CylindrCont extends AbstrCont {

    double volume = Math.PI * Math.pow((randomSize / 2), 2) * hight;
    double weight = Math.ceil((randomDensity / volume) * scale) / scale;



    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return ((randomSize == 10) ? "Маленький " : "Большой ") +
                "цилиндр " + super.toString() + " Вес=" + weight + '}';
    }
}

