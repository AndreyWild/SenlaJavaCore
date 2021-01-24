package eu.senla.task3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        String[] names = {"Puffy", "Flaffy", "Roxxy", "Loki", "Luna", "Rikki", "Dolly", "Taffy", "Barsik", "Tutti"};
        System.out.println(names.length);


        System.out.println("-------------- First loop --------------");
        int count = 0;
        while (count++ < 10) {
            Cat cat = new Cat();
            System.out.println(count + ") " + cat);
        }

        System.out.println("-------------- Second loop --------------");

        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            cat.setName(names[random.nextInt(names.length)]);
            cat.setAge(random.nextInt(10));
            System.out.println(i + 1 + ") The cat named " + cat.getName() + " is " + cat.getAge() + " years old.");
        }

        System.out.println("-------------- Third loop --------------");

        Cat[] array = new Cat[10];
        int i = 1;
        do {
            Cat cat = new Cat(names[random.nextInt(names.length)], random.nextInt(10));
            array[i - 1] = cat;
            System.out.println(i + ") " + cat);
            i++;
        }
        while (i <= 10);

        System.out.println("-------------- Quadruple loop --------------");

        Cat[] arrayCats = new Cat[5];
        for (int j = 0; j < 5; j++) {
            arrayCats[j] = array[j];
        }
        for (Cat cat : arrayCats) {
            System.out.println(cat);
        }

        System.out.println("-------------- .equals() --------------");

        Cat cat1 = new Cat("Puffy", 2);
        Cat cat2 = new Cat("Puffy", 3);
        Cat cat3 = new Cat("Puffy", 2);
        System.out.println("Сравниваю котов {" + cat1 + "} и {" + cat2 + "} получаю " + cat1.equals(cat2)); // false
        System.out.println("Сравниваю котов {" + cat1 + "} и {" + cat3 + "} получаю " + cat1.equals(cat3));  // true
    }
}
