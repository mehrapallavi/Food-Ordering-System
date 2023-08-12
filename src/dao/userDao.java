/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import com.mysql.cj.conf.PropertyKey;
import javax.swing.JOptionPane;
import model.user;
import java.sql.*;
import java.util.*;

/**
 *
 * @author welcome
 */
public class userDao {
    
    public static void save(user User){
        String query=  "insert into User(name,email,phonenumber,password,address,securityquestion,answer,status) values('"+User.getName()+"','"+User.getEmail()+"','"+User.getPhnonenumber()+"','"+User.getPassword()+"','"+User.getAddress()+"','"+User.getSecurityquestion()+"','"+User.getAnswer()+"','false')";  // initially status false
          
       
      
      dboperations.setDataorDelete(query, "Registered successfully! Wait for admin approval");
    }
    
public static user login(String email,String password){
    user User=null;
    try{
        ResultSet rs = dboperations.getData("select * from user where email = '"+email+"' and password ='"+password+"'");
        while(rs.next()){
            User =new user();
            User.setStatus(rs.getString("status"));
            
        }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    return User;
}
public static user getSecurityQuestion(String email){
    user User = null;
    try{
        ResultSet rs= dboperations.getData("select * from user where email = '"+email+"'");
        while(rs.next()){
            User=new user();
            User.setSecurityquestion(rs.getString("securityquestion"));
            User.setAnswer(rs.getString("answer"));
        }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    return User;
}

public static void update(String email,String newPassword){
    String query="update user set password='"+newPassword+"' where email = '"+ email +"'";
    dboperations.setDataorDelete(query, "password changed successfully");
}

public static ArrayList<user> getAllRecords(String email){
    ArrayList<user> arrayList= new ArrayList<>();
    try{
        ResultSet rs= dboperations.getData("select * from user where email like '%"+email+"%'");
        while(rs.next()){
            user User = new user();
            User.setId(rs.getInt("id"));
            User.setName(rs.getString("name"));
            User.setEmail(rs.getString("email"));
            User.setPhnonenumber(rs.getString("phonenumber"));
            User.setAddress(rs.getString("address"));
            User.setSecurityquestion(rs.getString("securityquestion"));
            User.setStatus(rs.getString("status"));
            arrayList.add(User);
            
        }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        
    }
    
    return arrayList;
}

public static void changeStatus(String email,String status){
        String query = "update user set status = '"+status+"' where email = '"+email+"'";
        dboperations.setDataorDelete(query, "Status changed successfully");
}


public static void changePassword(String email,String oldpassword,String newpassword){
    try{
        ResultSet rs = dboperations.getData("select * from user where email ='"+email+"' and password = '"+oldpassword+"'");
        if(rs.next()){
            update(email, newpassword);
        }
        else{
            JOptionPane.showMessageDialog(null, "Old password is wrong");
        }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
}


public static  void changeSecurityQuestion(String email, String password ,String securityQuestion,String answer){
    try{
        ResultSet rs = dboperations.getData("select * from user where email ='"+email+"' and password = '"+password+"'");
        if(rs.next()){
            update(email, securityQuestion, answer);
        }
        else{
            JOptionPane.showMessageDialog(null, "Password is wrong");
        }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    
}

public static void update(String email,String securityquestion,String answer){
    String query = "update user set securityquestion ='"+securityquestion+"' where answer ='"+answer+"' and email ='"+email+"'";
    dboperations.setDataorDelete(query, "Security Question Changed Successfully");
    
}
}