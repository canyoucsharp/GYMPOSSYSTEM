package B_proj;

import M_Database.MysqlConnect;
import java.sql.*;

import javax.swing.JOptionPane;



public class SubscriptionDb {
	private Connection conn;
	private MysqlConnect myConnector;
	private PreparedStatement pst;
	private ResultSet rs = null;
	
	public void addSubscription(Subscription newSub) throws SQLException
	{
		try {
			myConnector = new MysqlConnect();
			conn = myConnector.ConnectDB();
			String insertTableSQL = "INSERT INTO subscription"
					+ "(sub_id,sub_status,contract_begin,contract_end,contract_remaining,plan_type) "
					+ "VALUES" + "(?,?,?,?,?,?)";

			pst = conn.prepareStatement(insertTableSQL);
			pst.setInt   (1, newSub.getSubid());
			pst.setString(2, newSub.getSubStatus());
			pst.setString(3, newSub.getContractBegin());
			pst.setString(4, newSub.getContractEnd());
			pst.setString(5, newSub.getContractRemaining());
			pst.setString(6, newSub.getPlanType());
			pst.executeUpdate();
			ResultSet rs = pst.getGeneratedKeys();
			if(rs.next())
			{
			newSub.setSubid(rs.getInt(1));
				    	
			}
			JOptionPane.showMessageDialog(null,"Sucessfull Subscription");
			
				   
				
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
			finally {
			pst.close();
			conn.close();
			System.out.println("Connection closed");
		}
	}
	
	
	public void init(Subscription newSub) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();

		try {
			String query = "select * from clients where client_id = ?";
			pst = conn.prepareStatement(query);
			pst.setInt(1, newSub.getSubid());
			pst.executeQuery();
			rs = pst.executeQuery();

			if (rs.next()) {

				newSub.setSubStatus(rs.getString("sub_status"));
				newSub.setContractBegin(rs.getString("contract_begin"));
				newSub.setContractEnd(rs.getString("contract_end"));
				newSub.setContractRemaining(rs.getString("contract_remaining"));
				newSub.setPlanType(rs.getString("plan_type"));
				

			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			pst.close();
			conn.close();
			System.out.println("Connection closed");
		}
	}
}

