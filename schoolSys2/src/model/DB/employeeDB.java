/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DB;

import database.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Student;
import model.employee.EmployeeFactory;

import model.employee.employee;

/**
 *
 * @author USER
 */
public class employeeDB {
    private Connection conn;
       private PreparedStatement ps = null;
       List<employee> listS;
    public employeeDB() {
        this.listS = new ArrayList<>();
   this.conn = DB.leadConnection();
    }
     EmployeeFactory empF = new EmployeeFactory();
    public void insert(employee e){
    
        try{
            String query = "insert into employee values (null , ? , ?, ?, ?, ?) ";
            
            ps = conn.prepareStatement(query);
            ps.setString(1, e.getName());
            ps.setString(3, e.getGender());
            ps.setInt(2, e.getAge());
            ps.setInt(4, e.getSalary());
            ps.setString(5, e.getType());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "a record hase been inserted");
        }
        catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        
        }
        
    }
    public List<employee> loadData(String type){
    
    try{
        String query = "SELECT * FROM employee where type = '"+type+"'";
        ps = conn.prepareStatement(query);
       // ps.setString(1, type);
        ResultSet rs = ps.executeQuery(query);
        
        while (rs.next()){
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String gender = rs.getString("gender");
        int age = rs.getInt("age");
        //factory
        employee emp = empF.createEmployee(type);
        emp.setId(id);
        emp.setAge(age);
        emp.setGender(gender);
        emp.setName(name);
        
        listS.add(emp);
        
        }
        
        }catch(Exception e){
        
        JOptionPane.showMessageDialog(null, e);
        }
    return listS;
    }
    public void deleteData(int id){
     try{
            String query = "delete from employee where id = ? " ;
            ps = conn.prepareStatement(query);
           
            ps.setInt(1,id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"a record has been deleted");
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
    
    }

    public employee retutnAllDataToField(int id) {

           
           
           EmployeeFactory empFactory = new EmployeeFactory();
           employee emp = empFactory.createEmployee("support stuff");
           
        try{
            String query = "select * from employee where id ="+id;
            ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               String name = rs.getString("name");
               int age = rs.getInt("age");
               String gender = rs.getString("gender");
               
               // set data in student
               
               emp.setAge(age);
               emp.setId(id);
               emp.setGender(gender);
               emp.setName(name);
               
            }
            
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
           
        }
        
    return emp;

    }
    public void updatData(employee e){
    
    try{
            String query = "update employee set name = ? , age = ? , gender = ?  where id = ?  ";
            ps = conn.prepareStatement(query);
            ps.setString(1, e.getName());
            ps.setString(3, e.getGender());
            ps.setInt(2, e.getAge() );
            ps.setInt(4, e.getId());
           
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"a record has update");
            
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
    
    
    } 
}
