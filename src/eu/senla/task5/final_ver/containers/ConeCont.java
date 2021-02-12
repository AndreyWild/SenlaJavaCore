package eu.senla.task5.final_ver.containers;

public class ConeCont extends AbstrCont {
    // Находим объем конус контейнера
    double volume = (hight / 3) * Math.PI * Math.pow((randomSize / 2), 2);

    @Override
    public double getWeight() {
        return getWeightCont(volume);
    }

    @Override
    public String toString() {
        return ((randomSize == 10) ? "Маленький " : "Большой ") +
                "конус " + super.toString() + " Объем=" + String.format("%.3f",volume) + " Вес=" + getWeightCont(volume) + "(T)";
    }
}



