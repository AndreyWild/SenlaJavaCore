package TEST.main;

import TEST.containers.ConeCont;
import TEST.containers.CylindrCont;
import TEST.containers.SquareCont;
import TEST.deck.Deck;
import TEST.port.Port;
import TEST.ship.Ship;



public class Main {
    public static void main(String[] args) {
        // Создаем порт
        Port port = new Port();
        // Создаем корабль
        Ship ship = new Ship();
        // Заполняем его автоматом  10-ю кораблями
        port.add(ship);

//        System.out.println(port.docks.size());
//        // Пытаемся добавить корабль в заполненный порт
//        port.add(ship); // В порту нету места
//
        // Выводим результат
        System.out.println(port);
//        // Порт покинул 3-й корабль
//        port.removeShipNum(3);
//        // Выводим результат
//        System.out.println(port);
//        // Порт покинули все корабли
//        port.removeAll();
//        // Выводим результат
//        System.out.println(port);

//        port.add(ship);
//        System.out.println(port.docks.size());
//        port.docks.toString();
//        port.add(ship);
//        System.out.println(port.docks.size());

//        System.out.println(port.toString());

    }
}
