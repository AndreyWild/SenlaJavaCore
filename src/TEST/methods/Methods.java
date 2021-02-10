package TEST.methods;

import TEST.containers.*;
import TEST.containers.ConeCont;
import TEST.deck.Deck;

public class Methods {


    // Метод возвращает рандомный контейнер
    public static AbstrCont getRandCont(){
        AbstrCont[] abstrConts = {new ConeCont(), new CylindrCont(), new SquareCont()};
        AbstrCont randCont = abstrConts[(int)((Math.random() * abstrConts.length-1) +1)];
        return randCont;

    }
    // Метод возвращает общую массу контейнеров на палубе
    public static double totalWeight(AbstrCont[] array){
        double totalWeight = 0;
        for(AbstrCont container : array){
            totalWeight+= container.getWeight();
        }
        return totalWeight;

    }



}


class Test {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            AbstrCont cont = Methods.getRandCont();
//            cont.getSize();
//            System.out.println(cont);
//        }


//        Deck deck = new Deck();
//        AbstrCont[] cont = deck.getRandDeck();
//        double allWight = Methods.totalWeight(cont);
//        System.out.println(allWight);


        for (int i = 0; i < 10; i++) {
            int randDecks = (int)((Math.random() * 2)+1);


        }



    }
}