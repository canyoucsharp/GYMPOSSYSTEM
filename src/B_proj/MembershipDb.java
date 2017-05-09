package B_proj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import M_Database.MysqlConnect;

// TODO: Auto-generated Javadoc
/**
 * The Class MembershipDb.
 */
public class MembershipDb {
	
	/** The conn. */
	private Connection conn;
	
	/** The my connector. */
	private MysqlConnect myConnector;
	
	/** The pst. */
	private PreparedStatement pst;
	
	/** The rs. */
	private ResultSet rs = null;

	/**
	 * Inits the.
	 *
	 * @param memInfo the mem info
	 * @param cusObj the cus obj
	 */
	public void init(Membership memInfo, Customer cusObj) {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();

		try {
			String query = "select * from membership where plan_type = ?";
			pst = conn.prepareStatement(query);
			pst.setString(1, memInfo.getPlanType());
			pst.executeQuery();
			rs = pst.executeQuery();

			if (rs.next()) {

				memInfo.setPlanDescription(rs.getString("plan_type"));
				memInfo.setPlanRate(rs.getDouble("plan_rate"));
				JOptionPane.showMessageDialog(null, "MemberShip " + memInfo.getPlanType() + " Found");

			} else {
				cusObj = null;
				JOptionPane.showMessageDialog(null, "No user Found");

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
	 * Update plan type.
	 *
	 * @param planType the plan type
	 * @param memInfo the mem info
	 */
	public void updatePlanType(String planType, Membership memInfo) {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE membership SET plan_type = ? " + " WHERE plan_type = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, planType);
			pst.setString(2, memInfo.getPlanType());
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			myConnector.closeConnection(rs, pst, conn);
		}

	}

	/**
	 * Update plan description.
	 *
	 * @param planDescription the plan description
	 * @param memInfo the mem info
	 */
	public void updatePlanDescription(String planDescription,Membership memInfo ) {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE membership SET plan_description = ? " + " WHERE plan_type = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, planDescription);
			pst.setString(2, memInfo.getPlanType());
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			myConnector.closeConnection(rs, pst, conn);
		}

	}

	/**
	 * Update plan rate.
	 *
	 * @param planRate the plan rate
	 * @param memInfo the mem info
	 */
	public void updatePlanRate(double planRate, Membership memInfo) {
		// TODO Auto-generated method stub

		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE membership SET plan_rate = ? " + " WHERE plan_type = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setDouble(1,planRate);
			pst.setString(2, memInfo.getPlanType());
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			myConnector.closeConnection(rs, pst, conn);
		}
	}

	/**
	 * New mem.
	 *
	 * @param memInfo the mem info
	 * @param cusObj the cus obj
	 */
	public void newMem(Membership memInfo, Customer cusObj) {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
try{
		String insertTableSQL = "INSERT INTO membership  "
				+ "(plan_type,plan_description,plan_rate) " + "VALUES" + "(?,?,?)";
		
		pst = conn.prepareStatement(insertTableSQL);
		pst.setString(1, memInfo.getPlanType());
		pst.setString(2, memInfo.getPlanDescription());
		pst.setDouble(3, memInfo.getPlanRate());
		
		pst.executeUpdate();
		JOptionPane.showMessageDialog(null, "Membership Registered");

	}
 
	catch (Exception e) {
		System.out.println(e.getMessage().toString());
		JOptionPane.showMessageDialog(null, "Membership addition Failure");
		
	}
	finally
	{
		myConnector.closeConnection(rs, pst, conn);
	}
		
		
	}

	public void setCurRate(double rate) {
		// TODO Auto-generated method stub
		
	}


}
