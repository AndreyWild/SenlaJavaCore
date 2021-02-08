package eu.senla.task5.methods;

import eu.senla.task5.containers.*;

public class Methods {

    public static AbstractContainer getRandCont(){
        AbstractContainer[] abstractContainers = {new ConeContBig(), new ConeContSmall(),
                new CylindricalContBig(), new CylindricalContSmall(),
                new SquareContBig(), new SquareContSmall()};
        AbstractContainer randCont = abstractContainers[(int)((Math.random() * abstractContainers.length-1) +1)];
        return randCont;
    }


    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//
//            System.out.println(getRandCont());
//        }

        AbstractContainer conteiner2 = getRandCont();
        System.out.println(conteiner2.getWeight());




    }

}
