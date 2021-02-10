package eu.senla.task5.containers;

public class CylindricalCont extends AbstractContainer{
    double weight = (Math.PI * (Math.pow((randomSize / 2), 2)) * containerHeight) * randomDensWater;

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
            return "Маленький контейнер цилиндр {" + super.toString() + " Масса = " + weight +'}';

        } else {
            return "Большой контейнер цилиндр {" + super.toString() + " Масса = " + weight +'}';
        }
    }
}


//class Test2 {
//    public static void main(String[] args) {
//        for (int i = 0; i < 30; i++) {
//            AbstractContainer con = new CylindricalCont();
//            System.out.println(con + " " + con.getFlag());
//
//        }
//
//    }
//}
