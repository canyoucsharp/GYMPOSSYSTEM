package B_proj;

import M_Database.MysqlConnect;

public class CustomerDb {

	public static void init(Customer cusObj) {
		// TODO Auto-generated method stub
		MysqlConnect.ConnectDB();

		MysqlConnect.conn = MysqlConnect.ConnectDB();
		try {
			String query = "select * from clients where client_id = ?";
			MysqlConnect.pst = MysqlConnect.conn.prepareStatement(query);
			MysqlConnect.pst.setInt(1, cusObj.getId());
			MysqlConnect.pst.executeQuery();
			MysqlConnect.rs = MysqlConnect.pst.executeQuery();

			if (MysqlConnect.rs.next()) {

				cusObj.setFirstName(MysqlConnect.rs.getString("first_name"));
				cusObj.setLastName(MysqlConnect.rs.getString("last_name"));
				cusObj.setPhoneNumber(MysqlConnect.rs.getString("phone_number"));
				cusObj.setAddress(MysqlConnect.rs.getString("address"));
				cusObj.setAge(MysqlConnect.rs.getInt("age"));
				cusObj.setSex(MysqlConnect.rs.getString("sex"));
				cusObj.setLicenseNum(MysqlConnect.rs.getString("license_num"));
				cusObj.setSubId(MysqlConnect.rs.getInt("license_num"));
				cusObj.setRepId(MysqlConnect.rs.getInt("license_num"));

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void pushFirstName(String firstName, Customer cusObj) {
		// TODO Auto-generated method stub
		String updateTableSQL = "UPDATE clients SET first_name = ? " + " WHERE client_id = ?";
		try {
		MysqlConnect.pst = MysqlConnect.conn.prepareStatement(updateTableSQL);
		MysqlConnect.pst.setString(1, firstName);
		MysqlConnect.pst.setInt(2, cusObj.getId());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void pushLastName(String lastName, Customer cusObj) {
		// TODO Auto-generated method stub
		String updateTableSQL = "UPDATE clients SET last_name = ? " + " WHERE client_id = ?";
		try {
			MysqlConnect.pst = MysqlConnect.conn.prepareStatement(updateTableSQL);
			MysqlConnect.pst.setString(1, lastName);
			MysqlConnect.pst.setInt(2, cusObj.getId());
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

	}

	public static void pushNumber(String number, Customer cusObj) {
		// TODO Auto-generated method stub
		String updateTableSQL = "UPDATE clients SET phone_number = ? " + " WHERE client_id = ?";
		try {
			MysqlConnect.pst = MysqlConnect.conn.prepareStatement(updateTableSQL);
			MysqlConnect.pst.setString(1, number);
			MysqlConnect.pst.setInt(2, cusObj.getId());
			}
			catch(Exception e)
			{
				System.out.println(e);
			}


	}

	public static void pushAddress(String address, Customer cusObj) {
		// TODO Auto-generated method stub
		String updateTableSQL = "UPDATE clients SET address = ? " + " WHERE client_id = ?";
		try {
			MysqlConnect.pst = MysqlConnect.conn.prepareStatement(updateTableSQL);
			MysqlConnect.pst.setString(1,address);
			MysqlConnect.pst.setInt(2, cusObj.getId());
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

	}

	public static void pushAge(String age, Customer cusObj) {
		// TODO Auto-generated method stub
		String updateTableSQL = "UPDATE clients SET age = ? " + " WHERE client_id = ?";
		try {
			MysqlConnect.pst = MysqlConnect.conn.prepareStatement(updateTableSQL);
			MysqlConnect.pst.setString(1,age);
			MysqlConnect.pst.setInt(2, cusObj.getId());
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

	}

	public static void pushSex(String sex, Customer cusObj) {
		// TODO Auto-generated method stub
		String updateTableSQL = "UPDATE clients SET sex = ? " + " WHERE client_id = ?";
		try {
			MysqlConnect.pst = MysqlConnect.conn.prepareStatement(updateTableSQL);
			MysqlConnect.pst.setString(1,sex);
			MysqlConnect.pst.setInt(2, cusObj.getId());
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

	}

	public static void pushLicenseNumber(String newLicenseNumber, Customer cusObj) {
		// TODO Auto-generated method stub
		String updateTableSQL = "UPDATE clients SET license_num = ? " + " WHERE client_id = ?";
		try {
			MysqlConnect.pst = MysqlConnect.conn.prepareStatement(updateTableSQL);
			MysqlConnect.pst.setString(1,newLicenseNumber);
			MysqlConnect.pst.setInt(2, cusObj.getId());
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

	}

	public static void pushSubId(int newSubId, Customer cusObj) {
		// TODO Auto-generated method stub
		String updateTableSQL = "UPDATE clients SET sub_id = ? " + " WHERE client_id = ?";
		try {
			MysqlConnect.pst = MysqlConnect.conn.prepareStatement(updateTableSQL);
			MysqlConnect.pst.setInt(1,newSubId);
			MysqlConnect.pst.setInt(2, cusObj.getId());
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

	}

	public static void pushRepId(int newRepId, Customer cusObj) {
		// TODO Auto-generated method stub
		String updateTableSQL = "UPDATE clients SET rep_id = ? " + " WHERE client_id = ?";
		try {
			MysqlConnect.pst = MysqlConnect.conn.prepareStatement(updateTableSQL);
			MysqlConnect.pst.setInt(1,newRepId);
			MysqlConnect.pst.setInt(2, cusObj.getId());
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

	}

}
