package B_proj;

import java.sql.SQLException;

public class CustomerController {
    private Customer cusObj;
    private CustomerDb cusDb;
    private Subscription newSub;
    private SubscriptionDb newSubDb;
    int monthlyCost;
    
    
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

        }

	// Actions
	public void searchCustomer(int id) throws SQLException{
		cusObj.setId(id);
		cusDb.init(cusObj);
	}
	public void updateFirstName(String firstName) throws SQLException{
		cusDb.pushFirstName(firstName, cusObj);
	}
	public void updateLastName(String lastName) throws SQLException{
		cusDb.pushLastName(lastName, cusObj);
	}
	public void updatePhoneNumber(String number) throws SQLException
	{
		cusDb.pushNumber(number, cusObj);
	}
	public void updateAddress(String Address) throws SQLException
	{
		cusDb.pushAddress(Address, cusObj);
	}
	public void updateAge(String Age) throws SQLException{
		cusDb.pushAge(Age, cusObj);
	}
	public void updateSex(String Sex) throws SQLException{
		cusDb.pushSex(Sex, cusObj);
	}
	public void updateLicense(String newlicenseNumber) throws SQLException{
		cusDb.pushLicenseNumber(newlicenseNumber, cusObj);
	}
	public void updateSubId(int newSubId) throws SQLException{
		cusDb.pushSubId(newSubId, cusObj);
	}
	public void updateRepId(int newRepId) throws SQLException{
		cusDb.pushRepId(newRepId, cusObj);
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
	public String displaysubscriptionType(){
		int subType= cusObj.getSubId();
		switch(subType){
		case 0:
			return("Canceled");
		case 1:
			return(monthlyCost+" for 24 Months");
		case 2:
			return((monthlyCost*2)+"for 12 Months");
		case 3:
			return((monthlyCost*3)+" No Contract ");
		}
		return("Error");
	}
	
	public int displaysignupRepId(){
		return(cusObj.getRepId());
	}
}
