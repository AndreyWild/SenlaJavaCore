package TEST.port;

import TEST.methods.Addable;
import TEST.ship.Ship;

import java.util.ArrayList;

public class Port implements Addable {

    public ArrayList <Ship> docks = new ArrayList();

    // Добавить в порт корабль
    public void add(Ship ship){
        ship.add();
        if ((docks.size() < 10)) {
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

    public double allWeight(){
        double allweight = 0;
        for (Ship ship :docks){
            allweight+= ship.allWeight();
        } return allweight;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < docks.size(); i++) {
            result.append("Корабль №").append(i + 1).append(": ").append(docks.get(i).toString()).append("\n");
        }
        result.append("\nМасса воды в порту: ").append(String.format("%.2f", allWeight())).append(" тонн.");

        return "ꘅ-~-~-~-~-~-~-✫ ✬ ✭ ✟ ☠ Порт тортуга ☠ ✟ ✭ ✫-~-~-~-~-~-~-ꘅ\n" + result;
    }
}


