package eu.senla.task5.main;

import eu.senla.task5.containers.*;
import eu.senla.task5.deck.*;

import static eu.senla.task5.methods.Methods.getRandCont;

public class Main {
    public static void main(String[] args) {
        Deck deck = new OneDeck();
        deck.add(getRandCont());
        System.out.println(deck.toString());




    }
}
