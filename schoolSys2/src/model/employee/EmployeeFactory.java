/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.employee;

/**
 *
 * @author USER
 */
public class EmployeeFactory {

    public EmployeeFactory() {
    }
    public employee createEmployee(String type){
    if(type.equals("teacher")){
    teacher t = new teacher();
    return t;
    }else if(type.equals("administrator")){
    administrators a = new administrators();
    return a;
    }else if(type.equals("support stuff")){
    supportstaff sup = new supportstaff();
    return sup;
    
    }
    else{return null;}
    }
}
