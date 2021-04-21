package eu.senla.task17.service;

import eu.senla.task17.dao.Dao;
import eu.senla.task17.entity.User;

import java.util.List;

public class UserServiceImpl implements UserService{

    private Dao userDao;

    @Override
    public User create(User user) {
        return userDao.create(user);
    }

    @Override
    public User read(String name) {
        return userDao.read(name);
    }

    @Override
    public User update(String name, User newUser) {
        return userDao.update(name, newUser);
    }

    @Override
    public boolean delete(String name, String password) {
        return userDao.delete(name, password);
    }

    @Override
    public List<User> readAll() {
        return userDao.readAll();
    }
}
