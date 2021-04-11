package eu.senla.task17;

import java.util.List;

public interface Dao {

    User create (User user);
    User read (String name, String password);
    User read (String name, User newUser);
    boolean delete(String name, String password);
    List<User> readAll();

}
