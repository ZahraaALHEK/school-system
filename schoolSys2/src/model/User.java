/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USER
 */
public class User {
    private int id;
    private String Name;
    private String Email;
    private String Pass;

    public User(String Name, String Email, String Pass) {
        this.Name = Name;
        this.Email = Email;
        this.Pass = Pass;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getPass() {
        return Pass;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    
    
    
}
