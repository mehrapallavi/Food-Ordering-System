/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.*;
///**
// *
// * @author welcome
// */
public class dboperations {
    public static void setDataorDelete(String Query,String msg){
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st= con.createStatement();
            st.executeUpdate(Query);
            
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null, msg);
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
//            System.err.println(e);

        }
        
        
    }
    
    public static ResultSet getData(String query){
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs= st.executeQuery(query);
            return rs;
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
             return null;
        }
    }
}

