/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.employee;

/**
 *
 * @author USER
 */
public class supportstaff implements employee {
     private int id;
    private String name;
    private String gender;
    private int age;
    private int salary;
    private String type;

    public supportstaff() {
        this.type = "support stuff";
        this.salary = 800;
    }
    
    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String g) {
        this.gender = g;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
              
    }

    @Override
    public void setSalary(int s) {
        this.salary = s;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public String getType() {
return type;
    }

    @Override
    public int getId() {
        return id;
    }
    
}
