package eu.senla.task17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoUserImpl implements Dao{
    ConnectionToDB connection = new ConnectionToDB();
    Connection connect = connection.getConnection();

    @Override
    public User create(User user) {
        try (PreparedStatement stmt = connect.prepareStatement("INSERT INTO users (login, password) VALUES (?, ?)")){
            stmt.setString(1, user.getLogin());
            stmt.setString(2, user.getPassword());
            stmt.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            connection.closeConnect();
        }
        return user;
    }

    @Override
    public User read(String name, String password) {
        User user = null;
        try (PreparedStatement stmt = connect.prepareStatement("SELECT * FROM users")) {
            ResultSet rs = stmt.executeQuery();
            String id;
            String login;
            String pass;
            while (rs.next()){
                id = rs.getString("id");
                login = rs.getString("login");
                pass = rs.getString("password");
                if(name.equals(login) && password.equals(pass)){
                    user = new User(Integer.parseInt(id), login, pass);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            connection.closeConnect();
        }
        return user;
    }

    @Override
    public User update(String name, User newUser) {
        try(PreparedStatement stmt = connect.prepareStatement("UPDATE users SET login=?, password=? WHERE login=?")){
            stmt.setString(1, newUser.getLogin());
            stmt.setString(2, newUser.getPassword());
            stmt.setString(3, name);
            stmt.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            connection.closeConnect();
        }
        return newUser;
    }

    @Override
    public boolean delete(String name, String password) {
        try(PreparedStatement stmt = connect.prepareStatement("DELETE FROM users WHERE login=? AND password=?")){
            stmt.setString(1, name);
            stmt.setString(2, password);
            stmt.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        } finally {
            connection.closeConnect();
        }

    }

    @Override
    public List<User> readAll() {
        List<User> users = new ArrayList<>();
        try (PreparedStatement stmt = connect.prepareStatement("SELECT * FROM users")) {
            ResultSet rs = stmt.executeQuery();
            String id;
            String login;
            String pass;
            while (rs.next()){
                id = rs.getString("id");
                login = rs.getString("login");
                pass = rs.getString("password");
                users.add(new User(Integer.parseInt(id), login, pass));
            }
        } catch (SQLException throwables) { throwables.printStackTrace(); }
        finally {
            connection.closeConnect();
        }
        return users;
    }
}
