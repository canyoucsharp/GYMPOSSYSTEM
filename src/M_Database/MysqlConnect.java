package M_Database;

import java.sql.*;
import javax.swing.*;

public class MysqlConnect {
 private Connection conn=null;
 

public Connection ConnectDB()
{
try
 {
  Class.forName("com.mysql.jdbc.Driver");
  conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/nyfitness","root","Vanquish123");
  JOptionPane.showMessageDialog(null,"Connection Success");
  return conn;
 }
 catch(Exception e)
 {
  JOptionPane.showMessageDialog(null,e);
  return null;
 }
 
 
}

 
 
}