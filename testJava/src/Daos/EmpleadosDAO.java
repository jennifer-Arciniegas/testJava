/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Daos;

import java.sql.Connection;
import testjava.conection.connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author camper
 */
public class EmpleadosDAO {
      public static void registroEmpleado(String nombre, String representante, String correo, String telefono, String direccion, String sector){
          
          String sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?)";
        try(Connection conn = connection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, representante);
            ps.setString(3, correo);
            ps.setString(4, telefono);
            ps.setString(5, direccion);
            ps.setString(6, sector);
            ps.executeUpdate();
            System.out.println("Cliente registrado.");
        } catch (Exception e) {
            System.out.println("Error en la operacion " + e.getMessage());
        }
 
    }
      

}
