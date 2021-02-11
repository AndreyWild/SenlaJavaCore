package TEST.deck;

import TEST.containers.AbstrCont;
import TEST.methods.Methods;

import java.util.Arrays;

public class Deck {

    // массив контейнеров
    public AbstrCont[] deck;

    public Deck() {
        deck = getRandDeck();
    }

    // Заполняет палубу контейнерами
    public void add() {
        deck = getRandDeck();
    }


    // Метод возвращает рандомно заполненный список на [2] или [4] контейнерами
    public AbstrCont[] getRandDeck() {
        AbstrCont[] abstrContainer;
        AbstrCont container = Methods.getRandCont();
        //System.out.println(container);
        abstrContainer = new AbstrCont[(container.getSize()) ? 4 : 2];
        //System.out.println(deck.length);
        int count = 1;

        while (abstrContainer[abstrContainer.length - 1] == null) {
            AbstrCont contE = Methods.getRandCont();
            if (contE.getSize() == container.getSize()) {
                abstrContainer[0] = container;
                abstrContainer[count] = contE;
                count++;
            }
        }
        return abstrContainer;
    }

    public double allWeight(){
        double allWeight =0;
        for(AbstrCont cont : deck){
            allWeight += cont.getWeight();
        } return  allWeight;
    }

//    @Override
//    public String toString() {
//        return "Палуба \n" + Arrays.toString(deck);
//    }

    public String toString() {
        StringBuilder result = new StringBuilder();
            for (int i = 0; i < deck.length; i++) {
                result.append(i + 1).append(".) ");
                result.append(deck[i].toString()).append(" ");
            } return "Палуба \n" + result;
        }


}


class Test {
    public static void main(String[] args) {
        Deck deck = new Deck();
//        AbstrCont[] Deck = deck.getRandDeck();
//        for (AbstrCont c : Deck) {
//
//            System.out.println(c);
//        }
        System.out.println(deck);


    }
}
