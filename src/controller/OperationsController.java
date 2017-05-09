package controller;

import java.sql.SQLException;

import model.Operations;

// TODO: Auto-generated Javadoc
/**
 * The Class OperationsController.
 */
public class OperationsController {
	
	/** The op obj. */
	private Operations opObj;
	
	/** The op db obj. */
	private OperationsDb opDbObj;
	
	/**
	 * Instantiates a new operations controller.
	 *
	 * @throws NotFoundException the not found exception
	 */
	public OperationsController() throws NotFoundException{
		opObj=new Operations();
		opDbObj=new OperationsDb();
		this.init();
	}
	
	/**
	 * Inits the.
	 *
	 * @throws NotFoundException the not found exception
	 */
	public void init() throws NotFoundException {
		try {
			opDbObj.init(opObj);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Display location cost.
	 *
	 * @return the double
	 */
	//display 
	public double displayLocationCost(){
		return(opObj.getLocationCost());
	}
	
	/**
	 * Display accounts payable.
	 *
	 * @return the double
	 */
	public double displayAccountsPayable(){
		return(opObj.getAccountsPayable());
	}
	
	/**
	 * Display max occupancy.
	 *
	 * @return the double
	 */
	public int displayMaxOccupancy(){
		return(opObj.getMaxOccupancy());
	}
	
	/**
	 * Display monthly cost.
	 *
	 * @return the double
	 */
	public double displayMonthlyCost(){
		return(opObj.getMonthlyCost());
	}
	
	/**
	 * Display roi.
	 *
	 * @return the double
	 */
	public double displayRoi(){
		return(opObj.getRoi());
	}
	
	/**
	 * Display electric.
	 *
	 * @return the double
	 */
	public double displayElectric(){
		return(opObj.getElectric());
	}
	
	/**
	 * Display water.
	 *
	 * @return the double
	 */
	public double displayWater(){
		return(opObj.getWater());
	}
	
	/**
	 * Display gas.
	 *
	 * @return the double
	 */
	public double displayGas(){
		return(opObj.getGas());
	}
	//update functions
	
	/**
	 * Update location cost.
	 *
	 * @param locationCost the location cost
	 */
	public void updateLocationCost(double locationCost){
		try {
			opDbObj.pushLocationCost(locationCost,opObj);
			opObj.setLocationCost(locationCost);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Update accounts payable.
	 *
	 * @param accountsPayable the accounts payable
	 */
	public void updateAccountsPayable(double accountsPayable)
	{
		try {
			opDbObj.pushAccountsPayable(accountsPayable,opObj);
			opObj.setAccountsPayable(accountsPayable);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Update max occupancy.
	 *
	 * @param maxOccupancy the max occupancy
	 */
	public void updateMaxOccupancy(int maxOccupancy)
	{
		try {
			opDbObj.pushMaxOccupancy(maxOccupancy,opObj);
			opObj.setMaxOccupancy(maxOccupancy);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Update roi.
	 *
	 * @param roi the roi
	 */
	public void updateRoi(int roi){
		try {
			opDbObj.pushRoi(roi,opObj);
			opObj.setRoi(roi);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Update electric.
	 *
	 * @param electric the electric
	 */
	public void updateElectric(double electric)
	{
		try {
			opDbObj.pushElectric(electric,opObj);
			opObj.setElectric(electric);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Update water.
	 *
	 * @param water the water
	 */
	public void updateWater(double water){
		try {
			opDbObj.pushWater(water,opObj);
			opObj.setWater(water);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Update gash.
	 *
	 * @param gas the gas
	 */
	public void updateGash(double gas){
		try {
			opDbObj.pushGas(gas,opObj);
			opObj.setElectric(gas);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
