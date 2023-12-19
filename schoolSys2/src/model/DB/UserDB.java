/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DB;


import database.DB;
import java.sql.Statement;
import model.User;




import java.sql.Connection;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class UserDB {
    private Connection conn;
 

    public UserDB() {
        this.conn = DB.leadConnection();
    }
    public void insertDataSignUp(User u){
        PreparedStatement st = null;
        
       try{
        String query = "INSERT INTO signup  VALUES (null , ?, ?, ?)";
        st = conn.prepareStatement(query) ;
        st.setString(1, u.getName());
        st.setString(2,u.getEmail());
        st.setString(3, u.getPass());
        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "you have signup successefully , now go login");
       }catch(Exception e){
       JOptionPane.showMessageDialog(null, e);
       
       }
        
     
   }   

   public boolean checkLogin(User u){
        boolean b = false;
      Statement st = null;
    try{
        String query = "select idsignup from signup where email = '"+ u.getEmail() +"'AND pass = '"+ u.getPass() +"' ";
        st =  conn.createStatement();
        
        ResultSet rs = st.executeQuery(query);
         if(rs.next()){
         b = true;
         }
        
        
    }catch(Exception e){ 
        JOptionPane.showMessageDialog(null, e);
       
           }
    return b;
    }


}
