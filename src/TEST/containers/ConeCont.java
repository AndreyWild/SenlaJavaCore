package TEST.containers;


public class ConeCont extends AbstrCont {
    // Находим объем контейнера
    double volume = (hight / 3) * Math.PI * Math.pow((randomSize / 2), 2);
    // Находим массу + округление до 4 знаков после запятой - переводим кг в Т
    double weight = Math.ceil(((randomDensity * volume) * 0.001) * scale) / scale;


    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return ((randomSize == 10) ? "Маленький " : "Большой ") +
                "конус " + super.toString() + " Объем=" + String.format("%.3f",volume) + " Вес=" + weight + "(T)\n}";
    }
}



