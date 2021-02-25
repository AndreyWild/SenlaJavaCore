package eu.senla.task8;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>(0);
        for (int i = 0; i < 15; i++) {
            list.add(1);
        }


        System.out.println(list.size());
    }
}
