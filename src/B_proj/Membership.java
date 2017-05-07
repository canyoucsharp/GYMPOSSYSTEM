package B_proj;

public class Membership {
	private String planType;
	private String planDescription;
	private double planRate;
	private double currentRate;
	//

	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public String getPlanDescription() {
		return planDescription;
	}
	public void setPlanDescription(String planDescription) {
		this.planDescription = planDescription;
	}
	public double getPlanRate() {
		return planRate;
	}
	public void setPlanRate(double pRate) {
		this.planRate = pRate;
	}
	public void init(String planType2, String planDescription2, double planRate2) {
		this.planType=planType2;
		this.planDescription=planDescription2;
		this.planRate=planRate2;
		
	}
		this.currentRate=rate;
	}
	public double getCurrentRate() {
		return currentRate;
	}
	
}
