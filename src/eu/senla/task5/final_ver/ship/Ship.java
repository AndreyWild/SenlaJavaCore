package eu.senla.task5.final_ver.ship;

import eu.senla.task5.final_ver.deck.Deck;
import eu.senla.task5.final_ver.methods.Addable;

import java.util.Arrays;

public class Ship implements Addable {

    // Названия кораблей
    private String[] names = {"Паровой катер аврора", "Фрегат Авраам Линкольн",
            "Шхуна Аляска", "Бриг Аркхем", "Парусная яхта Беда", "Корвет Клеймор",
            "Капер Ла Фудр", "Подводная лодка Наутилус", "Китобойное судно Пекод",
            "Шхуна-бриг Пилигрим", "Подводная лодка Пионер", "Миноносец Сын Грома",
            "Парусное судно Царица Екатерина", "Пароход Цикада", "Барк Счастливое избавление",
            "Паровая яхта Статфорд", "Трёхмачтовый галиот Секрет", "Бригантина Святая дева"};

    // Массив палуб
    private Deck[] shipDecks;

    // Конструктор автоматом рандомно заполняет массив палуб рандомными палубами
    public Ship() {
        this.shipDecks = new Deck[(int) ((Math.random() * 2) + 1)];
    }

    // Добавить в список палуб палубу со случайным размером (ручной режим)
    public void add() {
        shipDecks[0] = new Deck();
        if (shipDecks.length == 2) {
            shipDecks[1] = new Deck();
        }
    }

//    // Расчет общей масси груза корабля
//    public double allWeight() {
//        double allweight = 0;
//        for (Deck deck : shipDecks) {
//            allweight += deck.allWeight();
//        }
//        return allweight;
//    }

    public double allWeight() {
        return Arrays.stream(shipDecks).mapToDouble(f -> f.allWeight()).sum();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < shipDecks.length; i++) {
            result.append("Палуба №").append(i + 1).append(": [").append(shipDecks[i].toString()).append("]\n");
        }
        result.append("Масса воды: ").append(String.format("%.2f", allWeight())).append(" тонн.");
        return names[(int) ((Math.random() * names.length))] + "\n" + result;
    }
}



