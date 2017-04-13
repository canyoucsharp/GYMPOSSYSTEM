package B_proj;

public class CustomerController {
	Customer cusObj;
	int monthlyCost;
	
	
	CustomerController(){
		cusObj=new Customer();
		}
	
	
	// Actions
	public void searchCustomer(int id){
		cusObj.setId(id);
		CustomerDb.init(cusObj);
	}
	public void updateFirstName(String firstName){
		CustomerDb.pushFirstName(firstName);
	}
	public void updateLastName(String lastName){
		CustomerDb.pushLastName(lastName);
	}
	public void updatePhoneNumber(int number)
	{
		CustomerDb.pushNumber(number);
	}
	public void updateAddress(String Address)
	{
		CustomerDb.pushAddress(Address);
	}
	public void updateAge(String Age){
		CustomerDb.pushAge(Age);
	}
	public void updateSex(char Sex){
		CustomerDb.pushSex(Sex);
	}
	public void updateLicense(int newlicenseNumber){
		CustomerDb.pushLicenseNumber(newlicenseNumber);
	}
	public void updateSubId(int newSubId){
		CustomerDb.pushSubId(newSubId);
	}
	public void updateRepId(int newRepId){
		CustomerDb.pushRepId(newRepId);
	}
	
	
	
	
	//Displays
	public String displayFirstName(){
		return(cusObj.getFirstName()); 
	}
	public String displayLastName(){
		return(cusObj.getLastName());
	}
	public int displayPhoneNumber(){
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
			case 'M':
				return("Male");
		case 'F':
				return("Female");
			}
		return ("Error");
		}
	public int displayLicenseNumber()
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
