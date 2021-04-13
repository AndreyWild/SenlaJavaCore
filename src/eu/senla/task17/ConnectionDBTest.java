package eu.senla.task17;

import java.sql.*;

public class ConnectionDBTest {
    public static void main(String[] args) throws ClassNotFoundException{
        String url = "jdbc:mysql://localhost:3306/app?useSSL=false";
        String username = "root";
        String password = "springcourse";
        Class.forName("com.mysql.jdbc.Driver");

        try(Connection connect = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connection to Store DB successful!");

            /* Создает нужную таблицу в базе данных
            PreparedStatement stmt = connect.prepareStatement(
                    "CREATE TABLE users (\n" +
                            "  id int(10) NOT NULL AUTO_INCREMENT,\n" +
                            "  login varchar(20) UNIQUE NOT NULL,\n" +
                            "  password varchar(24) NOT NULL,\n" +
                            "  PRIMARY KEY (id)\n" +
                            ");");
             */

            // Обновить значения лог/пасс по id
//            PreparedStatement stmt = connect.prepareStatement("UPDATE users SET login=?, password=? WHERE id=?");
            // Дай мне столбцы таблицы users
//            PreparedStatement stmt = connect.prepareStatement("SELECT * FROM users");
            // Создай новую строку с значениями из переменных
//            PreparedStatement stmt = connect.prepareStatement("INSERT INTO users (login, password) VALUES (?, ?)");
            // Удали стороку с указанными дог/пасс
//            PreparedStatement stmt = connect.prepareStatement("DELETE FROM users WHERE login=? AND password=?");
//
//            stmt.setString(1, "Vlad");
//            stmt.setString(2, "000000");
//            stmt.setInt(3,2);

//            stmt.execute();

//            ResultSet rs = stmt.executeQuery();
//            String name;
//            String pass;
//            while (rs.next()){
//                name = rs.getString("login");
//                pass = rs.getString("password");
//                System.out.println("------------------------");
//                System.out.println(name + " " + pass);
//            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }




    }
}

//ALTER TABLE users ADD UNIQUE (login)