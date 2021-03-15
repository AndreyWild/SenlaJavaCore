package eu.senla.task11.main;


import eu.senla.task11.exceptions.MyArrayIndexOutOfBoundsExcept;
import eu.senla.task11.exceptions.MyIllegalArgumentExcept;
import eu.senla.task11.exceptions.MyNullPointerExcept;
import eu.senla.task11.myList.MyArrayList;
import eu.senla.task11.myList.MyList;
import eu.senla.task8.students.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
            MyList<Integer> list = new MyArrayList<>(-4);
        } catch (MyIllegalArgumentExcept ex){
            System.err.println(ex.getClass() + ": " + ex.getMessage());
        } finally {
            System.out.println("Это finally MyIllegalArgumentExcept: Попробуй еще раз");
        }

        MyArrayList<Integer> listIntNull = null;

        try {
            MyArrayList<Integer> list = new MyArrayList<>(listIntNull);

        }catch (MyNullPointerExcept ex){
            System.err.println(ex.getClass() + ": " + ex.getMessage());
        }finally {
            System.out.println("Это finally MyNullPointerExcept: Попробуй еще раз");
        }

        MyList<String> listStr = new MyArrayList<>();


        try{
            listStr.get(-5);
        }catch (MyArrayIndexOutOfBoundsExcept ex){
            System.err.println(ex.getClass() + ": " + ex.getMessage());
        } finally {
            System.out.println("Это finally MyArrayIndexOutOfBoundsExcept: Попробуй еще раз");
        }

















    }
}
