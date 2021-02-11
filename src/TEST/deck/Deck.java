package TEST.deck;

import TEST.containers.AbstrCont;
import TEST.methods.Addable;
import TEST.methods.Methods;

import java.util.Arrays;

public class Deck implements Addable {

    // массив контейнеров
    public AbstrCont[] deck;

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

    public double allWeight() {
        double allWeight = 0;
        for (AbstrCont cont : deck) {
            allWeight += cont.getWeight();
        }
        return allWeight;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < deck.length; i++) {
            result.append(i + 1).append(".) ");
            result.append(deck[i].toString()).append(" ");
        }
        return result.toString();
    }
}


