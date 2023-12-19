/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.employee;

/**
 *
 * @author USER
 */
public class teacher implements employee {
    private int id;
    private String name;
    private String gender;
    private int age;
    private int salary;
    private String type;

    public teacher() {
        this.type = "teacher";
        this.salary = 1000;
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
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

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

    
    
}
