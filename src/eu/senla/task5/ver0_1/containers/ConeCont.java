package eu.senla.task5.ver0_1.containers;

public class ConeCont extends AbstractContainer {
    double weight = (containerHeight / 3)* Math.PI * (Math.pow((randomSize / 2), 2)) * randomDensWater;


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
            return "Маленький контейнер конус {" + super.toString() + " Масса = " + weight +'}';

        } else {
            return "Большой контейнер конус {" + super.toString() + " Масса = " + weight +'}';
        }
    }
}


//class Test {
//    public static void main(String[] args) {
//        for (int i = 0; i < 30; i++) {
//            AbstractContainer con = new ConeCont();
//            System.out.println(con + " " + con.getFlag());
//
//        }
//
//    }
//}
