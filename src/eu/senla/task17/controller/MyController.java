package eu.senla.task17.controller;

import eu.senla.task17.entity.User;
import eu.senla.task17.service.UserService;
import eu.senla.task17.service.UserServiceImpl;

import java.util.List;

public class MyController {

    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();


        User user1 = new User("Andrey", "12345");
        User user2 = new User("Billy", "54321");
        User user3 = new User("Bobby", "98765");

        System.out.println(userService.create(user1));
        System.out.println(userService.create(user2));

        System.out.println(userService.read("Billy"));

        System.out.println(userService.update("Billy", user3));

        List<User> users = userService.readAll();
        users.forEach(System.out::println);


    }
}
