package model;

// TODO: Auto-generated Javadoc
/**
 * The Class Operations.
 */
public class Operations {
	
	/** The operation ID. */
	private int operationID;
	
	/** The location cost. */
	private double locationCost;
	
	/** The accounts payable. */
	private double accountsPayable;
	
	/** The max occupancy. */
	private int maxOccupancy;
	
	/** The monthly cost. */
	private double monthlyCost;
	
	/** The roi. */
	private double roi;
	
	/** The electric. */
	private double electric;
	
	/** The gas. */
	private double gas;
	
	/** The water. */
	private double water;
	
	/**
	 * Instantiates a new operations.
	 */
	public Operations(){
		operationID=1;
	}
	
	/**
	 * Gets the operation ID.
	 *
	 * @return the operation ID
	 */
	public int getOperationID() {
		return operationID;
	}

	/**
	 * Sets the operation ID.
	 *
	 * @param operationID the new operation ID
	 */
	public void setOperationID(int operationID) {
		this.operationID = operationID;
	}

	/**
	 * Gets the electric.
	 *
	 * @return the electric
	 */
	public double getElectric() {
		return electric;
	}
	
	/**
	 * Sets the electric.
	 *
	 * @param d the new electric
	 */
	public void setElectric(double d) {
		this.electric = d;
	}
	
	/**
	 * Gets the gas.
	 *
	 * @return the gas
	 */
	public double getGas() {
		return gas;
	}
	
	/**
	 * Sets the gas.
	 *
	 * @param gas the new gas
	 */
	public void setGas(double gas) {
		this.gas = gas;
	}
	
	/**
	 * Gets the water.
	 *
	 * @return the water
	 */
	public double getWater() {
		return water;
	}
	
	/**
	 * Sets the water.
	 *
	 * @param water the new water
	 */
	public void setWater(double water) {
		this.water = water;
	}
	
	/**
	 * Gets the location cost.
	 *
	 * @return the location cost
	 */
	public double getLocationCost() {
		return locationCost;
	}
	
	/**
	 * Sets the location cost.
	 *
	 * @param locationCost the new location cost
	 */
	public void setLocationCost(double locationCost) {
		this.locationCost = locationCost;
	}
	
	/**
	 * Gets the accounts payable.
	 *
	 * @return the accounts payable
	 */
	public double getAccountsPayable() {
		return accountsPayable;
	}
	
	/**
	 * Sets the accounts payable.
	 *
	 * @param d the new accounts payable
	 */
	public void setAccountsPayable(double d) {
		this.accountsPayable = d;
	}
	
	/**
	 * Gets the max occupancy.
	 *
	 * @return the max occupancy
	 */
	public int getMaxOccupancy() {
		return maxOccupancy;
	}
	
	/**
	 * Sets the max occupancy.
	 *
	 * @param d the new max occupancy
	 */
	public void setMaxOccupancy(int d) {
		this.maxOccupancy = d;
	}
	
	/**
	 * Calculate monthly cost.
	 */
	public void calculateMonthlyCost(){
		monthlyCost=locationCost+accountsPayable+electric+gas+water;
		if(roi<1){
			roi+=1;
		}
		monthlyCost*=roi;
		monthlyCost/=maxOccupancy;
	}

	/**
	 * Gets the monthly cost.
	 *
	 * @return the monthly cost
	 */
	public double getMonthlyCost() {
		this.calculateMonthlyCost();
		return monthlyCost;
	}

	/**
	 * Gets the roi.
	 *
	 * @return the roi
	 */
	public double getRoi() {
		return roi;
	}

	/**
	 * Sets the roi.
	 *
	 * @param roi the new roi
	 */
	public void setRoi(double roi) {
		this.roi = roi;
	}

}