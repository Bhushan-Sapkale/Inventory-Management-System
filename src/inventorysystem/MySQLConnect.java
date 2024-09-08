/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorysystem;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 *
 * @author Prajakta
 */
public class MySQLConnect {
    Connection con;
    public Connection getConn(){
    
     try{
        // Class.forName("com.mysql.jdbc.Driver");    `com.mysql.cj.jdbc.Driver'              com.mysql.jdbc.Driver
         Class.forName("com.mysql.cj.jdbc.Driver");  
         JOptionPane.showMessageDialog(null, "Driver Load");
      //  conn=DriverManager.getConnection("jdbc:mysql://localhost:3306:csmssteacherinfo","root","root");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","@PrajaktaMysql3"); 
	JOptionPane.showMessageDialog(null, "Databse Connection SuccessFul MySQLConnect getconn method ");
        //;Class.forName("com.mysql.jdbc.Driver");  
  
        return con;             
          } catch(Exception se) 
        {
	JOptionPane.showMessageDialog(null, "Error in MySQLConnect getconn method "+se);
        }
     return con;
    }
}
