/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DB;

import database.DB;
import java.util.List;
import java.sql.Connection;
import javax.swing.JOptionPane;
import model.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.StudentBuilder;

/**
 *
 * @author USER
 */
public  class StudentDB {
       private Connection conn;
       private PreparedStatement ps = null;
       List<Student> listS;
    public StudentDB() {
        this.listS = new ArrayList<>();
   this.conn = DB.leadConnection();
    }
    
   
    
    
    public void insert(Student s){
    
        try{
            String query = "insert into students values (null , ? , ?, ?, ?, ?) ";
            
            ps = conn.prepareStatement(query);
            ps.setString(1, s.getName());
            ps.setString(2, s.getGender());
            ps.setInt(3, s.getAge());
            ps.setInt(4, s.getMobileNb());
            ps.setInt(5, s.getGrade());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "a record hase been inserted");
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        
        }
        
    } 
    
    public List<Student> loadData() {
        try{
        String query = "SELECT * FROM students";
        ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery(query);
        while (rs.next()){
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String gender = rs.getString("gendre");
        int age = rs.getInt("age");
        int mbnb =rs.getInt("mbnb");
        int grade = rs.getInt("grade");
        Student s = new StudentBuilder(id,name).setData(age ,gender , mbnb , grade).build();
        listS.add(s);
        
        }
        
        }catch(Exception e){
        
        JOptionPane.showMessageDialog(null, e);
        }
        
        
        return listS;
    }
    
    public Student retutnAllDataToField(int id){
        //Student n = new StudentBuilder(0,"").setData(0 ,"" , 0 , 0).build();
        try{
            String query = "select * from students where id ="+id;
            ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               String name = rs.getString("name");
               int age = rs.getInt("age");
               String gender = rs.getString("gendre");
               int mbnb = rs.getInt("mbnb");
               int grade = rs.getInt("grade");
               // set data in student
               
               Student s = new StudentBuilder(id,name).setData(age ,gender , mbnb , grade).build();
                return s ;
            }
            
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
           return null;
        }
        return null;
   
    }
    public void updatData(Student s){
        try{
            String query = "update students set name = ? , gendre = ? , age = ? , mbnb = ? , grade = ? where id = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, s.getName());
            ps.setString(2, s.getGender());
            ps.setInt(3, s.getAge() );
            ps.setInt(4, s.getMobileNb());
            ps.setInt(5, s.getGrade());
            ps.setInt(6, s.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"a record has update");
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
        
    
    
    }
    public void deleteData(int id){
     try{
            String query = "delete from students where id = ? " ;
            ps = conn.prepareStatement(query);
           
            ps.setInt(1,id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"a record has deleted");
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
    
    }
    
    
}
