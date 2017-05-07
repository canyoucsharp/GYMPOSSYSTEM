package B_proj;

import M_Database.MysqlConnect;
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
		finally
		{
			myConnector.closeConnection(rs, pst, conn);
		}

	}
	

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
	public static long getContractRemaining(Date enddate, TimeUnit timeUnit) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = new Date();
		dateFormat.format(date1);
		long diffInMillies = enddate.getTime() - date1.getTime();
	    return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
	}


	public void pushContractBegin(String begin) {
		// TODO Auto-generated method stub
		
	}


	public void pushContractEnd(String end) {
		// TODO Auto-generated method stub
		
	}


	public void pushSubStatus(String status) {
		// TODO Auto-generated method stub
		
	}


	public void pushPlanType(String type) {
		// TODO Auto-generated method stub
		
	}


	public void pushSubRemaining(long remaining) {
		// TODO Auto-generated method stub
		
	}

}
