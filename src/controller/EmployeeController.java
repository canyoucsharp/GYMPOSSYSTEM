package controller;
import java.awt.EventQueue;
import java.sql.SQLException;
// TODO: Auto-generated Javadoc

import model.Employee;
import view.AdminJFrame;

/**
 * The Class EmployeeController.
 */
public class EmployeeController {
	
	/** The emp obj. */
	private Employee empObj;
	
	/** The emp db obj. */
	private EmployeeDb empDbObj;
	
	/**
	 * Instantiates a new employee controller.
	 */
	public EmployeeController(){
	empObj=new Employee();
	empDbObj=new EmployeeDb();
	}
	

	
	/**
	 * Update hourly rate.
	 *
	 * @param newRate the new rate
	 * @throws SQLException the SQL exception
	 */
	//update functions
	public void updateHourlyRate(int newRate) throws SQLException{
		empObj.setHourlyRate(newRate);
		empDbObj.pushHourlyRate(newRate, empObj);
	}
	public void searchEmployee(int id) throws SQLException, NotFoundException{
		empObj.setId(id);
		try {
			empDbObj.init(empObj);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Update first name.
	 *
	 * @param firstName the first name
	 * @throws SQLException the SQL exception
	 */
	public void updateFirstName(String firstName) throws SQLException{
		empObj.setFirstName(firstName);
		empDbObj.pushFirstName(firstName, empObj);
	}
	
	/**
	 * Update last name.
	 *
	 * @param lastName the last name
	 * @throws SQLException the SQL exception
	 */
	public void updateLastName(String lastName) throws SQLException{
		empObj.setLastName(lastName);
		empDbObj.pushLastName(lastName, empObj);
	}
	
	/**
	 * Update phone number.
	 *
	 * @param number the number
	 * @throws SQLException the SQL exception
	 */
	public void updatePhoneNumber(String number) throws SQLException{
		empObj.setPhoneNumber(number);
		empDbObj.pushNumber(number, empObj);
	}
	
	/**
	 * Update address.
	 *
	 * @param Address the address
	 * @throws SQLException the SQL exception
	 */
	public void updateAddress(String Address) throws SQLException{
		empObj.setAddress(Address);
		empDbObj.pushAddress(Address, empObj);
	}
	
	/**
	 * Update age.
	 *
	 * @param Age the age
	 * @throws SQLException the SQL exception
	 */
	public void updateAge(String Age) throws SQLException{
		int i=Integer.valueOf(Age);
		empObj.setAge(i);
		empDbObj.pushAge(Age, empObj);
	}
	
	/**
	 * Update sex.
	 *
	 * @param Sex the sex
	 * @throws SQLException the SQL exception
	 */
	public void updateSex(String Sex) throws SQLException{
		empObj.setSex(Sex);
		empDbObj.pushSex(Sex, empObj);
	}
	
	/**
	 * Update license.
	 *
	 * @param newlicenseNumber the newlicense number
	 * @throws SQLException the SQL exception
	 */
	public void updateLicense(String newlicenseNumber) throws SQLException{
		empObj.setLicenseNum(newlicenseNumber);
		empDbObj.pushLicenseNumber(newlicenseNumber, empObj);
	}
	public void updateSales(int sales)throws SQLException{
		empObj.setSales(sales);
		empDbObj.pushSales(sales, empObj);
	}
	
	public void updateDob(String dob) throws SQLException{
		empObj.setDob(dob);
		empDbObj.pushDob(dob);
	}
	//DISPLAY FUNCTIONS
	
	/**
	 * Display hourly rate.
	 *
	 * @return the int
	 */
	public int displayHourlyRate(){
		return(empObj.getHourlyRate());
	}
	
	/**
	 * Display sales.
	 *
	 * @return the int
	 */
	public int displaySales(){
		return(empObj.getSales());
	}
	
	/**
	 * Display first name.
	 *
	 * @return the string
	 */
	public String displayFirstName(){
		return(empObj.getFirstName()); 
	}
	
	/**
	 * Display last name.
	 *
	 * @return the string
	 */
	public String displayLastName(){
		return(empObj.getLastName());
	}
	
	/**
	 * Display phone number.
	 *
	 * @return the string
	 */
	public String displayPhoneNumber(){
		return(empObj.getPhoneNumber());
	}
	
	/**
	 * Display address.
	 *
	 * @return the string
	 */
	public String displayAddress(){
		return(empObj.getAddress());
	}
	
	/**
	 * Display age.
	 *
	 * @return the int
	 */
	public int displayAge(){
		return(empObj.getAge());
	}
	
	public String displayDob(){
		return (empObj.getDob());
	}
	public String displayLicense(){
		return(empObj.getLicenseNum());
	}
	/**
	 * Display sex.
	 *
	 * @return the string
	 */
	public String displaySex(){
		switch(empObj.getSex()){
			case "M":
				return("Male");
		case "F":
				return("Female");
			}
		return ("Error");
		}
	
	/**
	 * Check admin.
	 *
	 * @return the boolean
	 */
	public Boolean checkAdmin(){//not sure how you're going to represent in GUI but both Check Admin/ Display ADmin do the same thing :)
		return(empObj.isAdmin());
	}
	
	/**
	 * Display admin.
	 *
	 * @return the string
	 */
	public String displayAdmin(){
		if(empObj.isAdmin())
			return("Yes");
		else
			return("NO");
	}
	
	/**
	 * Update admin.
	 *
	 * @param value the value
	 * @throws SQLException the SQL exception
	 */
	public void updateAdmin(Boolean value)throws SQLException{
		empDbObj.pushAdmin(value,empObj);
		empObj.setAdmin(value);
	}
	
	
	public void newRep(String firstName,String lastName,String phone,int hourlyRate,String address,int age,String sex,String lisNum,String dob,String username,String password,Boolean admin,int sales) throws SQLException{
		empObj=new Employee();
        empDbObj=new EmployeeDb();
        empObj.initNew(username,password,firstName,lastName,sex,dob,phone,address,age,lisNum,hourlyRate,admin,sales);
        empDbObj.registerEmployee(empObj, admin);
	}
	
}
	

