package B_proj;

import M_Database.MysqlConnect;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class SubscriptionDb {

	private PreparedStatement pst;
	private Connection conn;
	private MysqlConnect myConnector;
	private ResultSet rs = null;

	public void addSubscription(Connection conn, Subscription newSub) throws SQLException {
		try {

			String insertTableSQL = "INSERT INTO subscription"
					+ "(sub_id,sub_status,contract_begin,contract_end,plan_type) " + "VALUES" + "(?,?,?,?,?)";

			pst = conn.prepareStatement(insertTableSQL);
			pst.setInt(1, newSub.getSubid());
			pst.setString(2, newSub.getSubStatus());
			pst.setString(3, newSub.getContractBegin());
			pst.setString(4, newSub.getContractEnd());
			pst.setString(5, newSub.getPlanType());
			pst.executeUpdate();
			ResultSet rs = pst.getGeneratedKeys();
			if (rs.next()) {
				newSub.setSubid(rs.getInt(1));

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void newSub(int clientid,Subscription newSub) throws SQLException
	{
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE clients SET,subStatus=?, contractBegin=?,contractEnd=?, planType = ? where client_id = ?";
		try {


			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, newSub.getSubStatus());
			pst.setString(2, newSub.getContractBegin());
			pst.setString(3, newSub.getContractEnd());
			pst.setString(4, newSub.getPlanType());
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		finally {
			pst.close();
			conn.close();
			System.out.println("Connection closed");
		}
		}

	public static long getDateDiff(String sdate2, TimeUnit timeUnit) throws ParseException {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date1 = new Date();
		dateFormat.format(date1);
		Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(sdate2);
		long diffInMillies = date2.getTime() - date1.getTime();
		return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS);

	}

	public void init(int id, Subscription newSub) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn;
		MysqlConnect myConnector;
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();

		try {
			String query = "select * from subscription,clients"
					+ " where clients.sub_id = subscription.sub_id and client_id = ?";
			pst = conn.prepareStatement(query);
			pst.setInt(1, id);
			pst.executeQuery();
			rs = pst.executeQuery();

			if (rs.next()) {

				newSub.setSubStatus(rs.getString("sub_status"));
				newSub.setContractBegin(rs.getString("contract_begin"));
				newSub.setContractEnd(rs.getString("contract_end"));
				Integer contractRemaining = (int) getDateDiff(newSub.getContractEnd(), TimeUnit.DAYS);
				newSub.setContractRemaining(contractRemaining.toString());
				newSub.setPlanType(rs.getString("plan_type"));

			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			pst.close();
			conn.close();
			System.out.println("Connection closed");
		}
	}
}
