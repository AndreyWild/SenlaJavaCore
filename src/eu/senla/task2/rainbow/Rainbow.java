package eu.senla.task2.rainbow;


import java.util.Scanner;

public class Rainbow {
    //    public static final String RED = "красный";
//    public static final String ORANGE = "оранжевый";
//    public static final String YELLOW = "желтый";
//    public static final String GREEN = "зеленый";
//    public static final String BLEU = "голубой";
//    public static final String BLUE = "синий";
//    public static final String PURPLE = "фиолетовый";
    public final String[] COLORS = {"красный", "оранжевый", "желтый", "зеленый", "голубой", "синий", "фиолетовый"};

    public Rainbow() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Если ты хочешь получить один цвет, введи 1, если сочетание цветов то 2: ");
        int variation = scanner.nextInt();
        if (variation == 1) {
            System.out.println("Отлично! Ты выбрал первый вариант.");
            System.out.print("Введи любое значение от 0 до 6: ");
            int color1 = scanner.nextInt();
            getColor(color1);
        } else if (variation == 2) {
            System.out.println("Отлично! Ты выбрал второй вариант.");
            System.out.print("Введи любое значение от 0 до 6: ");
            int color1 = scanner.nextInt();
            System.out.print("Введи любое значение от 0 до 6: ");
            int color2 = scanner.nextInt();
            getColor(color1, color2);
        } else {
            System.out.println("Ты уверен что все правильно понял?");
        }


    }

    public void getColor(int firstColor) {
        switch (firstColor) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Вы выбрали " + COLORS[firstColor] + " цвет.");
                break;
            default:
                System.out.println("Такого цвета нету, введите значения от 0 до 6 включительно");
        }
    }

    public void getColor(int firstColor, int secondColor) {
        if (firstColor >= 0 && firstColor < 6 && secondColor >= 0 && secondColor < 6) {
            System.out.println("Вы выбрали " + modifyColorString(COLORS[firstColor]) + "-" + COLORS[secondColor] + " цвет");
        } else {
            System.out.println("Оба числа должны быть ото 0 до 6");
        }
    }

    private static String modifyColorString(String colorName) {
        if (colorName.contains("ый")) {
            return colorName.replace("ый", "о");
        } else if (colorName.contains("ий")) {
            return colorName.replace("ий", "е");
        } else if (colorName.contains("ой")) {
            return colorName.replace("ой", "о");
        } else {
            return colorName;
        }
    }
}
