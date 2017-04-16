package B_proj;

public class Subscription  {
	int subid;
	String substatus;
	String contractbegin;
	String contractend;
	String contractremaining;
	String plantype;
	
	
	public Subscription() {
		this.substatus="off";
	}
	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
		this.subid = subid;
	}
	public String getSubstatus() {
		return substatus;
	}
	public void setSubstatus(String substatus) {
		this.substatus = substatus;
	}
	public String getContractbegin() {
		return contractbegin;
	}
	public void setContractbegin(String contractbegin) {
		this.contractbegin = contractbegin;
	}
	public String getContractend() {
		return contractend;
	}
	public void setContractend(String contractend) {
		this.contractend = contractend;
	}
	public String getContractremaining() {
		return contractremaining;
	}
	public void setContractremaining(String contractremaining) {
		this.contractremaining = contractremaining;
	}
	public String getPlantype() {
		return plantype;
	}
	public void setPlantype(String plantype) {
		this.plantype = plantype;
	}

}
