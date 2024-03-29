package eu.senla.task5.final_ver.deck;

import eu.senla.task5.final_ver.containers.AbstrCont;
import eu.senla.task5.final_ver.methods.Addable;
import eu.senla.task5.final_ver.methods.Methods;

import java.util.Arrays;

public class Deck implements Addable {

    // массив контейнеров
    private AbstrCont[] deck;

    public Deck() {
        deck = getRandDeck();
    }

    // Заполняет палубу рандомными контейнерами
    public void add() {
        deck = getRandDeck();
    }


    // Метод возвращает рандомно заполненный список на [2] или [4] контейнерами
    public AbstrCont[] getRandDeck() {
        AbstrCont[] abstrContainer;
        AbstrCont container = Methods.getRandCont();
        abstrContainer = new AbstrCont[(container.getSize()) ? 4 : 2];
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

//    public double allWeight2() {
//        double allWeight = 0;
//        for (AbstrCont cont : deck) {
//            allWeight += cont.getWeight();
//        }
//        return allWeight;
//    }

    public double allWeight() {
        return Arrays.stream(deck).mapToDouble(f -> f.getWeight()).sum();
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < deck.length; i++) {
            result.append(i + 1).append(".) ").append(deck[i].toString()).append(" ");
        }
        return result.toString();
    }
}


