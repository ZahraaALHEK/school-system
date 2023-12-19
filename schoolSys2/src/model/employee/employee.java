/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.employee;

/**
 *
 * @author USER
 */
 public interface employee {
    void setId(int id);
    void setName(String name);
    void setGender(String g);
    void setAge(int age);
    void setSalary(int s);
    int getId();
    String getName();
    String getGender();
    int getAge();
    int getSalary();
    String getType();

    
}
