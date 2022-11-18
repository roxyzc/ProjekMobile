/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

/**
 *
 * @author akbaroke
 */

import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Koneksi {
    
    private static Connection connect;
    public static Connection ConnectDB() throws SQLException{
        try {
            String DB = "jdbc:mysql://localhost/tb_library";
            String user = "root";   
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            connect = DriverManager.getConnection(DB, user, pass);
            
            System.out.println("Koneksi Berhasil...");
            
        } catch (SQLException e) {
            System.out.println("Koneksi Gagal...");
            JOptionPane.showMessageDialog(null, "Connection Error", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
        return connect;
    }
}
