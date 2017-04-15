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
		CustomerDb.pushFirstName(firstName, cusObj);
	}
	public void updateLastName(String lastName){
		CustomerDb.pushLastName(lastName, cusObj);
	}
	public void updatePhoneNumber(String number)
	{
		CustomerDb.pushNumber(number, cusObj);
	}
	public void updateAddress(String Address)
	{
		CustomerDb.pushAddress(Address, cusObj);
	}
	public void updateAge(String Age){
		CustomerDb.pushAge(Age, cusObj);
	}
	public void updateSex(String Sex){
		CustomerDb.pushSex(Sex, cusObj);
	}
	public void updateLicense(String newlicenseNumber){
		CustomerDb.pushLicenseNumber(newlicenseNumber, cusObj);
	}
	public void updateSubId(int newSubId){
		CustomerDb.pushSubId(newSubId, cusObj);
	}
	public void updateRepId(int newRepId){
		CustomerDb.pushRepId(newRepId, cusObj);
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
