package controller;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import model.Subscription;

// TODO: Auto-generated Javadoc
/**
 * The Class SubscriptionDb.
 */
public class SubscriptionDb {

	/** The pst. */
	private PreparedStatement pst;
	
	/** The conn. */
	private Connection conn;
	
	/** The my connector. */
	private MysqlConnect myConnector;
	
	/** The rs. */
	private ResultSet rs = null;

	/**
	 * Adds the subscription.
	 *
	 * @param conn the conn
	 * @param newSub the new sub
	 * @throws SQLException the SQL exception
	 */
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
	
	/**
	 * Eat shit.
	 */
	public void eatShit()
	{
		
	}
	

	/**
	 * New sub.
	 *
	 * @param clientid the clientid
	 * @param newSub the new sub
	 * @throws SQLException the SQL exception
	 */
	public void newSub(int clientid,Subscription newSub) throws SQLException
	{
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();
		String updateTableSQL = "UPDATE subscription SET sub_status=?, contract_begin=?,contract_end=?, plan_type = ? where sub_id = ?";
		try {
			
			pst = conn.prepareStatement(updateTableSQL);
			pst.setString(1, newSub.getSubStatus());
			pst.setString(2, newSub.getContractBegin());
			pst.setString(3, newSub.getContractEnd());
			pst.setString(4, newSub.getPlanType());
			pst.setInt(5, newSub.subid);
			pst.executeUpdate();
			JOptionPane.showMessageDialog(null,"Subscription Success");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			
		} 
		finally {
			myConnector.closeConnection(rs, pst, conn);
			
		}
		}
	


	/**
	 * Inits the.
	 *
	 * @param id the id
	 * @param newSub the new sub
	 * @throws SQLException the SQL exception
	 */
	public void init(int id, Subscription newSub) throws SQLException {//search
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
				Date endDate=new SimpleDateFormat("yyyy-MM-dd").parse(newSub.getContractEnd()); 
				newSub.setPlanType(rs.getString("plan_type"));
				long contractRemaining=getContractRemaining(endDate,TimeUnit.DAYS);
				newSub.setContractRemaining(contractRemaining);

			}
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			myConnector.closeConnection(rs, pst, conn);
		}
	}
	
	/**
	 * Gets the contract remaining.
	 *
	 * @param enddate the enddate
	 * @param timeUnit the time unit
	 * @return the contract remaining
	 */
	public static long getContractRemaining(Date enddate, TimeUnit timeUnit) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = new Date();
		dateFormat.format(date1);
		long diffInMillies = enddate.getTime() - date1.getTime();
	    return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
	}


	/**
	 * Push contract begin.
	 *
	 * @param begin the begin
	 */
	public void pushContractBegin(String begin) {
		// TODO Auto-generated method stub
		
	}


	/**
	 * Push contract end.
	 *
	 * @param end the end
	 */
	public void pushContractEnd(String end) {
		// TODO Auto-generated method stub
		
	}


	/**
	 * Push sub status.
	 *
	 * @param status the status
	 */
	public void pushSubStatus(String status) {
		// TODO Auto-generated method stub
		
	}
	

	/**
	 * Push plan type.
	 *
	 * @param type the type
	 */
	public void pushPlanType(String type) {
		// TODO Auto-generated method stub
		
	}


	/**
	 * Push sub remaining.
	 *
	 * @param remaining the remaining
	 */
	public void pushSubRemaining(long remaining) {
		// TODO Auto-generated method stub
		
	}

}
