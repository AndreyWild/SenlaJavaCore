package eu.senla.task17.configuration;

import java.sql.*;

public class ConnectionToDB {

    private final String URL = "jdbc:mysql://localhost:3306/app?useSSL=false";
    private final String LOGIN = "root";
    private final String PASSWORD = "springcourse";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private Connection connect;
    //Class.forName(driver);


    public ConnectionToDB() {
        try {
            Class.forName(DRIVER);
            connect = DriverManager.getConnection(URL, LOGIN, PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public Connection getConnection(){
        return connect;
    }

    public void closeConnect(){
        try {
            connect.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
