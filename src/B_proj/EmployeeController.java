package B_proj;
import java.sql.SQLException;
public class EmployeeController {
	private Employee empObj;
	private EmployeeDb empDbObj;
	
	EmployeeController(){
	empObj=new Employee();
	empDbObj=new EmployeeDb();
	}
	
	//update functions
	public void updateHourlyRate(int newRate) throws SQLException{
		empDbObj.pushHourlyRate(newRate, empObj);
	}
	public void updateFirstName(String firstName) throws SQLException{
		empDbObj.pushFirstName(firstName, empObj);
	}
	public void updateLastName(String lastName) throws SQLException{
		empDbObj.pushLastName(lastName, empObj);
	}
	public void updatePhoneNumber(String number) throws SQLException
	{
		empDbObj.pushNumber(number, empObj);
	}
	public void updateAddress(String Address) throws SQLException
	{
		empDbObj.pushAddress(Address, empObj);
	}
	public void updateAge(String Age) throws SQLException{
		empDbObj.pushAge(Age, empObj);
	}
	public void updateSex(String Sex) throws SQLException{
		empDbObj.pushSex(Sex, empObj);
	}
	public void updateLicense(String newlicenseNumber) throws SQLException{
		empDbObj.pushLicenseNumber(newlicenseNumber, empObj);
	}
	
	//DISPLAY FUNCTIONS
	
	public int displayHourlyRate(){
		return(empObj.getHourlyRate());
	}
	
	public int displaySales(){
		return(empObj.getSales());
	}
	public String displayFirstName(){
		return(empObj.getFirstName()); 
	}
	public String displayLastName(){
		return(empObj.getLastName());
	}
	public String displayPhoneNumber(){
		return(empObj.getPhoneNumber());
	}
	public String displayAddress(){
		return(empObj.getAddress());
	}
	public int displayAge(){
		return(empObj.getAge());
	}
	public String displaySex(){
		switch(empObj.getSex()){
			case "M":
				return("Male");
		case "F":
				return("Female");
			}
		return ("Error");
		}
}
