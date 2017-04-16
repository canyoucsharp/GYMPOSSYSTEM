package B_proj;



import M_Database.MysqlConnect;
import java.sql.*;

public class CustomerDb {
private Connection conn;
private MysqlConnect myConnector;
private PreparedStatement pst;
private ResultSet rs=null;
	
public static void main(String args[]) throws SQLException
{
	CustomerDb mycusdb=new CustomerDb();
	Customer mycus=new Customer();
	mycus.setId(22);
	mycusdb.init(mycus);
	mycusdb.pushFirstName("michael", mycus);
	mycusdb.init(mycus);
	System.out.println(mycus.getFirstName());
}


public  void init(Customer cusObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector=new MysqlConnect();
		conn= myConnector.ConnectDB();

		
		try {
			String query = "select * from clients where client_id = ?";
			pst = conn.prepareStatement(query);
			pst.setInt(1, cusObj.getId());
			pst.executeQuery();
			rs = pst.executeQuery();

			if (rs.next()) {

				cusObj.setFirstName(rs.getString("first_name"));
				cusObj.setLastName(rs.getString("last_name"));
				cusObj.setPhoneNumber(rs.getString("phone_number"));
				cusObj.setAddress(rs.getString("address"));
				cusObj.setAge(rs.getInt("age"));
				cusObj.setSex(rs.getString("sex"));
				cusObj.setLicenseNum(rs.getString("license_num"));
				cusObj.setSubId(rs.getInt("sub_id"));
				cusObj.setRepId(rs.getInt("rep_id"));

			}
		} 
		
		catch (Exception e) {
			System.out.println(e);
		}
		
		
		finally {
				rs.close();
				pst.close();
				conn.close();
				}
		
	}

	

	public  void pushFirstName(String firstName, Customer cusObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector=new MysqlConnect();
		conn= myConnector.ConnectDB();
		
		String updateTableSQL = "UPDATE clients SET first_name = ? " + " WHERE client_id = ?";
		try {
		pst = conn.prepareStatement(updateTableSQL);
		pst.setString(1, firstName);
		pst.setInt(2, cusObj.getId());
		pst.executeUpdate();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			
			pst.close();
			conn.close();
			}
		
	}

	public  void pushLastName(String lastName, Customer cusObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector=new MysqlConnect();
		conn= myConnector.ConnectDB();
		String updateTableSQL = "UPDATE clients SET last_name = ? " + " WHERE client_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, lastName);
			pst.setInt(2, cusObj.getId());
			pst.executeUpdate();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		finally {
			pst.close();
			conn.close();
			}

	}

	public  void pushNumber(String number, Customer cusObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector=new MysqlConnect();
		conn= myConnector.ConnectDB();
		String updateTableSQL = "UPDATE clients SET phone_number = ? " + " WHERE client_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, number);
			pst.setInt(2, cusObj.getId());
			pst.executeUpdate();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		finally {
			pst.close();
			conn.close();
			}


	}

	public  void pushAddress(String address, Customer cusObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector=new MysqlConnect();
		conn= myConnector.ConnectDB();
		String updateTableSQL = "UPDATE clients SET address = ? " + " WHERE client_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1,address);
			pst.setInt(2, cusObj.getId());
			pst.executeUpdate();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		finally {
			pst.close();
			conn.close();
			}

	}

	public  void pushAge(String age, Customer cusObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector=new MysqlConnect();
		conn= myConnector.ConnectDB();
		String updateTableSQL = "UPDATE clients SET age = ? " + " WHERE client_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1,age);
			pst.setInt(2, cusObj.getId());
			pst.executeQuery();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		finally {
			pst.close();
			conn.close();
			}

	}

	public  void pushSex(String sex, Customer cusObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector=new MysqlConnect();
		conn= myConnector.ConnectDB();
		String updateTableSQL = "UPDATE clients SET sex = ? " + " WHERE client_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1,sex);
			pst.setInt(2, cusObj.getId());
			pst.executeUpdate();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		finally {
			pst.close();
			conn.close();
			}

	}

	public  void pushLicenseNumber(String newLicenseNumber, Customer cusObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector=new MysqlConnect();
		conn= myConnector.ConnectDB();
		String updateTableSQL = "UPDATE clients SET license_num = ? " + " WHERE client_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1,newLicenseNumber);
			pst.setInt(2, cusObj.getId());
			pst.executeUpdate();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		finally {
			pst.close();
			conn.close();
			}

	}

	public  void pushSubId(int newSubId, Customer cusObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector=new MysqlConnect();
		conn= myConnector.ConnectDB();
		String updateTableSQL = "UPDATE clients SET sub_id = ? " + " WHERE client_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setInt(1,newSubId);
			pst.setInt(2, cusObj.getId());
			pst.executeUpdate();
			}
		catch(Exception e)
		{
				System.out.println(e);
		}
		finally {
			pst.close();
			conn.close();
			}

	}

	public  void pushRepId(int newRepId, Customer cusObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector=new MysqlConnect();
		conn= myConnector.ConnectDB();
		String updateTableSQL = "UPDATE clients SET rep_id = ? " + " WHERE client_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setInt(1,newRepId);
			pst.setInt(2, cusObj.getId());
			pst.executeUpdate();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		finally {
			pst.close();
			conn.close();
			}

	}

}
