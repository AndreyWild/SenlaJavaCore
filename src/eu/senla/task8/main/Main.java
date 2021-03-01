package eu.senla.task8.main;

import eu.senla.task8.myList.MyArrayList;
import eu.senla.task8.myList.MyList;
import eu.senla.task8.comparators.*;
import eu.senla.task8.students.Students;

import java.util.Comparator;

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

        list.sort(new IntComparator());
        System.out.println(list);

        MyList<Students> listStudents = new MyArrayList<>();
        listStudents.add(new Students(32, "Andrey", 2, 8.7));
        listStudents.add(new Students(15, "Dmitrij", 4, 7.2));
        listStudents.add(new Students(1, "Oleg", 5, 6.3));
        listStudents.add(new Students(12, "Marija", 1, 5.0));
        listStudents.add(new Students(5, "Elena", 3, 9.3));
        System.out.println(listStudents);

        listStudents.sort(new IdStudCompar());
        System.out.println(listStudents);

        listStudents.sort(new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        System.out.println(listStudents);










    }
}
