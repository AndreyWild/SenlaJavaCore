package TEST.main;

import TEST.containers.ConeCont;
import TEST.containers.CylindrCont;
import TEST.containers.SquareCont;
import TEST.deck.Deck;
import TEST.port.Port;
import TEST.ship.Ship;



public class Main {
    public static void main(String[] args) {
        Port port = new Port();
        Ship ship = new Ship();
        Deck deck = new Deck();
        ConeCont coneCont  = new ConeCont();
        CylindrCont cylindrCont = new CylindrCont();
        SquareCont squareCont = new SquareCont();
        System.out.println(deck);
        ship.add();
        System.out.println(ship);





    }
}
