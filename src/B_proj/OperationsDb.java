package B_proj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import M_Database.MysqlConnect;

public class OperationsDb {
	private Connection conn;
	private MysqlConnect myConnector;
	private PreparedStatement pst;
	private ResultSet rs = null;

	public void pushLocationCost(double locationCost, Operations opObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();

		String updateTableSQL = "UPDATE operations SET locationcost = ? " + " WHERE operationid = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setDouble(1, locationCost);
			pst.setInt(2, opObj.getOperationID());
			pst.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		} finally {

			myConnector.closeConnection(rs, pst, conn);
		}

	}

	

	public void pushAccountsPayable(double accountsPayable, Operations opObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();

		String updateTableSQL = "UPDATE operations SET accountsPayable = ? " + " WHERE operationid = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setDouble(1, accountsPayable);
			pst.setInt(2, opObj.getOperationID());
			pst.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		} finally {

			myConnector.closeConnection(rs, pst, conn);
		}

	}

	public void pushMaxOccupancy(int maxOccupancy, Operations opObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();

		String updateTableSQL = "UPDATE operations SET maxOccupancy = ? " + " WHERE operationid = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setInt(1, maxOccupancy);
			pst.setInt(2, opObj.getOperationID());
			pst.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		} finally {

			myConnector.closeConnection(rs, pst, conn);
		}

	}

	public void pushRoi(double roi, Operations opObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();

		String updateTableSQL = "UPDATE operations SET roi = ? " + " WHERE operationid = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setDouble(1, roi);
			pst.setInt(2, opObj.getOperationID());
			pst.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		} finally {

			myConnector.closeConnection(rs, pst, conn);
		}

	}

	public void pushElectric(double electric, Operations opObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();

		String updateTableSQL = "UPDATE operations SET electric = ? " + " WHERE operationid = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setDouble(1, electric);
			pst.setInt(2, opObj.getOperationID());
			pst.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		} finally {

			myConnector.closeConnection(rs, pst, conn);
		}

	}

	

	

	public void pushWater(double water, Operations opObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();

		String updateTableSQL = "UPDATE operations SET water = ? " + " WHERE operationid = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setDouble(1, water);
			pst.setInt(2, opObj.getOperationID());
			pst.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		} finally {

			myConnector.closeConnection(rs, pst, conn);
		}

	}

	public void pushGas(double gas, Operations opObj) throws SQLException {
		// TODO Auto-generated method stub
		myConnector = new MysqlConnect();
		conn = myConnector.ConnectDB();

		String updateTableSQL = "UPDATE operations SET gas = ? " + " WHERE operationid = ?";
		try {
			pst = conn.prepareStatement(updateTableSQL);
			pst.setDouble(1, gas);
			pst.setInt(2, opObj.getOperationID());
			pst.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		} finally {

			myConnector.closeConnection(rs, pst, conn);
		}

	}



	
		public void init(Operations operObj) throws SQLException,NotFoundException {
			// TODO Auto-generated method stub
			myConnector = new MysqlConnect();
			conn = myConnector.ConnectDB();

			try {
				String query = "select * from operations where operationid = ?";
				pst = conn.prepareStatement(query);
				pst.setInt(1, operObj.getOperationID());
				pst.executeQuery();
				rs = pst.executeQuery();

				if (rs.next()) {

					operObj.setAccountsPayable(rs.getDouble("accountsPayable"));
					operObj.setElectric(rs.getDouble("electric"));
					operObj.setGas(rs.getDouble("gas"));
					operObj.setWater(rs.getDouble("water"));
					operObj.setLocationCost(rs.getDouble("locationcost"));
					operObj.setMaxOccupancy(rs.getInt("maxOccupancy"));
					operObj.setOperationID(rs.getInt("operationid"));
					operObj.setRoi(rs.getInt("roi"));
				}
				else
				{
					
					JOptionPane.showMessageDialog(null,"No Operations Found" );


				}
			}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,e.getMessage());
				}
			
			finally
			{
				myConnector.closeConnection(rs, pst, conn);
				
			}
			
				
				
			}
		}

