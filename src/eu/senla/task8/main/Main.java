package eu.senla.task8.main;

import eu.senla.task8.myList.MyArrayList;
import eu.senla.task8.myList.MyList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>(4);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2, 8);
        list.add(2,6);
        list.add(2, 5);
        list.add(8);
        list.add(9);
        System.out.println(list.get(2));





        MyList<Integer> list2 = new MyArrayList<>();
        list2.add(9);
        list2.add(9);
        list2.add(9);
        list2.add(9);


        System.out.println("size=" + list.size());
        System.out.println("length=" + list.getLenght());
        System.out.println(list);

        System.out.println("size=" + list2.size());
        System.out.println("length=" + list2.getLenght());
        System.out.println(list2);

        list.addAll(3, list2);

        System.out.println("size=" + list.size());
        System.out.println("length=" + list.getLenght());
        System.out.println(list);






    }
}
