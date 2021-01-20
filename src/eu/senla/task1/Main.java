package eu.senla.task1;

/**
 * Создадим пакет для задания  eu.senla.(название вашего пакета)Создать два класса.
 * Создать метод для запуска в одном классе.Во втором классе создать глобальные переменные всех типов.
 * И для каждой глобальнойпеременной геттеры и сеттеры.
 * В классе с методом для запуска создать глобальные переменные с различнымитипами(примитивами и обертками).
 * А также в методе создать локальные переменные.
 * Поэкспериментировать с присвоением переменных друг в друга и приведением типов,посмотреть какие ошибки получаться.
 * При необходимости оставить комментарии.Геттеры и сеттеры обязательно использовать, т.е. установить и получить значение.
 * Не забываем что глобальные переменные и геттеры и сеттеры если создаются в одномклассе вместе с main методом должны быть static.
 * Если же создаются в отдельном классе то они будут не статические.Вывести все переменные на консоль.
 * <p>
 * Author: Andrey Kravcov
 */


public class Main {
    static char aChar;
    static Character aWrapperChar;
    static byte aByte;
    static Byte aWrapperByte;
    static short aShort;
    static Short aWrapperShort;
    static int anInt;
    static Integer anWrapperInt;
    static long aLong;
    static Long aWrapperLong;
    static float aFloat;
    static Float aWrapperFloat;
    static double aDouble;
    static Double aWrapperDouble;
    static boolean aBoolean;
    static Boolean aWrapperBoolean;
    static String aString;


    public static void main(String[] args) {
        Numbers numbers = new Numbers("Это моя домашка");
        System.out.println(numbers);

        // Задаем и выводим char.
        numbers.setaChar('A');
        System.out.println("char: " + numbers.getaChar());

        // Задаем и выводим Character.
        numbers.setaWrapperChar((char) 169);
        System.out.println("Character: " + numbers.getaWrapperChar());

        // Задаем и выводим byte.
        numbers.setaByte((byte) 127);
        System.out.println("byte: " + numbers.getaByte());

        // Задаем и выводим Byte.
        numbers.setaWrapperByte((byte) 127);
        System.out.println("Byte: " + numbers.getaWrapperByte());

        // Задаем и выводим short.
        numbers.setaShort((short) 32767);
        System.out.println("short: " + numbers.getaShort());

        // Задаем и выводим Short.
        numbers.setaWrapperShort((short) 32767);
        System.out.println("Short: " + numbers.getaWrapperShort());

        // Задаем и выводим int.
        numbers.setAnInt(2147483647);
        System.out.println("int: " + numbers.getAnInt());

        // Задаем и выводим Integer.
        numbers.setAnWrapperInt(2147483647);
        System.out.println("Integer: " + numbers.getAnWrapperInt());

        // Задаем и выводим long.
        numbers.setaLong(9223372036854775807L);
        System.out.println("long: " + numbers.getaLong());

        // Задаем и выводим Long.
        numbers.setaWrapperLong(9223372036854775807L);
        System.out.println("Long: " + numbers.getaWrapperLong());

        // Задаем и выводим float.
        numbers.setaFloat(3.1415926535897932384626433832F);
        System.out.println("float: " + numbers.getaFloat());

        // Задаем и выводим Float.
        numbers.setaWrapperFloat(3.1415926535897932384626433832F);
        System.out.println("Float: " + numbers.getaWrapperFloat());

        // Задаем и выводим double.
        numbers.setaDouble(1.7e-308);
        System.out.println("double: " + numbers.getaDouble());

        // Задаем и выводим Double.
        numbers.setaWrapperDouble(1.7e-308);
        System.out.println("Double: " + numbers.getaWrapperDouble());

        // Задаем и выводим boolean.
        numbers.setaBoolean(true);
        System.out.println("boolean: " + numbers.isaBoolean());

        // Задаем и выводим Boolean.
        numbers.setaWrapperBoolean(false);
        System.out.println("Boolean: " + numbers.getaWrapperBoolean());

        // Задаем и выводим String.
        numbers.setaString("Hello");
        System.out.println("String: " + numbers.getaString());

        // char -> byte -> short -> int -> long -> float -> double
        System.out.println("Получли double: " + numbers.castingVariablesCharToDouble('~'));

        // double -> float -> long -> int -> short -> byte
        System.out.println("Получли byte: " + numbers.castingVariablesDoubleToByte(127.0));

        // String -> int
        String s = "123";
        int i = Integer.parseInt(s);
        System.out.println("Преобразованли String в int: " + i);

        // int -> String
        int i2 = 123;
        String s2 = Integer.toString(i2);
        System.out.println("Преобразованли int в String: " + s2);
    }
}
