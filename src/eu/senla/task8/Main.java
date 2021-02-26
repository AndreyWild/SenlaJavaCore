package eu.senla.task8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);



        MyList<Integer> list2 = new MyArrayList<>(list);


        System.out.println(list.size());
        System.out.println(list);

//        System.out.println(list.size());
//        System.out.println(list2);

        List<Integer> intList = new ArrayList<>(0);
        System.out.println(intList.size());


    }
}
