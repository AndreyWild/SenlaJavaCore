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

    // Удалить конкретный корабль из порта
    public void removeShipNum(int ShipNum){
        docks.remove(ShipNum -1);
        System.out.println("Один корабль покинул порт");
    }

    // Очистить порт
    public void removeAll(){
        docks.clear();
        System.out.println("Порт покинули все корабли");
    }

    @Override
    // Заполнить порт 10-ю кораблями
    public void add() {
        for (int i = 0; i < 10; i++) {
            Ship ship = new Ship();
            ship.add();
            if ((docks.size() <= 10)) {
                docks.add(ship);
            } else {
                System.out.println("В порту нету места");
            }
        }
    }

    @Override
    public String toString() {
        return "Порт тортуга \n" + "docks=" + docks ;
    }

//    @Override
//    public String toString() {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < shipDecks.length; i++) {
//            result.append("Палуба №").append(i + 1).append(": [").append(shipDecks[i].toString()).append("]\n");
//        }
//        result.append("Масса воды: ").append(String.format("%.2f", allweight()));
//
//        return names[(int)((Math.random() * names.length))]+"\n" + result;
//    }
}
