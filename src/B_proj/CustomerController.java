package B_proj;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.sun.org.apache.xpath.internal.operations.Number;

public class CustomerController {
    private Customer cusObj;
    private CustomerDb cusDb;
    private Subscription newSub;
    private SubscriptionDb newSubDb;
    private PaymentInfo newPayInfo;
    private PaymentDb newPayDb;
    private Membership memInfo;
    private MembershipDb memDb;
    double monthlyCost;
    
    
    public Customer getCusObj() {
        return cusObj;
    }


    public Subscription getNewSub() {
        return newSub;
    }


    public void setNewSub(Subscription newSub) {
        this.newSub = newSub;
    }


    public SubscriptionDb getNewSubDb() {
        return newSubDb;
    }


    public void setNewSubDb(SubscriptionDb newSubDb) {
        this.newSubDb = newSubDb;
    }


    public void setCusObj(Customer cusObj) {
        this.cusObj = cusObj;
    }

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
	
	public String displayPlanTypeSub(){ //not sure when you would use this over displaySubType but just for good measure
		return(newSub.getPlanType());
	}
	public void updatePlanTypeSub(String type){
		newSubDb.pushPlanType(type);
		newSub.setPlanType(type);
	}
	
	public void updateFirstName(String firstName) throws SQLException{
		cusDb.pushFirstName(firstName, cusObj);
		cusObj.setFirstName(firstName);
	}
	public void updateLastName(String lastName) throws SQLException{
		cusDb.pushLastName(lastName, cusObj);
		cusObj.setLastName(lastName);
	}
	public void updatePhoneNumber(String number) throws SQLException
	{
		cusDb.pushNumber(number, cusObj);
		cusObj.setPhoneNumber(number);
	}
	public void updateAddress(String address) throws SQLException
	{
		cusDb.pushAddress(address, cusObj);
		cusObj.setAddress(address);
	}
	public void updateAge(String age) throws SQLException{
		cusDb.pushAge(age, cusObj);
		cusObj.setAge(Integer.valueOf(age));
	}
	public void updateSex(String Sex) throws SQLException{
		cusDb.pushSex(Sex, cusObj);
		cusObj.setSex(Sex);
	}
	public void updateLicense(String newlicenseNumber) throws SQLException{
		cusDb.pushLicenseNumber(newlicenseNumber, cusObj);
		cusObj.setLicenseNum(newlicenseNumber);
	}
	public void updateSubId(int newSubId) throws SQLException{
		cusDb.pushSubId(newSubId, cusObj);
	}
	public void updateRepId(int newRepId) throws SQLException{
		cusDb.pushRepId(newRepId, cusObj);
	}
	
	public void updateDateOfBirth(String dob) throws SQLException{
		cusDb.pushDateOfBirth(dob,cusObj);
		cusObj.setDob(dob);
	}
	public void updatePictureLink(String pictureLink) throws SQLException{
		cusDb.pushPictureLink(pictureLink,cusObj);
		cusObj.setPictureLink(pictureLink);
	}
	
	
	//Displays
	public String displayFirstName(){
		return(cusObj.getFirstName()); 
	}
	public String displayLastName(){
		return(cusObj.getLastName());
	}
	public String displayPhoneNumber(){
		return(cusObj.getPhoneNumber());
	}
	public String displayAddress(){
		return(cusObj.getAddress());
	}
	public int displayAge(){
		return(cusObj.getAge());
	}
	public String displaySex(){
		switch(cusObj.getSex()){
			case "M":
				return("Male");
		case "F":
				return("Female");
			}
		return ("Error");
		}
	public String displayLicenseNumber()
	{
		return(cusObj.getLicenseNum());
	}
	public String displaysubscriptionType(){//DENNIS When you do operation.displaycost , please save output to customercontroller.setCurrentRate(value)
		String x =memInfo.getPlanType();
		if(Integer.valueOf(x)==0)
			return(memInfo.getPlanDescription());
		else if (Integer.valueOf(x)>0)
			return(memInfo.getPlanRate()+memInfo.getPlanDescription());
		
		return("Error");
	}
	
	public int displaysignupRepId(){
		return(cusObj.getRepId());
	}
	public String displayDateOfBirth(){
		return(cusObj.getDob());
	}
	public String displayPictureLink(){
		return(cusObj.getPictureLink());
	}
	
	public void newCustomer(String firstName,String lastName,String sex,String dob,String phone,String picture,String address,int age,int repId,String lisnum, int id) throws SQLException{
		cusObj=new Customer();
        cusDb=new CustomerDb();
        newSub=new Subscription();
        cusObj.setNewSUb(newSub);
        cusObj.initNew(firstName,lastName,sex,dob,phone,picture,address,age,repId, lisnum, id);
        cusDb.registerCustomer(cusObj, newSub);
	}
	
	public void newSubscription(int clientid,String subStatus,String planType,String contractLength) throws SQLException, NumberFormatException, ParseException
	{	newSubDb=new SubscriptionDb();
		newSub.initNew(subStatus, planType,contractLength);
		newSubDb.newSub(clientid, newSub);
	
	}
	
	public void newPayment(String cardNum,int provider,String security,String expiration){
		newPayInfo=new PaymentInfo();
		newPayDb=new PaymentDb();
		newPayInfo.init(cardNum, provider, security, expiration);
		newPayDb.newPay(cusObj,newPayInfo);
		
		
	}
	public void newMembership(String planType,String planDescription,double planRate){
		   memInfo=new Membership();
           memDb=new MembershipDb();
           memInfo.init(planType,planDescription,planRate);
           memDb.newMem(memInfo,cusObj);
	}
	
	
	//Subscription
	
	public String displayContractBegin (){
		return(newSub.getContractBegin());
	}
	public void updateContractBegin(String begin){
		newSubDb.pushContractBegin(begin);
		newSub.setContractBegin(begin);
	}
	public String displayContractEnd(){
		return(newSub.getContractEnd());
	}
	public void updateContractEnd(String end){
		newSubDb.pushContractEnd(end);
		newSub.setContractEnd(end);
	}
	
	public String displaySubStatus(){
		return(newSub.getSubStatus());
	}
	public void updateSubStatus(String status){
		newSubDb.pushSubStatus(status);
		newSub.setSubStatus(status);
	}
	
	public long displaySubRemaining(){
		return(newSub.getContractRemaining());
	}
	public void updateSubRemaining(long remaining){
		newSubDb.pushSubRemaining(remaining);
		newSub.setContractRemaining(remaining);
	}
	
	
	// Payment info
	
	public String displayCreditCardNum(){
		return(newPayInfo.getCreditCardNum());
	}
	public String displayProvider(){
		return(newPayInfo.getProvider());
	}
	public String displaySecurity(){
		return(newPayInfo.getSecurity());
	}
	public String displayExperation(){
		return(newPayInfo.getExpiration());
	}
	public void updateCreditCardNum(String cardNum){
		newPayDb.pushCreditCardNumber(cardNum,cusObj);
		newPayInfo.setCreditCardNum(cardNum);
	}
	public void updateProvider(int pid){
		newPayDb.pushProvider(pid,cusObj);
		newPayInfo.setProvider(pid);
	}
	public void updateSecurity(String security){
		newPayDb.pushSecurity(security,cusObj);
		newPayInfo.setSecurity(security);
	}
	public void updateExpiration(String expiration){
		newPayDb.pushExpiration(expiration,cusObj);
		newPayInfo.setExpiration(expiration);
	}
	
	//Membership
	public String displayPlanType(){
		return(memInfo.getPlanType());
	}
	public String displayPlanDescription(){
		return(memInfo.getPlanDescription());
	}
	public double displayPlanRate(){
		return(memInfo.getPlanRate());
	}
	public void updatePlanType(String planType){
		memInfo.setPlanType(planType);
		memDb.updatePlanType(planType,memInfo);
	}
	public void updatePlanDescription(String planDescription){
		memInfo.setPlanDescription(planDescription);
		memDb.updatePlanDescription(planDescription,memInfo);
	}
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
		}}
		
		
	}
	public void setCurrentRate(double rate){
		memInfo.setCurRate(rate);
	}
}
