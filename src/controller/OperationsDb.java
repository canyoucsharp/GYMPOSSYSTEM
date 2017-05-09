package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.MysqlConnect;

// TODO: Auto-generated Javadoc
/**
 * The Class OperationsDb.
 */
public class OperationsDb {
	
	/** The conn. */
	private Connection conn;
	
	/** The my connector. */
	private MysqlConnect myConnector;
	
	/** The pst. */
	private PreparedStatement pst;
	
	/** The rs. */
	private ResultSet rs;
	
	
	

	/**
	 * Push location cost.
	 *
	 * @param locationCost the location cost
	 * @param opObj the op obj
	 * @throws SQLException the SQL exception
	 */
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

	

	/**
	 * Push accounts payable.
	 *
	 * @param accountsPayable the accounts payable
	 * @param opObj the op obj
	 * @throws SQLException the SQL exception
	 */
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

	/**
	 * Push max occupancy.
	 *
	 * @param maxOccupancy the max occupancy
	 * @param opObj the op obj
	 * @throws SQLException the SQL exception
	 */
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

	/**
	 * Push roi.
	 *
	 * @param roi the roi
	 * @param opObj the op obj
	 * @throws SQLException the SQL exception
	 */
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

	/**
	 * Push electric.
	 *
	 * @param electric the electric
	 * @param opObj the op obj
	 * @throws SQLException the SQL exception
	 */
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

	

	

	/**
	 * Push water.
	 *
	 * @param water the water
	 * @param opObj the op obj
	 * @throws SQLException the SQL exception
	 */
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

	/**
	 * Push gas.
	 *
	 * @param gas the gas
	 * @param opObj the op obj
	 * @throws SQLException the SQL exception
	 */
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



	
		/**
		 * Inits the.
		 *
		 * @param operObj the oper obj
		 * @throws SQLException the SQL exception
		 */
		public void init(Operations operObj) throws SQLException {
			// TODO Auto-generated method stub
			myConnector = new MysqlConnect();
			conn = myConnector.ConnectDB();
			

			try {
				String query = "select * from operations where operationid = ?";
				pst = conn.prepareStatement(query);
				pst.setInt(1, operObj.getOperationID());
				rs = pst.executeQuery();
				
				if (rs.first()) 
				{
					
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
					JOptionPane.showMessageDialog(null,e.getMessage().toString());
				}
			
			finally
			{
				myConnector.closeConnection(rs, pst, conn);
				
			}
			
				
				
			}
		}

