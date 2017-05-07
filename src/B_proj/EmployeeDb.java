package B_proj;
import M_Database.MysqlConnect;
import java.sql.*;

public class EmployeeDb {
	private MysqlConnect myConnector;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	private Connection conn;

	public void init(Employee empObj) throws SQLException {
		// TODO Auto-generated method stub

		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();

		try {
			String query = "select * from salesrep where rep_id = ?";
			pst = conn.prepareStatement(query);
			pst.setInt(1, empObj.getId());
			pst.executeQuery();
			rs = pst.executeQuery();

			if (rs.next()) {

				empObj.setFirstName(rs.getString("first_name"));
				empObj.setLastName(rs.getString("last_name"));
				empObj.setPhoneNumber(rs.getString("phone_number"));
				empObj.setAddress(rs.getString("address"));
				empObj.setAge(rs.getInt("age"));
				empObj.setSex(rs.getString("sex"));
				empObj.setLicenseNum(rs.getString("license_num"));
				empObj.setSales(rs.getInt("sales"));
				empObj.setHourlyRate(rs.getInt("hourly_rate"));

			}
		}

		catch (Exception e) {
			System.out.println(e);
		}

		finally {
			rs.close();
			pst.close();
			conn.close();
			System.out.println("Connection closed");
		}

	}

	public void pushFirstName(String firstName, Employee empObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();

		String updateTableSQL = "UPDATE salesrep SET first_name = ? " + " WHERE rep_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, firstName);
			pst.setInt(2, empObj.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {

			pst.close();
			conn.close();
			System.out.println("Connection closed");
		}

	}

	public void pushLastName(String lastName, Employee empObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE salesrep SET last_name = ? " + " WHERE rep_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, lastName);
			pst.setInt(2, empObj.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			pst.close();
			conn.close();
			System.out.println("Connection closed");
		}

	}

	public void pushNumber(String number, Employee empObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE salesrep SET phone_num = ? " + " WHERE rep_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, number);
			pst.setInt(2, empObj.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			pst.close();
			conn.close();
			System.out.println("Connection closed");
		}

	}

	public void pushAddress(String address, Employee empObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE salesrep SET address = ? " + " WHERE rep_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, address);
			pst.setInt(2, empObj.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			pst.close();
			conn.close();
			System.out.println("Connection closed");
		}

	}

	public void pushAge(String age, Employee empObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE salesrep SET age = ? " + " WHERE rep_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, age);
			pst.setInt(2, empObj.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			pst.close();
			conn.close();
			System.out.println("Connection closed");
		}

	}

	public void pushSex(String sex, Employee empObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE salesrep SET sex = ? " + " WHERE rep_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, sex);
			pst.setInt(2, empObj.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			pst.close();
			conn.close();
			System.out.println("Connection closed");
		}

	}

	public void pushLicenseNumber(String newLicenseNumber, Employee empObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE salesrep SET license_num = ? " + " WHERE rep_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, newLicenseNumber);
			pst.setInt(2, empObj.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			pst.close();
			conn.close();
			System.out.println("Connection closed");
		}

	}

	public void pushSales(int newSales, Employee empObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE salesrep SET sales = ? " + " WHERE rep_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setInt(1, newSales);
			pst.setInt(2, empObj.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			pst.close();
			conn.close();
			System.out.println("Connection closed");
		}

	}

	public void pushHourlyRate(int newRate, Employee empObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE salesrep SET hourly_rate = ? " + " WHERE rep_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setInt(1, newRate);
			pst.setInt(2, empObj.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			pst.close();
			conn.close();
			System.out.println("Connection closed");
		}

	}

	public void pushUserName(String newUserName, Employee empObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();

		String updateTableSQL = "UPDATE salesrep SET username = ? " + " WHERE rep_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, newUserName);
			pst.setInt(2, empObj.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {

			pst.close();
			conn.close();
			System.out.println("Connection closed");
		}

	}

	public void pushPassword(String newPassword, Employee empObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();

		String updateTableSQL = "UPDATE salesrep SET password = ? " + " WHERE rep_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, newPassword);
			pst.setInt(2, empObj.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {

			pst.close();
			conn.close();
			System.out.println("Connection closed");
		}

	}

	public void pushAdmin(Boolean value, Employee empObj) throws SQLException{
		// TODO Auto-generated method stub
		
	}

}
