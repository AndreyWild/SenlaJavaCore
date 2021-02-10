package TEST.deck;

import TEST.containers.AbstrCont;
import TEST.methods.Methods;

public class Deck {

    public AbstrCont [] getRandDeck(){
        AbstrCont[] deck;
        AbstrCont container = Methods.getRandCont();
        System.out.println(container);
        deck = new AbstrCont[(container.getSize())? 4 : 2];
        System.out.println(deck.length);
        int count = 1;

            while (deck[deck.length-1] == null){
                AbstrCont contE = Methods.getRandCont();
                if(contE.getSize() == container.getSize()){
                    deck[0] = container;
                    deck [count] = contE;
                    count++;
                } else continue;
            } return deck;









//        if (container.getSize()){
//
//            while (deck[deck.length-1] == null){
//                AbstrCont contE = Methods.getRandCont();
//                if(contE.getSize()){
//                    deck [count] = contE;
//                    count++;
//                } else continue;
//            } return deck;
//        } else {
//
//            while (deck[deck.length-1] == null){
//                AbstrCont contE = Methods.getRandCont();
//                if(!contE.getSize()){
//                    deck [count] = contE;
//                    count++;
//                } else continue;
//            } return deck;
//        }




    }
}

class Test{
    public static void main(String[] args) {
        Deck deck = new Deck();
        AbstrCont[] Deck = deck.getRandDeck();
        for (AbstrCont s : Deck){
            System.out.println(s);
        }


    }
}
