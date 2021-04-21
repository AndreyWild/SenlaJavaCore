package eu.senla.task17.dao;

import eu.senla.task17.entity.User;

import java.util.List;

public interface Dao {

    User create (User user);

    User read(String name);

    User update(String name, User newUser);

    boolean delete(String name, String password);

    List<User> readAll();

}
