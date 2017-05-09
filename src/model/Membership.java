package model;

// TODO: Auto-generated Javadoc
/**
 * The Class Membership.
 */
public class Membership {
	
	/** The plan type. */
	private String planType;
	
	/** The plan description. */
	private String planDescription;
	
	/** The plan rate. */
	private double planRate;
	
	/** The current rate. */
	private double currentRate;
	//

	public Membership(){
		if(planType==null){
			planType="0";
		}
	}
	/**
	 * Gets the plan type.
	 *
	 * @return the plan type
	 */
	public String getPlanType() {
		return planType;
	}
	
	/**
	 * Sets the plan type.
	 *
	 * @param planType the new plan type
	 */
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	
	/**
	 * Gets the plan description.
	 *
	 * @return the plan description
	 */
	public String getPlanDescription() {
		return planDescription;
	}
	
	/**
	 * Sets the plan description.
	 *
	 * @param planDescription the new plan description
	 */
	public void setPlanDescription(String planDescription) {
		this.planDescription = planDescription;
	}
	
	/**
	 * Gets the plan rate.
	 *
	 * @return the plan rate
	 */
	public double getPlanRate() {
		return planRate;
	}
	
	/**
	 * Sets the plan rate.
	 *
	 * @param pRate the new plan rate
	 */
	public void setPlanRate(double pRate) {
		this.planRate = pRate;
	}
	
	/**
	 * Inits the.
	 *
	 * @param planType2 the plan type 2
	 * @param planDescription2 the plan description 2
	 * @param planRate2 the plan rate 2
	 */
	public void init(String planType2, String planDescription2, double planRate2) {
		this.planType=planType2;
		this.planDescription=planDescription2;
		this.planRate=planRate2;
		
	}
	
	/**
	 * Sets the cur rate.
	 *
	 * @param rate the new cur rate
	 */
	public void setCurRate(double rate) { 
		this.currentRate=rate;
	}
	
	/**
	 * Gets the current rate.
	 *
	 * @return the current rate
	 */
	public double getCurrentRate() {
		return currentRate;
	}
	
}
