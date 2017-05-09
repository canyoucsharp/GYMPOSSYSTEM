
package controller;

// TODO: Auto-generated Javadoc
/**
 * The Class Employee.
 */
public class Employee extends Person{
	
	/** The hourly rate. */
	int hourlyRate;
	
	/** The sales. */
	int sales;
	
	/** The username. */
	String username;
	
	/** The password. */
	String password;
	
	/** The is admin. */
	boolean isAdmin;
	
	/**
	 * Gets the hourly rate.
	 *
	 * @return the hourly rate
	 */
	public int getHourlyRate() {
		return hourlyRate;
	}
	
	/**
	 * Sets the hourly rate.
	 *
	 * @param hourlyRate the new hourly rate
	 */
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	/**
	 * Gets the sales.
	 *
	 * @return the sales
	 */
	public int getSales() {
		return sales;
	}
	
	/**
	 * Sets the sales.
	 *
	 * @param sales the new sales
	 */
	public void setSales(int sales) {
		this.sales = sales;
	}
	
	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Checks if is admin.
	 *
	 * @return true, if is admin
	 */
	public boolean isAdmin() {
		return isAdmin;
	}
	
	/**
	 * Sets the admin.
	 *
	 * @param isAdmin the new admin
	 */
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public void initNew(String username2, String password2, String firstName, String lastName, String sex, String dob, String phone, String address, int age, String lisNum, int hourlyRate2,
	Boolean admin, int sales2) {
		this.setUsername(username2);
		this.setPassword(password2);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setSex(sex);
		this.setDob(dob);
		this.setPhoneNumber(phone);
		this.setAddress(address);
		this.setAge(age);
		this.setLicenseNum(lisNum);
		this.setHourlyRate(hourlyRate2);
		this.setAdmin(admin);
		this.setSales(sales2);
	}
	
	
}
