package B_proj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

			pst.close();
			conn.close();
			System.out.println("Connection closed");
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

			pst.close();
			conn.close();
			System.out.println("Connection closed");
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

			pst.close();
			conn.close();
			System.out.println("Connection closed");
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

			pst.close();
			conn.close();
			System.out.println("Connection closed");
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

			pst.close();
			conn.close();
			System.out.println("Connection closed");
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

			pst.close();
			conn.close();
			System.out.println("Connection closed");
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

			pst.close();
			conn.close();
			System.out.println("Connection closed");
		}

	}



	public void init(Operations opObj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
