/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author welcome
 */
public class Tables {
    
    public static void main(String args[]) {
        try{
        String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),phonenumber varchar(10),password varchar(100),address varchar(200),securityquestion varchar(200),answer varchar(200),status varchar(20),UNIQUE(email))";
     String adminDetails="insert into user(name,email,phonenumber,password,address,securityquestion,answer,status) values('Admin','admin@gmail.com','1234567890','admin','India','college name?','xyz','true')";
       String categoryTable= "create table category(id int AUTO_INCREMENT primary key,name varchar(200))" ;
     String productTable="create table product(id int AUTO_INCREMENT primary key, name varchar(200),category varchar(200),price varchar(200))";
       String billTable= "create table bill(id int primary key,name varchar(200),mobilenumber varchar(200),email varchar(200),date varchar(50),Total varchar(200),createdby varchar(200))" ;
 
     dboperations.setDataorDelete(userTable, "user table created succefully");
      dboperations.setDataorDelete(adminDetails, "admin details added succesfully");
       dboperations.setDataorDelete(categoryTable, "Category table created succesfully");
        dboperations.setDataorDelete(productTable, "Product table created succesfully");
         dboperations.setDataorDelete(billTable, "Bill table  created succesfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
           
            
        }
    }
    
}
