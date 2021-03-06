package controller;

import java.sql.*;

import javax.swing.JOptionPane;

import model.Customer;
import model.MysqlConnect;

// TODO: Auto-generated Javadoc
/**
 * The Class CustomerDb.
 */
public class CustomerDb {
	//t
	/** The conn. */
	private Connection conn;
	
	/** The my connector. */
	private MysqlConnect myConnector;
	
	/** The pst. */
	private PreparedStatement pst;
	
	/** The rs. */
	private ResultSet rs = null;

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws SQLException the SQL exception
	 */
	public static void main(String args[]) throws SQLException {
		CustomerDb mycusdb = new CustomerDb();
		Customer mycus = new Customer();
		Subscription newSub = new Subscription();
		//newDb.addSubscription(newSub);

		// mycusdb.init(mycus);
		// mycusdb.pushFirstName("michael", mycus);
		// mycusdb.init(mycus);
		// System.out.println(mycus.getFirstName());
		mycus.setId(22);
		try {
			mycusdb.init(mycus);
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mycus.setFirstName("joshua");
		System.out.println(mycus.getLastName());
		mycus.setId(11);
		mycusdb.registerCustomer(mycus, newSub);
	}
	//during registration every customer must be paired with a subscription
	//even if if the customer isnt ready to subscribe you are allowed to
	/**
	 * Register customer.
	 *
	 * @param cusObj the cus obj
	 * @param newSub the new sub
	 * @throws SQLException the SQL exception
	 */
	//leave the fields blank
	public void registerCustomer(Customer cusObj, Subscription newSub) throws SQLException {
		SubscriptionDb newDb=new SubscriptionDb();
		
		try {
			
			myConnector = new MysqlConnect();
			conn = myConnector.ConnectDB();
			conn.setAutoCommit(false);
			
			newDb.addSubscription(conn,newSub);
			
			String insertTableSQL = "INSERT INTO clients"
					+ "(client_id, first_name, last_name, phone_number,address,dob,sex,license_num,sub_id,rep_id,age,picture) "
					+ "VALUES" + "(?,?,?,?,?,?,?,?,?,?,?,?)";
			
			
			pst = conn.prepareStatement(insertTableSQL);
        	pst.setInt   (1, cusObj.getId());
			pst.setString(2, cusObj.getFirstName());
			pst.setString(3, cusObj.getLastName());
			pst.setString(4, cusObj.getPhoneNumber());
			pst.setString(5, cusObj.getAddress());
			pst.setString(6, cusObj.getDob());
			pst.setString(7, cusObj.getSex());
			pst.setString(8, cusObj.getLicenseNum());
			pst.setInt   (9, newSub.getSubid());
			pst.setInt   (10, cusObj.getRepId());
			pst.setInt   (11,cusObj.getAge());
			pst.setString(12, cusObj.getPictureLink());
			
			pst.executeUpdate();
			conn.commit();
			
			JOptionPane.showMessageDialog(null,"Registration Success");
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			conn.rollback();
			
		} finally {
			myConnector.closeConnection(rs, pst, conn);
		}
		

	}

	/**
	 * Inits the.
	 *
	 * @param cusObj the cus obj
	 * @throws SQLException the SQL exception
	 * @throws NotFoundException the not found exception
	 */
	public void init(Customer cusObj) throws SQLException,NotFoundException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();

		try {
			String query = "select * from clients where client_id = ?";
			pst = conn.prepareStatement(query);
			pst.setInt(1, cusObj.getId());
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
				cusObj.setDob(rs.getString("dob"));
				cusObj.setPictureLink(rs.getString("picture"));
				JOptionPane.showMessageDialog(null,"User "+cusObj.getFirstName()+" Found" );

			}
			else
			{
				cusObj=null;
				JOptionPane.showMessageDialog(null,"No user Found" );


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
	 * @param cusObj the cus obj
	 * @throws SQLException the SQL exception
	 */
	public void pushFirstName(String firstName, Customer cusObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();

		String updateTableSQL = "UPDATE clients SET first_name = ? " + " WHERE client_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, firstName);
			pst.setInt(2, cusObj.getId());
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
	 * @param cusObj the cus obj
	 * @throws SQLException the SQL exception
	 */
	public void pushLastName(String lastName, Customer cusObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE clients SET last_name = ? " + " WHERE client_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, lastName);
			pst.setInt(2, cusObj.getId());
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
	 * @param cusObj the cus obj
	 * @throws SQLException the SQL exception
	 */
	public void pushNumber(String number, Customer cusObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE clients SET phone_number = ? " + " WHERE client_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, number);
			pst.setInt(2, cusObj.getId());
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
	 * @param cusObj the cus obj
	 * @throws SQLException the SQL exception
	 */
	public void pushAddress(String address, Customer cusObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE clients SET address = ? " + " WHERE client_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, address);
			pst.setInt(2, cusObj.getId());
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
	 * @param cusObj the cus obj
	 * @throws SQLException the SQL exception
	 */
	public void pushAge(String age, Customer cusObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE clients SET age = ? " + " WHERE client_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, age);
			pst.setInt(2, cusObj.getId());
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
	 * @param cusObj the cus obj
	 * @throws SQLException the SQL exception
	 */
	public void pushSex(String sex, Customer cusObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE clients SET sex = ? " + " WHERE client_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, sex);
			pst.setInt(2, cusObj.getId());
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
	 * @param cusObj the cus obj
	 * @throws SQLException the SQL exception
	 */
	public void pushLicenseNumber(String newLicenseNumber, Customer cusObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE clients SET license_num = ? " + " WHERE client_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, newLicenseNumber);
			pst.setInt(2, cusObj.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			myConnector.closeConnection(rs, pst, conn);
		}

	}

	/**
	 * Push sub id.
	 *
	 * @param newSubId the new sub id
	 * @param cusObj the cus obj
	 * @throws SQLException the SQL exception
	 */
	public void pushSubId(int newSubId, Customer cusObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE clients SET sub_id = ? " + " WHERE client_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setInt(1, newSubId);
			pst.setInt(2, cusObj.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			myConnector.closeConnection(rs, pst, conn);
		}

	}

	/**
	 * Push rep id.
	 *
	 * @param newRepId the new rep id
	 * @param cusObj the cus obj
	 * @throws SQLException the SQL exception
	 */
	public void pushRepId(int newRepId, Customer cusObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE clients SET rep_id = ? " + " WHERE client_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setInt(1, newRepId);
			pst.setInt(2, cusObj.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			myConnector.closeConnection(rs, pst, conn);
		}

	}
	
	/**
	 * Push date of birth.
	 *
	 * @param dob the dob
	 * @param cusObj the cus obj
	 * @throws SQLException the SQL exception
	 */
	public void pushDateOfBirth(String dob, Customer cusObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE clients SET dob = ? " + " WHERE client_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1,dob);
			pst.setInt(2, cusObj.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			myConnector.closeConnection(rs, pst, conn);
		}
	}
	
	/**
	 * Push picture link.
	 *
	 * @param pictureLink the picture link
	 * @param cusObj the cus obj
	 * @throws SQLException the SQL exception
	 */
	public void pushPictureLink(String pictureLink, Customer cusObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE clients SET picture = ? " + " WHERE client_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1,pictureLink);
			pst.setInt(2, cusObj.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			myConnector.closeConnection(rs, pst, conn);
		}
		
	}

}
