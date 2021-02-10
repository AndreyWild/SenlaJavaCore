package TEST.ship;

import TEST.deck.Deck;
import TEST.methods.Addable;

import java.util.Arrays;

public class Ship implements Addable {

    public Deck[] shipDecks;

    public Ship() {
        this.shipDecks = new Deck [(int)((Math.random() * 2)+1)];
    }
    // Добавить в список палуб палубу со случайным размером
    public void add(){
        shipDecks[0] = new Deck();
        if (shipDecks.length == 2){
            shipDecks[1] = new Deck();}
    }
    public void showInfo(){}

    @Override
    public String toString() {
        return "Корабль{" + Arrays.toString(shipDecks) + '}' + shipDecks.length;
    }
}


