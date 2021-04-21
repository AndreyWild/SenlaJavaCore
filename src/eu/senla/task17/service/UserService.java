package eu.senla.task17.service;

import eu.senla.task17.entity.User;

import java.util.List;

public interface UserService {

    User create (User user);

    User read(String name);

    User update(String name, User newUser);

    boolean delete(String name, String password);

    List<User> readAll();

}
