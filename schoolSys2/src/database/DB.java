/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
 
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class DB {

    public static Connection conn = null;

    
    
    
     public static Connection leadConnection() {
         String url = "jdbc:mysql://localhost:3306/schooldatal";
         String root = "root"; 
         String pass = "W@2915djkq#";
         
         if (conn == null){
         
         try {
            conn = DriverManager.getConnection(url,root,pass);
            
         } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
         } 
         }
         
         return conn;
       
         
    }
    
    
    
}
