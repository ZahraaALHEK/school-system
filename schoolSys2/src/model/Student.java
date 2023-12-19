/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USER
 */
public class Student {
    private int id;
    private String Name;
    private int age;
    private String Gender;
    private int MobileNb;
    private int grade;

    public Student(StudentBuilder b) {
        this.id = b.getId();
        this.Name = b.getName();
        this.age = b.getAge();
        this.Gender = b.getGender();
        this.MobileNb = b.getMobileNb();
        this.grade = b.getGrade();
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
    
    
}
