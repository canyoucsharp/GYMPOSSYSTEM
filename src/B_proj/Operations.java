package B_proj;

public class Operations {
	private int locationCost;
	private Utility utilityObj;
	private int accountsPayable;
	private int maxOccupancy;
	private double monthlyCost;
	private double roi;
	
	Operations(){
		utilityObj=new Utility();
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
		monthlyCost=(locationCost+accountsPayable+utilityObj.totalUtilities());
		roi+=1;
		monthlyCost*=roi;
		monthlyCost/=maxOccupancy;
	}

	public double getMonthlyCost() {
		this.calculateMonthlyCost();
		return monthlyCost;
	}
	
}