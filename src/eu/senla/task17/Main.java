package eu.senla.task17;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DaoUserImpl dao = new DaoUserImpl();
//        User user1 = new User("Andrey", "12345");
//        User user2 = new User("Billy", "54321");
//        User user3 = new User("Bobby", "98765");
//
//        System.out.println(dao.create(user1));
//        System.out.println(dao.create(user2));
//
//        System.out.println(dao.read("Billy", "54321"));
//
//        System.out.println(dao.update("Billy", user3));
//
        List<User> users = dao.readAll();
        users.forEach(System.out::println);


    }
}
