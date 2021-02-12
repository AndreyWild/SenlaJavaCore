package eu.senla.task5.final_ver.main;

import eu.senla.task5.final_ver.port.Port;
import eu.senla.task5.final_ver.ship.Ship;



public class Main {
    public static void main(String[] args) {
        // Создаем порт
        Port port = new Port();
        // Создаем корабль
        Ship ship = new Ship();
        // Заполняем его автоматом  10-ю кораблями
        port.add();
        // Пытаемся добавить корабль в заполненный порт
        port.add(ship); // В порту нету места

        // Выводим результат
        System.out.println("------------------------------ Порт на 10 кораблей ------------------------------\n" + port);
        // Порт покинул 3-й корабль
        port.removeShipNum(3);
        // Выводим результат
        System.out.println("------------------------------ Порт на 10 - 1 кораблей ------------------------------\n"+port);
        // Порт покинули все корабли
        port.removeAll();
        // Выводим результат
        System.out.println("------------------------------ Пустой порт ------------------------------\n" + port);
        // Добавили один корабль, ручной ввод
        port.add(ship);
        System.out.println("------------------------------ Порт с добавленным кораблем ------------------------------\n" + port);
    }
}
