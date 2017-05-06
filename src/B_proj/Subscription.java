package B_proj;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
	public void initNew(String subStatus,String planType,String contractLength) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = new Date();
		dateFormat.format(date1);
		String endDate=calcEndDate( contractLengthInYears,date1);
		
		this.setSubStatus(subStatus);
		this.setContractBegin(date1.toString());
		this.setContractEnd(endDate);
		this.setContractLengthInYears(Integer.parseInt(contractLength));
	}
	public String calcEndDate(int years,Date curDate)
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		int days=years*365;
		Calendar cal = Calendar.getInstance();
		cal.setTime(curDate); // Now use sub date.
		cal.add(Calendar.DATE,days );
		Date newDate= cal.getTime();
		dateFormat.format(newDate);
		return newDate.toString();
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

	