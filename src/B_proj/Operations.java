package B_proj;

public class Operations {
	private double locationCost;
	private double accountsPayable;
	private int maxOccupancy;
	private double monthlyCost;
	private double roi;
	private double electric;
	private double gas;
	private double water;
	
	Operations(){
	}
	
	public double getElectric() {
		return electric;
	}
	public void setElectric(int electric) {
		this.electric = electric;
	}
	public double getGas() {
		return gas;
	}
	public void setGas(int gas) {
		this.gas = gas;
	}
	public double getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public double getLocationCost() {
		return locationCost;
	}
	public void setLocationCost(int locationCost) {
		this.locationCost = locationCost;
	}
	public double getAccountsPayable() {
		return accountsPayable;
	}
	public void setAccountsPayable(int accountsPayable) {
		this.accountsPayable = accountsPayable;
	}
	public int getMaxOccupancy() {
		return maxOccupancy;
	}
	public void setMaxOccupancy(int maxOccupancy) {
		this.maxOccupancy = maxOccupancy;
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
	
}