	package B_proj;
import M_Database.MysqlConnect;
import java.sql.*;

// TODO: Auto-generated Javadoc
/**
 * The Class EmployeeDb.
 */
public class EmployeeDb {
	
	/** The my connector. */
	private MysqlConnect myConnector;
	
	/** The pst. */
	private PreparedStatement pst = null;
	
	/** The rs. */
	private ResultSet rs = null;
	
	/** The conn. */
	private Connection conn;

	/**
	 * Inits the.
	 *
	 * @param empObj the emp obj
	 * @throws SQLException the SQL exception
	 */
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
			myConnector.closeConnection(rs, pst, conn);
		}

	}

	/**
	 * Push first name.
	 *
	 * @param firstName the first name
	 * @param empObj the emp obj
	 * @throws SQLException the SQL exception
	 */
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
			myConnector.closeConnection(rs, pst, conn);
		}

	}

	/**
	 * Push last name.
	 *
	 * @param lastName the last name
	 * @param empObj the emp obj
	 * @throws SQLException the SQL exception
	 */
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
			myConnector.closeConnection(rs, pst, conn);
		}

	}

	/**
	 * Push number.
	 *
	 * @param number the number
	 * @param empObj the emp obj
	 * @throws SQLException the SQL exception
	 */
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
			myConnector.closeConnection(rs, pst, conn);
		}

	}

	/**
	 * Push address.
	 *
	 * @param address the address
	 * @param empObj the emp obj
	 * @throws SQLException the SQL exception
	 */
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
			myConnector.closeConnection(rs, pst, conn);
		}

	}

	/**
	 * Push age.
	 *
	 * @param age the age
	 * @param empObj the emp obj
	 * @throws SQLException the SQL exception
	 */
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
			myConnector.closeConnection(rs, pst, conn);
		}

	}

	/**
	 * Push sex.
	 *
	 * @param sex the sex
	 * @param empObj the emp obj
	 * @throws SQLException the SQL exception
	 */
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
			myConnector.closeConnection(rs, pst, conn);
		}

	}

	/**
	 * Push license number.
	 *
	 * @param newLicenseNumber the new license number
	 * @param empObj the emp obj
	 * @throws SQLException the SQL exception
	 */
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
			myConnector.closeConnection(rs, pst, conn);
		}

	}

	/**
	 * Push sales.
	 *
	 * @param newSales the new sales
	 * @param empObj the emp obj
	 * @throws SQLException the SQL exception
	 */
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
			myConnector.closeConnection(rs, pst, conn);
		}

	}

	/**
	 * Push hourly rate.
	 *
	 * @param newRate the new rate
	 * @param empObj the emp obj
	 * @throws SQLException the SQL exception
	 */
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
			myConnector.closeConnection(rs, pst, conn);
		}

	}

	/**
	 * Push user name.
	 *
	 * @param newUserName the new user name
	 * @param empObj the emp obj
	 * @throws SQLException the SQL exception
	 */
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
			myConnector.closeConnection(rs, pst, conn);
		}

	}

	/**
	 * Push password.
	 *
	 * @param newPassword the new password
	 * @param empObj the emp obj
	 * @throws SQLException the SQL exception
	 */
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
			myConnector.closeConnection(rs, pst, conn);
		}

	}

	/**
	 * Push admin.
	 *
	 * @param value the value
	 * @param empObj the emp obj
	 * @throws SQLException the SQL exception
	 */
	public void pushAdmin(Boolean value, Employee empObj) throws SQLException{
		// TODO Auto-generated method stub
		
	}

	public void registerCustomer(Employee empObj) {
		// TODO Auto-generated method stub
		
	}

}
