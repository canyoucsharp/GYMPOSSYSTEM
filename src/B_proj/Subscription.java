package B_proj;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Subscription  {
	int subid;
	String subStatus;
	String contractBegin;
	String contractEnd;
	String planType;
	long contractRemaining;
	int contractLengthInYears;
	
	public int getContractLengthInYears() {
		return contractLengthInYears;
	}
	public void setContractLengthInYears(int contractLengthInYears) {
		this.contractLengthInYears = contractLengthInYears;
	}
	public void initNew(String subStatus ,String planType,String contractLength) throws NumberFormatException, ParseException {
		LocalDate today = LocalDate.now( ZoneId.of( "America/Montreal" ) );
		java.util.Date date1= java.sql.Date.valueOf(today);
		String endDate=calcEndDate(Integer.parseInt(contractLength),date1);
		
		this.setSubStatus(subStatus);
		this.setContractBegin(date1.toString());
		this.setContractEnd(endDate.toString());
		this.setContractLengthInYears(Integer.parseInt(contractLength));
		contractRemaining=getContractRemaining(endDate,TimeUnit.DAYS);
	}
	public static long getContractRemaining(String enddate, TimeUnit timeUnit) throws ParseException {
		LocalDate today = LocalDate.now( ZoneId.of( "America/Montreal" ) );
		java.util.Date date1 = java.sql.Date.valueOf(today);
		 Date enddate1=new SimpleDateFormat("yyyy-MM-dd").parse(enddate);
		long diffInMillies = enddate1.getTime() - date1.getTime();
	    return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
	}
	
	public String calcEndDate(int years,Date curDate) throws ParseException
	{
		
		int days=years*365;
		Calendar cal = Calendar.getInstance();
		cal.setTime(curDate); // Now use sub date.
		cal.add(Calendar.DATE,days );
		
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		String formatted = format1.format(cal.getTime());
		return formatted;
		
	
	
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


	public long getContractRemaining() {
		return contractRemaining;
	}


	public void setContractRemaining(long contractRemaining2) {
		this.contractRemaining = contractRemaining2;
	}


	public String getPlanType() {
		return planType;
	}


	public void setPlanType(String planType) {
		this.planType = planType;
	}
}

	