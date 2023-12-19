/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USER
 */
public class StudentBuilder {
    private int id;
    private String Name;
    private int age;
    private String Gender;
    private int MobileNb;
    private int grade;

    public StudentBuilder(int id, String Name) {
        this.id = id;
        this.Name = Name;
    }
    
    public StudentBuilder setData(int age , String gender ,int mnb ,int grade ){
        this.Gender = gender;
        this.age = age;
        this.MobileNb = mnb;
        this.grade = grade;
        return this;
    }
    
     public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return Gender;
    }

    public int getMobileNb() {
        return MobileNb;
    }

    public int getGrade() {
        return grade;
    }

    public Student build(){
    return new Student(this);
    }
    
    
    
}
