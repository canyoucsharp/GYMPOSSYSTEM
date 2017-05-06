package B_proj;

public class Subscription  {
	int subid;
	String subStatus;
	String contractBegin;
	String contractEnd;
	String planType;
	String contractRemaining;
	int contractLengthInYears;
	
	public int getContractLengthInYears() {
		return contractLengthInYears;
	}
	public void setContractLengthInYears(int contractLengthInYears) {
		this.contractLengthInYears = contractLengthInYears;
	}
	public void initNew(String subStatus,String contractBegin,String contractEnd ,String planType,String contractLength) {
		this.setSubStatus(subStatus);
		this.setContractBegin(contractBegin);
		this.setContractEnd(contractEnd);
		this.setContractLengthInYears(Integer.parseInt(contractLength));
	}
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

	