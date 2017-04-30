package B_proj;

public class Operations {
	private int locationCost;
	private int accountsPayable;
	private int maxOccupancy;
	private double monthlyCost;
	private double roi;
	private int electric;
	private int gas;
	private int water;
	
	Operations(){
	}
	
	public int getElectric() {
		return electric;
	}
	public void setElectric(int electric) {
		this.electric = electric;
	}
	public int getGas() {
		return gas;
	}
	public void setGas(int gas) {
		this.gas = gas;
	}
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public int getLocationCost() {
		return locationCost;
	}
	public void setLocationCost(int locationCost) {
		this.locationCost = locationCost;
	}
	public int getAccountsPayable() {
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