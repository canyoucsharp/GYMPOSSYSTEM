package B_proj;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.sun.org.apache.xpath.internal.operations.Number;

// TODO: Auto-generated Javadoc
/**
 * The Class CustomerController.
 */
public class CustomerController {
    
    /** The cus obj. */
    private Customer cusObj;
    
    /** The cus db. */
    private CustomerDb cusDb;
    
    /** The new sub. */
    private Subscription newSub;
    
    /** The new sub db. */
    private SubscriptionDb newSubDb;
    
    /** The new pay info. */
    private PaymentInfo newPayInfo;
    
    /** The new pay db. */
    private PaymentDb newPayDb;
    
    /** The mem info. */
    private Membership memInfo;
    
    /** The mem db. */
    private MembershipDb memDb;
    
    /** The monthly cost. */
    double monthlyCost;
    
    
    /**
     * Gets the cus obj.
     *
     * @return the cus obj
     */
    public Customer getCusObj() {
        return cusObj;
    }


    /**
     * Gets the new sub.
     *
     * @return the new sub
     */
    public Subscription getNewSub() {
        return newSub;
    }


    /**
     * Sets the new sub.
     *
     * @param newSub the new new sub
     */
    public void setNewSub(Subscription newSub) {
        this.newSub = newSub;
    }


    /**
     * Gets the new sub db.
     *
     * @return the new sub db
     */
    public SubscriptionDb getNewSubDb() {
        return newSubDb;
    }


    /**
     * Sets the new sub db.
     *
     * @param newSubDb the new new sub db
     */
    public void setNewSubDb(SubscriptionDb newSubDb) {
        this.newSubDb = newSubDb;
    }


    /**
     * Sets the cus obj.
     *
     * @param cusObj the new cus obj
     */
    public void setCusObj(Customer cusObj) {
        this.cusObj = cusObj;
    }

        /**
         * Instantiates a new customer controller.
         */
        public CustomerController(){
            cusObj=new Customer();
            cusDb=new CustomerDb();
            newSub=new Subscription();
            newSubDb=new SubscriptionDb();
            newPayInfo=new PaymentInfo();
            newPayDb=new PaymentDb();
            memInfo=new Membership();
            memDb=new MembershipDb();
        }

	/**
	 * Search customer.
	 *
	 * @param id the id
	 * @throws SQLException the SQL exception
	 */
	// Actions
	public void searchCustomer(int id) throws SQLException{
		cusObj.setId(id);
		try {
			cusDb.init(cusObj);
			newSubDb.init(cusObj.getId(), newSub);
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Display plan type sub.
	 *
	 * @return the string
	 */
	public String displayPlanTypeSub(){ //not sure when you would use this over displaySubType but just for good measure
		return(newSub.getPlanType());
	}
	
	/**
	 * Update plan type sub.
	 *
	 * @param type the type
	 */
	public void updatePlanTypeSub(String type){
		newSubDb.pushPlanType(type);
		newSub.setPlanType(type);
	}
	
	/**
	 * Update first name.
	 *
	 * @param firstName the first name
	 * @throws SQLException the SQL exception
	 */
	public void updateFirstName(String firstName) throws SQLException{
		cusDb.pushFirstName(firstName, cusObj);
		cusObj.setFirstName(firstName);
	}
	
	/**
	 * Update last name.
	 *
	 * @param lastName the last name
	 * @throws SQLException the SQL exception
	 */
	public void updateLastName(String lastName) throws SQLException{
		cusDb.pushLastName(lastName, cusObj);
		cusObj.setLastName(lastName);
	}
	
	/**
	 * Update phone number.
	 *
	 * @param number the number
	 * @throws SQLException the SQL exception
	 */
	public void updatePhoneNumber(String number) throws SQLException
	{
		cusDb.pushNumber(number, cusObj);
		cusObj.setPhoneNumber(number);
	}
	
	/**
	 * Update address.
	 *
	 * @param address the address
	 * @throws SQLException the SQL exception
	 */
	public void updateAddress(String address) throws SQLException
	{
		cusDb.pushAddress(address, cusObj);
		cusObj.setAddress(address);
	}
	
	/**
	 * Update age.
	 *
	 * @param age the age
	 * @throws SQLException the SQL exception
	 */
	public void updateAge(String age) throws SQLException{
		cusDb.pushAge(age, cusObj);
		cusObj.setAge(Integer.valueOf(age));
	}
	
	/**
	 * Update sex.
	 *
	 * @param Sex the sex
	 * @throws SQLException the SQL exception
	 */
	public void updateSex(String Sex) throws SQLException{
		cusDb.pushSex(Sex, cusObj);
		cusObj.setSex(Sex);
	}
	
	/**
	 * Update license.
	 *
	 * @param newlicenseNumber the newlicense number
	 * @throws SQLException the SQL exception
	 */
	public void updateLicense(String newlicenseNumber) throws SQLException{
		cusDb.pushLicenseNumber(newlicenseNumber, cusObj);
		cusObj.setLicenseNum(newlicenseNumber);
	}
	
	/**
	 * Update sub id.
	 *
	 * @param newSubId the new sub id
	 * @throws SQLException the SQL exception
	 */
	public void updateSubId(int newSubId) throws SQLException{
		cusDb.pushSubId(newSubId, cusObj);
	}
	
	/**
	 * Update rep id.
	 *
	 * @param newRepId the new rep id
	 * @throws SQLException the SQL exception
	 */
	public void updateRepId(int newRepId) throws SQLException{
		cusDb.pushRepId(newRepId, cusObj);
	}
	
	/**
	 * Update date of birth.
	 *
	 * @param dob the dob
	 * @throws SQLException the SQL exception
	 */
	public void updateDateOfBirth(String dob) throws SQLException{
		cusDb.pushDateOfBirth(dob,cusObj);
		cusObj.setDob(dob);
	}
	
	/**
	 * Update picture link.
	 *
	 * @param pictureLink the picture link
	 * @throws SQLException the SQL exception
	 */
	public void updatePictureLink(String pictureLink) throws SQLException{
		cusDb.pushPictureLink(pictureLink,cusObj);
		cusObj.setPictureLink(pictureLink);
	}
	
	
	/**
	 * Display first name.
	 *
	 * @return the string
	 */
	//Displays
	public String displayFirstName(){
		return(cusObj.getFirstName()); 
	}
	
	/**
	 * Display last name.
	 *
	 * @return the string
	 */
	public String displayLastName(){
		return(cusObj.getLastName());
	}
	
	/**
	 * Display phone number.
	 *
	 * @return the string
	 */
	public String displayPhoneNumber(){
		return(cusObj.getPhoneNumber());
	}
	
	/**
	 * Display address.
	 *
	 * @return the string
	 */
	public String displayAddress(){
		return(cusObj.getAddress());
	}
	
	/**
	 * Display age.
	 *
	 * @return the int
	 */
	public int displayAge(){
		return(cusObj.getAge());
	}
	
	/**
	 * Display sex.
	 *
	 * @return the string
	 */
	public String displaySex(){
		switch(cusObj.getSex()){
			case "M":
				return("Male");
		case "F":
				return("Female");
			}
		return ("Error");
		}
	
	/**
	 * Display license number.
	 *
	 * @return the string
	 */
	public String displayLicenseNumber()
	{
		return(cusObj.getLicenseNum());
	}
	
	/**
	 * Displaysubscription type.
	 *
	 * @return the string
	 */
	public String displaysubscriptionType(){//DENNIS When you do operation.displaycost , please save output to customercontroller.setCurrentRate(value)
		String x =memInfo.getPlanType();
		if(Integer.valueOf(x)==0)
			return(memInfo.getPlanDescription());
		else if (Integer.valueOf(x)>0)
			return(memInfo.getPlanRate()+memInfo.getPlanDescription());
		
		return("Error");
	}
	
	/**
	 * Displaysignup rep id.
	 *
	 * @return the int
	 */
	public int displaysignupRepId(){
		return(cusObj.getRepId());
	}
	
	/**
	 * Display date of birth.
	 *
	 * @return the string
	 */
	public String displayDateOfBirth(){
		return(cusObj.getDob());
	}
	
	/**
	 * Display picture link.
	 *
	 * @return the string
	 */
	public String displayPictureLink(){
		return(cusObj.getPictureLink());
	}
	
	/**
	 * New customer.
	 *
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param sex the sex
	 * @param dob the dob
	 * @param phone the phone
	 * @param picture the picture
	 * @param address the address
	 * @param age the age
	 * @param repId the rep id
	 * @param lisnum the lisnum
	 * @param id the id
	 * @throws SQLException the SQL exception
	 */
	public void newCustomer(String firstName,String lastName,String sex,String dob,String phone,String picture,String address,int age,int repId,String lisnum, int id) throws SQLException{
		cusObj=new Customer();
        cusDb=new CustomerDb();
        newSub=new Subscription();
        cusObj.setNewSUb(newSub);
        cusObj.initNew(firstName,lastName,sex,dob,phone,picture,address,age,repId, lisnum, id);
        cusDb.registerCustomer(cusObj, newSub);
	}
	
	/**
	 * New subscription.
	 *
	 * @param clientid the clientid
	 * @param subStatus the sub status
	 * @param planType the plan type
	 * @param contractLength the contract length
	 * @throws SQLException the SQL exception
	 * @throws NumberFormatException the number format exception
	 * @throws ParseException the parse exception
	 */
	public void newSubscription(int clientid,String subStatus,String planType,String contractLength) throws SQLException, NumberFormatException, ParseException
	{	newSubDb=new SubscriptionDb();
		newSub.initNew(subStatus, planType,contractLength);
		newSubDb.newSub(clientid, newSub);
	
	}
	
	/**
	 * New payment.
	 *
	 * @param cardNum the card num
	 * @param provider the provider
	 * @param security the security
	 * @param expiration the expiration
	 */
	public void newPayment(String cardNum,int provider,String security,String expiration){
		newPayInfo=new PaymentInfo();
		newPayDb=new PaymentDb();
		newPayInfo.init(cardNum, provider, security, expiration);
		newPayDb.newPay(cusObj,newPayInfo);
		
		
	}
	
	/**
	 * New membership.
	 *
	 * @param planType the plan type
	 * @param planDescription the plan description
	 * @param planRate the plan rate
	 */
	public void newMembership(String planType,String planDescription,double planRate){
		   memInfo=new Membership();
           memDb=new MembershipDb();
           memInfo.init(planType,planDescription,planRate);
           memDb.newMem(memInfo,cusObj);
	}
	
	
	//Subscription
	
	/**
	 * Display contract begin.
	 *
	 * @return the string
	 */
	public String displayContractBegin (){
		return(newSub.getContractBegin());
	}
	
	/**
	 * Update contract begin.
	 *
	 * @param begin the begin
	 */
	public void updateContractBegin(String begin){
		newSubDb.pushContractBegin(begin);
		newSub.setContractBegin(begin);
	}
	
	/**
	 * Display contract end.
	 *
	 * @return the string
	 */
	public String displayContractEnd(){
		return(newSub.getContractEnd());
	}
	
	/**
	 * Update contract end.
	 *
	 * @param end the end
	 */
	public void updateContractEnd(String end){
		newSubDb.pushContractEnd(end);
		newSub.setContractEnd(end);
	}
	
	/**
	 * Display sub status.
	 *
	 * @return the string
	 */
	public String displaySubStatus(){
		return(newSub.getSubStatus());
	}
	
	/**
	 * Update sub status.
	 *
	 * @param status the status
	 */
	public void updateSubStatus(String status){
		newSubDb.pushSubStatus(status);
		newSub.setSubStatus(status);
	}
	
	/**
	 * Display sub remaining.
	 *
	 * @return the long
	 */
	public long displaySubRemaining(){
		return(newSub.getContractRemaining());
	}
	
	/**
	 * Update sub remaining.
	 *
	 * @param remaining the remaining
	 */
	public void updateSubRemaining(long remaining){
		newSubDb.pushSubRemaining(remaining);
		newSub.setContractRemaining(remaining);
	}
	
	
	// Payment info
	
	/**
	 * Display credit card num.
	 *
	 * @return the string
	 */
	public String displayCreditCardNum(){
		return(newPayInfo.getCreditCardNum());
	}
	
	/**
	 * Display provider.
	 *
	 * @return the string
	 */
	public String displayProvider(){
		return(newPayInfo.getProvider());
	}
	
	/**
	 * Display security.
	 *
	 * @return the string
	 */
	public String displaySecurity(){
		return(newPayInfo.getSecurity());
	}
	
	/**
	 * Display experation.
	 *
	 * @return the string
	 */
	public String displayExperation(){
		return(newPayInfo.getExpiration());
	}
	
	/**
	 * Update credit card num.
	 *
	 * @param cardNum the card num
	 */
	public void updateCreditCardNum(String cardNum){
		newPayDb.pushCreditCardNumber(cardNum,cusObj);
		newPayInfo.setCreditCardNum(cardNum);
	}
	
	/**
	 * Update provider.
	 *
	 * @param pid the pid
	 */
	public void updateProvider(int pid){
		newPayDb.pushProvider(pid,cusObj);
		newPayInfo.setProvider(pid);
	}
	
	/**
	 * Update security.
	 *
	 * @param security the security
	 */
	public void updateSecurity(String security){
		newPayDb.pushSecurity(security,cusObj);
		newPayInfo.setSecurity(security);
	}
	
	/**
	 * Update expiration.
	 *
	 * @param expiration the expiration
	 */
	public void updateExpiration(String expiration){
		newPayDb.pushExpiration(expiration,cusObj);
		newPayInfo.setExpiration(expiration);
	}
	
	/**
	 * Display plan type.
	 *
	 * @return the string
	 */
	//Membership
	public String displayPlanType(){
		return(memInfo.getPlanType());
	}
	
	/**
	 * Display plan description.
	 *
	 * @return the string
	 */
	public String displayPlanDescription(){
		return(memInfo.getPlanDescription());
	}
	
	/**
	 * Display plan rate.
	 *
	 * @return the double
	 */
	public double displayPlanRate(){
		return(memInfo.getPlanRate());
	}
	
	/**
	 * Update plan type.
	 *
	 * @param planType the plan type
	 */
	public void updatePlanType(String planType){
		memInfo.setPlanType(planType);
		memDb.updatePlanType(planType,memInfo);
	}
	
	/**
	 * Update plan description.
	 *
	 * @param planDescription the plan description
	 */
	public void updatePlanDescription(String planDescription){
		memInfo.setPlanDescription(planDescription);
		memDb.updatePlanDescription(planDescription,memInfo);
	}
	
	/**
	 * Update plan rate.
	 */
	public void updatePlanRate(){
		double rate=memInfo.getCurrentRate();
		if(memInfo.getPlanRate()>0&&Integer.valueOf(memInfo.getPlanType())<3){
			//donothing
		}else {
		switch(Integer.valueOf(memInfo.getPlanType())){
		case 0:
			memInfo.setPlanRate(0);
			memDb.updatePlanRate(0,memInfo);
			break;
		case 1:
			memInfo.setPlanRate(rate);
			memDb.updatePlanRate(rate,memInfo);
			break;
		case 2:
			memInfo.setPlanRate(1.25*rate);
			memDb.updatePlanRate(1.25*rate,memInfo);
			break;
		case 3:
			memInfo.setPlanRate(2*rate);
			memDb.updatePlanRate(2*rate,memInfo);
			break;		
		}
	}
}
	
	/**
	 * Update plan rate dummy.
	 *
	 * @param rate the rate
	 * @param type the type
	 * @return the double
	 */
	public double updatePlanRateDummy(double rate,int type){
		switch(type){
		case 0://canceled
			return(0);
		case 1://2 years
			return(rate);
		case 2://1 year
			return(1.25*rate);
		case 3:// no contract
			return(2*rate);	
		}
		return(0);
}
	
	/**
	 * Sets the current rate.
	 *
	 * @param rate the new current rate
	 */
	public void setCurrentRate(double rate){
		memInfo.setCurRate(rate);
	}
}
