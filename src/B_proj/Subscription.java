package B_proj;

public class Subscription  {
	int subid;
	String subStatus;
	String contractBegin;
	String contractEnd;
	String contractRemaining;
	String planType;
	
	
	public Subscription() {
		this.subStatus="off";
	}


	public int getSubid() {
		return subid;
	}


	public void setSubid(int subid) {
		this.subid = subid;
	}


	public String getSubStatus() {
		return subStatus;
	}


	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}


	public String getContractBegin() {
		return contractBegin;
	}


	public void setContractBegin(String contractBegin) {
		this.contractBegin = contractBegin;
	}


	public String getContractEnd() {
		return contractEnd;
	}


	public void setContractEnd(String contractEnd) {
		this.contractEnd = contractEnd;
	}


	public String getContractRemaining() {
		return contractRemaining;
	}


	public void setContractRemaining(String contractRemaining) {
		this.contractRemaining = contractRemaining;
	}


	public String getPlanType() {
		return planType;
	}


	public void setPlanType(String planType) {
		this.planType = planType;
	}
}

	