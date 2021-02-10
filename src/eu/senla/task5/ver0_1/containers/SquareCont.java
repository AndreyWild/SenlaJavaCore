package eu.senla.task5.ver0_1.containers;

public class SquareCont extends AbstractContainer{

    double weight = (containerHeight * (Math.pow(randomSize * 2, 2)) * 0.5) * randomDensWater;



    boolean getFlag(){
        return (randomSize == 10) ? true : false;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        if(getFlag()){
            return "Маленький контейнер квадрат {" + super.toString() + " Масса = " + weight +'}';

        } else {
            return "Большой контейнер квадрат {" + super.toString() + " Масса = " + weight +'}';
        }
    }
}
