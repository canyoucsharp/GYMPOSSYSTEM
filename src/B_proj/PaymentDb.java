package B_proj;
import M_Database.MysqlConnect;
import java.sql.*;

import javax.swing.JOptionPane;
public class PaymentDb {

	private PreparedStatement pst;
	private Connection conn;
	private MysqlConnect myConnector;
	private ResultSet rs = null;
	
	public void init(Customer cusObj, PaymentInfo newPayInfo) {
		// TODO Auto-generated method stub
			myConnector = new MysqlConnect();
			conn = myConnector.ConnectDB();

			try {
				String query = "select * from payinfo where client_id = ?";
				pst = conn.prepareStatement(query);
				pst.setInt(1,cusObj.getId());
				pst.executeQuery();
				rs = pst.executeQuery();

				if (rs.next()) {

					newPayInfo.setCreditCardNum(rs.getString("creditcardnum"));
					newPayInfo.setExpiration(rs.getString("expiration"));
					newPayInfo.setExpiration(rs.getString("security"));
					newPayInfo.setProvider(rs.getInt("provider"));
					JOptionPane.showMessageDialog(null, "PaymentInfo for " +cusObj.getFirstName() + " Found");

				} else {
					cusObj = null;
					JOptionPane.showMessageDialog(null, "PaymentInfo");

				}

			
		}
		
	}


	public void pushCreditCardNumber(String cardNum, Customer cusObj) {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();

		String updateTableSQL = "UPDATE payinfo SET creditcardnum = ? " + " WHERE client_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, cardNum);
			pst.setInt(2, cusObj.getId());
			pst.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		} finally {

			myConnector.closeConnection(rs, pst, conn);
		}
		
	}


	public void pushProvider(int pid,Customer cusObj) {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();

		String updateTableSQL = "UPDATE payinfo SET provider = ? " + " WHERE client_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setInt(1, pid);
			pst.setInt(2, cusObj.getId());
			pst.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		} finally {

			myConnector.closeConnection(rs, pst, conn);
		}
		
	}

		
	


	public void pushSecurity(String security,Customer cusObj) {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();

		String updateTableSQL = "UPDATE payinfo SET security = ? " + " WHERE client_id = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, security);
			pst.setInt(2, cusObj.getId());
			pst.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		} finally {

			myConnector.closeConnection(rs, pst, conn);
		}
		
	}

		
	


	public void pushExpiration(String expiration, Customer cusObj) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			myConnector = new MysqlConnect();
			conn = myConnector.ConnectDB();

			String updateTableSQL = "UPDATE payinfo SET expiration = ? " + " WHERE client_id = ?";
			try {
				pst = conn.prepareStatement(updateTableSQL);
				pst.setString(1, expiration);
				pst.setInt(2, cusObj.getId());
				pst.executeUpdate();

			} catch (Exception e) {
				System.out.println(e);
			} finally {

				myConnector.closeConnection(rs, pst, conn);
			}
			
		}
		
	

	public void newPay(Customer cusObj, PaymentInfo newPayInfo) {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
try{
		String insertTableSQL = "INSERT INTO payinfo"
				+ "(client_id,creditcardnum,provider,security,expiration) " + "VALUES" + "(?,?,?,?,?)";
		
		pst = conn.prepareStatement(insertTableSQL);
		pst.setInt(1, cusObj.getId());
		pst.setString(2, newPayInfo.getCreditCardNum());
		pst.setString(3, newPayInfo.getProvider());
		pst.setString(4, newPayInfo.getSecurity());
		pst.setString(5, newPayInfo.getExpiration());
		pst.executeUpdate();
		JOptionPane.showMessageDialog(null, "Payment Registered");

	}
 
	catch (Exception e) {
		System.out.println(e.getMessage().toString());
		JOptionPane.showMessageDialog(null, "Payment addition Failure");
		
	}
	finally
	{
		myConnector.closeConnection(rs, pst, conn);
	}
		
	}

}
