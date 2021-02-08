package eu.senla.task4;

public class MethodsTest {
    @Override
    public String toString() {
        return "MethodsTest{}";
    }

    public static void main(String[] args) {
        String [] array1 = {"Privet", "Poka"};
        String [] array2 = {"Privet", "Poka"};
        //System.out.println(Methods.jointArray(array1, array2));
        String [] array3 = Methods.joinArray(array1, array2);
        Methods.showArray(array3);
        Methods.compareArrays(array1, array2);








//        Methods.showMatrix(Methods.getMatrix());
        String[][] testmatrix = Methods.getMatrix();

        for (int i2 = 0; i2 < testmatrix.length; i2++) {
            for (int j = 0; j < testmatrix[i2].length; j++) {
                System.out.print(testmatrix[i2][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------");

        for (int i = 0; i < testmatrix.length; i++) {
            System.out.print("(" + i + "." + i + ")" + testmatrix[i][i] + "\t");
        }

        System.out.println();
        System.out.println("-------------------------------------");

        for (int i = testmatrix.length-1; i >= 0 ; i--) {
            int j = testmatrix.length-1 - i;
            System.out.print("(" + i + "." + j + ")" + testmatrix[i][j] + "\t");
            }

            int i = 0;
        for (int j = 0; j < testmatrix.length; j++) {
            System.out.print("(" + i + "." + j + ")" + testmatrix[i][j] + "\t");
            i++;
        }
        System.out.println();
        System.out.println("-------------------------------------");


        }




//        String[][] matrix = new String[10][10];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (j % 3 == 0) {
//                    matrix[i][j] = getStringOfDouble ();
//                } else {
//                    matrix[i][j] = getStringOfSix ();
//                }
//            }
//        }


//        for (int i2 = 0; i2 < matrix.length; i2++) {
//            for (int j = 0; j < matrix[i2].length; j++) {
//                System.out.print(matrix[i2][j] + "\t");
//            }
//            System.out.println();
//
//        }


//    }

/*
 // -------------------- getStringOfDouble -------------------------------
 # рандомное число от 0,0 до 9,9
 double doubleNum = Math.random() * 10;

 # переводим double в String
 String stringNum = String.valueOf(doubleNum);

 # инициализируем новый String из первых 6 символом String stringNum
 String stringNum6 = stringNum.substring(0, 6);

 // --------------------- getStringOfSix --------------------------------

 # создаем String и алфавита
 String symbols = "AaBbCcDdEeFfGgHhIiKkLlMnNnOoPpQqRrSsTtVvXxYyZz";

 # создаем пустой String для заполнения его случайными 6-ю char
 String symbols6 = "";

 # цикл на 6 итераий который добавит 6 лучайных символов в symbols6 из symbols
 for (int i = 0; i < 6; i++) {

 # генерируем случайное double число от 0 до размер String symbols
 double randomDouble = (Math.random() * symbols.length());

 # кастим double в int
 int randomInt = (int) randomDouble;

 # на каждой итерации к symbols6 = "" добавляет по одному рандомному чару из symbols
 symbols6 = symbols6 + symbols.charAt(randomInt);
 }
 */


    public static String getStringOfDouble() {
        String number = (String.valueOf((Math.random() * 10))).substring(0, 6);
        return number;
    }

    //
    public static String getStringOfSix() {
        String symbols = "AaBbCcDdEeFfGgHhIiKkLlMnNnOoPpQqRrSsTtVvXxYyZz";
        String wordOfSix = "";
        for (int i = 0; i < 6; i++) {
            wordOfSix = wordOfSix + symbols.charAt((int) (Math.random() * symbols.length()));
        }
        return wordOfSix;
    }


    public static String[][] getMatrix() {
        String[][] matrix = new String[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j % 3 == 0) {
                    matrix[i][j] = getStringOfDouble();
                } else {
                    matrix[i][j] = getStringOfSix();
                }
            }
        }
        return matrix;
    }

}