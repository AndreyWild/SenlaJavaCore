package TEST.containers;




public class ConeCont extends AbstrCont {
    // объем конуса h/3 * Pi * r^2
    double volume = (hight /3) * Math.PI * Math.pow((randomSize / 2), 2);
    // округление до 4 знаков после запятой
    double weight = Math.ceil((randomDensity / volume) * scale) / scale;



    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return ((randomSize == 10) ? "Маленький " : "Большой ") +
                "конус " + super.toString() + " Вес=" + weight + '}';
        }
}



