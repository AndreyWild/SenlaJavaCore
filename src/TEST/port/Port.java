package TEST.port;

import TEST.methods.Addable;
import TEST.ship.Ship;

import java.util.ArrayList;

public class Port implements Addable {

    private ArrayList <Ship> docks = new ArrayList();

    // Добавить в порт корабль
    public void add(Ship ship){
        if ((docks.size() <= 10)) {
            docks.add(ship);
        } else {
            System.out.println("В порту нету места");
        }
    }
    public void remove(){
        docks.remove(0);
        System.out.println("Один корабль покинул порт");
    }

    @Override
    public void add() {
        Ship ship = new Ship();
        if ((docks.size() <= 10)) {
            docks.add(ship);
        } else {
            System.out.println("В порту нету места");
        }
    }
}
