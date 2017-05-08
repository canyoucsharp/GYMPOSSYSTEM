package M_Database;

import java.sql.*;
import java.util.ResourceBundle;

import javax.swing.*;


// TODO: Auto-generated Javadoc
/**
 * The Class MysqlConnect.
 */
public class MysqlConnect {

/** The host name. */
private static String hostName;

/** The port. */
private static String port;

/** The user name. */
private static String userName;

/** The password. */
private static String password;

 
/** The conn. */
private Connection conn=null;
 
 /**
  * Select database.
  *
  * @throws DataBaseException the data base exception
  */
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
 
/**
 * Close connection.
 *
 * @param rs the rs
 * @param pst the pst
 * @param conn the conn
 */
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

/**
 * Connect DB.
 *
 * @return the connection
 */
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