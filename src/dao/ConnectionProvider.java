/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
  import java.sql.*;


/**/
 
 //* @author welcome


public class ConnectionProvider{
    
    
//     public static void main(String args[]) {
//        try{
//             Class.forName("com.mysql.cj.jdbc.Driver");
//          Connection con =   DriverManager.getConnection("jdbc:mysql://localhost:3306/foodorder?useSSL=false","root","pallavi@5");
//          Statement st= con.createStatement();
//          st.execute("create table user(id int AUTO_INCREMENT primary key,name varchar(200),address varchar(200),password varchar(100),phonenumber varchar(10),email varchar(200),securityquestion varchar(200),answer varchar(200),status varchar(20),UNIQUE(email))");
//        System.out.println("user table created succefully");
//       
//        }
//        catch(Exception e){
//           // JOptionPane.showMessageDialog(null,e);
//           
//             System.err.println(e);
//        }
//    }
//}

   
    public static  Connection getCon(){
        
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodorder?useSSL=false","root","pallavi@5");
           return con;
             } 
        
        catch(Exception e){
      
           System.err.println(e);
           return null;
        }
    
    }
}



    

