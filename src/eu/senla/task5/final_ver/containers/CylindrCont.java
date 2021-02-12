package eu.senla.task5.final_ver.containers;

public class CylindrCont extends AbstrCont {
    // Находим объем цилиндр контейнера
    double volume = Math.PI * Math.pow((randomSize / 2), 2) * hight;

    @Override
    public double getWeight() {
        return getWeightCont(volume);
    }

    @Override
    public String toString() {
        return ((randomSize == 10) ? "Маленький " : "Большой ") +
                "цилиндр " + super.toString() + " Объем=" + String.format("%.3f",volume) + " Вес=" + getWeightCont(volume) + "(T)";
    }
}

