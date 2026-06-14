package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/controle_impressao";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123456";

    public static Connection getConnection(){
        try{
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connected successfully");
            return connection;
        } catch (SQLException e){
            System.out.println("Connection failed: " + e.getMessage());
            return null;
        }
    }

}
