package B_proj;

public class Operations {
	private int operationID;
	private double locationCost;
	private double accountsPayable;
	private double maxOccupancy;
	private double monthlyCost;
	private double roi;
	private double electric;
	private double gas;
	private double water;
	
	Operations(){
	}
	
	public int getOperationID() {
		return operationID;
	}

	public void setOperationID(int operationID) {
		this.operationID = operationID;
	}

	public double getElectric() {
		return electric;
	}
	public void setElectric(double d) {
		this.electric = d;
	}
	public double getGas() {
		return gas;
	}
	public void setGas(double gas) {
		this.gas = gas;
	}
	public double getWater() {
		return water;
	}
	public void setWater(double water) {
		this.water = water;
	}
	public double getLocationCost() {
		return locationCost;
	}
	public void setLocationCost(double locationCost) {
		this.locationCost = locationCost;
	}
	public double getAccountsPayable() {
		return accountsPayable;
	}
	public void setAccountsPayable(double d) {
		this.accountsPayable = d;
	}
	public double getMaxOccupancy() {
		return maxOccupancy;
	}
	public void setMaxOccupancy(double d) {
		this.maxOccupancy = d;
	}
	public void calculateMonthlyCost(){
		monthlyCost=(locationCost+accountsPayable+electric+gas+water);
		roi+=1;
		monthlyCost*=roi;
		monthlyCost/=maxOccupancy;
	}

	public double getMonthlyCost() {
		this.calculateMonthlyCost();
		return monthlyCost;
	}

	public double getRoi() {
		return roi;
	}

	public void setRoi(double roi) {
		this.roi = roi;
	}

	public void setMaxOccupancy(int int1) {
		// TODO Auto-generated method stub
		
	}
	
}