package eu.senla.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Methods {

    // Метод возвращает случайное число из 6 знаков (типа 0,0000) в виде строки
    public static String getStringOfDouble() {
//        String number = (String.valueOf((Math.random() * 10))).substring(0, 6) // через substring();
        String number = String.format("%.4f", Math.random() * 10); // через format();
        return number;
    }

    /**
     * // -------------------- getStringOfDouble -------------------------------
     * # рандомное число от 0,0 до 9,9
     * double doubleNum = Math.random() * 10;
     * <p>
     * # переводим double в String
     * String stringNum = String.valueOf(doubleNum);
     * <p>
     * # инициализируем новый String из первых 6 символом String stringNum
     * String stringNum6 = stringNum.substring(0, 6);
     */

    // Метод возвращает строку из 6 случайных символов в двух регистрах
    public static String getStringOfSix() {
        String symbols = "AaBbCcDdEeFfGgHhIiKkLlMnNnOoPpQqRrSsTtVvXxYyZz";
        String wordOfSix = "";
        for (int i = 0; i < 6; i++) {
            wordOfSix = wordOfSix + symbols.charAt((int) (Math.random() * symbols.length()));
        }
        return wordOfSix;
    }

    /**
     * // --------------------- getStringOfSix --------------------------------
     * <p>
     * # создаем String и алфавита
     * String symbols = "AaBbCcDdEeFfGgHhIiKkLlMnNnOoPpQqRrSsTtVvXxYyZz";
     * <p>
     * # создаем пустой String для заполнения его случайными 6-ю char
     * String symbols6 = "";
     * <p>
     * # цикл на 6 итераий который добавит 6 лучайных символов в symbols6 из symbols
     * for (int i = 0; i < 6; i++) {
     * <p>
     * # генерируем случайное double число от 0 до размер String symbols
     * double randomDouble = (Math.random() * symbols.length());
     * <p>
     * # кастим double в int
     * int randomInt = (int) randomDouble;
     * <p>
     * # на каждой итерации к symbols6 = "" добавляет по одному рандомному чару из symbols
     * symbols6 = symbols6 + symbols.charAt(randomInt);
     * }
     */

    // Метод возвращает матрицу 10 х 10 из случайных чисел и рандомных слов
    public static String[][] getMatrix() {
        String[][] matrix = new String[10][10];
        /** задаем массив matrix 10 на 10 */
        for (int i = 0; i < matrix.length; i++) {
            /** цикл итерирует столбцы */
            for (int j = 0; j < matrix[i].length; j++) {
                /** цикл итерирует строки в столбцах */
                if (j % 3 == 0) {
                    /** если индекс строки при делении на модуль 3 равен 0 */
                    matrix[i][j] = getStringOfDouble();
                    /** то заполняем данный элемент строки String из double */
                } else {
                    matrix[i][j] = getStringOfSix();
                    /** иначе заполняем данный элемент строки String из случайных чаров */
                }
            }
        }
        return matrix;
        /** возвращаем получившийся модуль */
    }

    // Метод выводит мартицу из любых элементов. String, Integer...
    public static <T> void showMatrix(T[][] matrix1) {
        T matrix[][] = matrix1;
//        matrix = matrix1;
        for (int i2 = 0; i2 < matrix.length; i2++) {
            for (int j = 0; j < matrix[i2].length; j++) {
                System.out.print(matrix[i2][j] + "\t");
            }
            System.out.println();
        }
    }

    // Метод возвращает прямую диагональ матрицы
    public static String[] getDiagonal(String[][] matrix) {
        String[] diagonal = new String[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    // Метод возвращает побочную диагональ матрицы
    public static String[] getSideDiagonal(String[][] matrix) {
        String[] sideDiagonal = new String[matrix.length];
        for (int i = matrix.length - 1; i >= 0; i--) {
            int j = matrix.length - 1 - i;
            sideDiagonal[i] = matrix[i][j];
        }
        return sideDiagonal;
    }

    // Метод объеденяет два однотипных массива любого типа в один и возвращает его
    public static <T> T[] joinArray(T[] array1, T[] array2) {
        T[] joinArray = Arrays.copyOf(array1, array1.length + array2.length);
        System.arraycopy(array2, 0, joinArray, array1.length, array2.length);
        return joinArray;
    }


    // Метод выводит массив любого типа
    public static <T> void showArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Метод сравнивает равны ли две диагонали
    public static <T> void compareArrays(T[] array1, T[] array2) {
        Boolean result = Arrays.equals(array1, array2);
        if (result == true) {
            System.out.println("Diagonals are equal.");
        } else {
            System.out.println("Diagonals not equal.");
        }
    }

    // Метод вывводит StringBuilder и Array из массива
    public static void showSbArray(String[] array) {
        StringBuilder sb = new StringBuilder();
        double numb;
        ArrayList<Integer> listInt = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(".")) {
                numb = Double.parseDouble(array[i]);
                if (numb >= 1.7) {
                    numb = Math.ceil(numb);
                } else {
                    numb = Math.floor(numb);
                }
                listInt.add((int) numb);

            } else {
                sb.append(array[i], 1, 4).append(", ");
            }
        }

        System.out.print("StringBuilder: ");
        System.out.println(sb.toString() + "\n");
        System.out.print("Array of numbers: ");
        for (int i = 0; i < listInt.size(); i++) {
            System.out.print(listInt.get(i));
            if (i != listInt.size() - 1) {
                System.out.print("_");
            }
        }
    }

    public static void main(String[] args) {
        // Создаем тарицу
        String[][] matrix = getMatrix();
        System.out.println("---------------------------------------- MyMatrix ----------------------------------------");
        // Выводим матрицу
        showMatrix(matrix);
        // Получаем и выводим прямую дигональ
        System.out.println("-------------------------------- Прямая диагональ -------------------------------");
        showArray(getDiagonal(matrix));
        // Получаем и выводим побочную дигональ
        System.out.println("-------------------------------- Побочная диагональ -----------------------------");
        showArray(getSideDiagonal(matrix));
        // Сравниваем две диагонали и выводим резултат
        System.out.println("-------------------------------- Сравниваем диагонали ---------------------------");
        compareArrays(getDiagonal(matrix), getSideDiagonal(matrix));
        // Получаем и выводим массив из прямой и побочной диагоналей
        System.out.println("-------------------------------- Массив из диагоналей ---------------------------");
        showArray(joinArray(getDiagonal(matrix), getSideDiagonal(matrix)));
        // Преобразуем элементы в строку и выводим
        System.out.println("-------------------------------- Преобр. элементы в строки и числа --------------");
        showSbArray(joinArray(getDiagonal(matrix), getSideDiagonal(matrix)));
    }
}
