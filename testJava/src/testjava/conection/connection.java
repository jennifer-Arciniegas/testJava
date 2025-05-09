/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testjava.conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author camper
 */
public class connection {
     private static final String URL = "jdbc:mysql://localhost:3306/gestionproyectos";
    private static final String USER = "campus2023";
    private static final String PASSWORD = "campus2023";
    private static Connection connection;

    private connection() {
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                  DriverManager.getConnection(URL, USER, PASSWORD);
                  System.out.println("bien conectada");
                    
            } catch (SQLException e) {
                System.err.println("error: " + e.getMessage());
                return null;
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("🔒cerrada la base de datos.");
                connection = null;
            } catch (SQLException e) {
                System.err.println("error cerrando conecxion: " + e.getMessage());
            }
        }
    }
}
