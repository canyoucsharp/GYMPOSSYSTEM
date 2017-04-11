import java.sql.DriverManager;
import java.sql.*;
import javax.swing.*;

public class MysqlConnect {
	static Connection conn=null;

public static Connection ConnectDB()
{
	
	
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/voting","root","Vanquish123");
		JOptionPane.showMessageDialog(null,"Connection Success");
		return conn;
	}
	catch(Exception e)
	{
		JOptionPane.showMessageDialog(null,e);
		return null;
	}
	
	
}
public static void main(String[] args)
{
	MysqlConnect.ConnectDB();
}
	
	
}
