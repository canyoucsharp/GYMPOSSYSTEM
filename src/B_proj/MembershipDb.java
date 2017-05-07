package B_proj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import M_Database.MysqlConnect;

public class MembershipDb {
	private Connection conn;
	private MysqlConnect myConnector;
	private PreparedStatement pst;
	private ResultSet rs = null;

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

	public void updatePlanRate(double planRate, Membership memInfo) {
		// TODO Auto-generated method stub

		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE membership SET plan_description = ? " + " WHERE plan_type = ?";
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

}
