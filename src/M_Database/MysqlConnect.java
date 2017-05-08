package M_Database;

import java.sql.*;
import java.util.ResourceBundle;

import javax.swing.*;


public class MysqlConnect {
private static String hostName;
private static String port;
private static String userName;
private static String password;

 
private Connection conn=null;
 public static void SelectDatabase() throws DataBaseException {
		ResourceBundle	 bundle = ResourceBundle.getBundle("DataBase");
		
		
		if ( bundle.containsKey("HostName") ) {
			hostName = bundle.getString("HostName");
		 }
		
		if ( bundle.containsKey("Port") ) {
			port = bundle.getString("Port");
		}
		
		if ( bundle.containsKey("UserName") ) {
			userName = bundle.getString("UserName");
		}
		if ( bundle.containsKey("Password") ) {
			password = bundle.getString("Password");
		}

	}
 
public void closeConnection(ResultSet rs,PreparedStatement pst,Connection conn)
{
	try
	{
	if(rs!=null)
	rs.close();
	if(pst!=null)
	pst.close();
	if(conn!=null)
	conn.close();
	System.out.println("Connection closed");
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage().toString());
	}
	
	
}

public Connection ConnectDB()
{
	try {
		SelectDatabase();
	} catch (DataBaseException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
try
 {
  Class.forName("com.mysql.jdbc.Driver");
  conn=DriverManager.getConnection("jdbc:mysql://"+hostName+port+"/nyfitness",userName,password);
  //JOptionPane.showMessageDialog(null,"Connection Success");
  System.out.println("Connection open");
  return conn;
 }
 catch(Exception e)
 {
  JOptionPane.showMessageDialog(null,e);
  return null;
 }

 
}

 
 
}