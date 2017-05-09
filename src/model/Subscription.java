package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

// TODO: Auto-generated Javadoc
/**
 * The Class Subscription.
 */
public class Subscription  {
	
	/** The subid. */
	int subid;
	
	/** The sub status. */
	String subStatus;
	
	/** The contract begin. */
	String contractBegin;
	
	/** The contract end. */
	String contractEnd;
	
	/** The plan type. */
	String planType;
	
	/** The contract remaining. */
	long contractRemaining;
	
	/** The contract length in years. */
	int contractLengthInYears;

	/**
	 * Gets the contract length in years.
	 *
	 * @return the contract length in years
	 */
	public int getContractLengthInYears() {
		return contractLengthInYears;
	}
	
	/**
	 * Sets the contract length in years.
	 *
	 * @param contractLengthInYears the new contract length in years
	 */
	public void setContractLengthInYears(int contractLengthInYears) {
		this.contractLengthInYears = contractLengthInYears;
	}
	
	/**
	 * Inits the new.
	 *
	 * @param subStatus the sub status
	 * @param planType the plan type
	 * @param contractLength the contract length
	 * @throws NumberFormatException the number format exception
	 * @throws ParseException the parse exception
	 */
	public void initNew(String subStatus ,String planType,String contractLength) throws NumberFormatException, ParseException {
		LocalDate today = LocalDate.now( ZoneId.of( "America/Montreal" ) );
		java.util.Date date1= java.sql.Date.valueOf(today);
		String endDate=calcEndDate(Integer.parseInt(contractLength),date1);
		this.setSubStatus(subStatus);
		this.setContractBegin(date1.toString());
		this.setContractEnd(endDate.toString());
		this.setPlanType(planType);
		this.setContractLengthInYears(Integer.parseInt(contractLength));
		contractRemaining=getContractRemaining(endDate,TimeUnit.DAYS);
	}
	
	/**
	 * Gets the contract remaining.
	 *
	 * @param enddate the enddate
	 * @param timeUnit the time unit
	 * @return the contract remaining
	 * @throws ParseException the parse exception
	 */
	public static long getContractRemaining(String enddate, TimeUnit timeUnit) throws ParseException {
		LocalDate today = LocalDate.now( ZoneId.of( "America/Montreal" ) );
		java.util.Date date1 = java.sql.Date.valueOf(today);
		 Date enddate1=new SimpleDateFormat("yyyy-MM-dd").parse(enddate);
		long diffInMillies = enddate1.getTime() - date1.getTime();
	    return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
	}
	
	/**
	 * Calc end date.
	 *
	 * @param years the years
	 * @param curDate the cur date
	 * @return the string
	 * @throws ParseException the parse exception
	 */
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
	
	/**
	 * Instantiates a new subscription.
	 */
	public Subscription() {
		this.subStatus="off";
	}


	/**
	 * Gets the subid.
	 *
	 * @return the subid
	 */
	public int getSubid() {
		return subid;
	}


	/**
	 * Sets the subid.
	 *
	 * @param subid the new subid
	 */
	public void setSubid(int subid) {
		this.subid = subid;
	}


	/**
	 * Gets the sub status.
	 *
	 * @return the sub status
	 */
	public String getSubStatus() {
		return subStatus;
	}


	/**
	 * Sets the sub status.
	 *
	 * @param subStatus the new sub status
	 */
	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}


	/**
	 * Gets the contract begin.
	 *
	 * @return the contract begin
	 */
	public String getContractBegin() {
		return contractBegin;
	}


	/**
	 * Sets the contract begin.
	 *
	 * @param contractBegin the new contract begin
	 */
	public void setContractBegin(String contractBegin) {
		this.contractBegin = contractBegin;
	}


	/**
	 * Gets the contract end.
	 *
	 * @return the contract end
	 */
	public String getContractEnd() {
		return contractEnd;
	}


	/**
	 * Sets the contract end.
	 *
	 * @param contractEnd the new contract end
	 */
	public void setContractEnd(String contractEnd) {
		this.contractEnd = contractEnd;
	}


	/**
	 * Gets the contract remaining.
	 *
	 * @return the contract remaining
	 */
	public long getContractRemaining() {
		return contractRemaining;
	}


	/**
	 * Sets the contract remaining.
	 *
	 * @param contractRemaining2 the new contract remaining
	 */
	public void setContractRemaining(long contractRemaining2) {
		this.contractRemaining = contractRemaining2;
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
}

	