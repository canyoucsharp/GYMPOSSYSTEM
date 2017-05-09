package model;

// TODO: Auto-generated Javadoc
/**
 * The Class Customer.
 */
public class Customer extends Person {
	
	/** The new Sub. */
	private Subscription newSUb;
	
	/**
	 * Gets the new S ub.
	 *
	 * @return the new S ub
	 */
	public Subscription getNewSUb() {
		return newSUb;
	}
	
	/**
	 * Sets the new S ub.
	 *
	 * @param newSUb the new new S ub
	 */
	public void setNewSUb(Subscription newSUb) {
		this.newSUb = newSUb;
	}


	/** The sub id. */
	int subId;
	
	/** The rep id. */
	int repId;
	
	/** The picture link. */
	String pictureLink;
	
	
	/**
	 * Gets the sub id.
	 *
	 * @return the sub id
	 */
	public int getSubId() {
		return subId;
	}
	
	/**
	 * Sets the sub id.
	 *
	 * @param subId the new sub id
	 */
	public void setSubId(int subId) {
		this.subId = subId;
	}
	
	/**
	 * Gets the rep id.
	 *
	 * @return the rep id
	 */
	public int getRepId() {
		return repId;
	}
	
	/**
	 * Sets the rep id.
	 *
	 * @param repId the new rep id
	 */
	public void setRepId(int repId) {
		this.repId = repId;
	}
	
	/**
	 * Gets the picture link.
	 *
	 * @return the picture link
	 */
	public String getPictureLink() {
		return pictureLink;
	}
	
	/**
	 * Sets the picture link.
	 *
	 * @param pictureLink the new picture link
	 */
	public void setPictureLink(String pictureLink) {
		this.pictureLink = pictureLink;
	}
	

	/**
	 * Inits the new.
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
	 * @param lis_num the lis num
	 * @param id the id
	 */
	public void initNew(String firstName,String lastName,String sex,String dob,String phone,String picture,String address,int age,int repId, String lis_num, int id) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setSex(sex);
		this.setDob(dob);
		this.setPhoneNumber(phone);
		this.setPictureLink(picture);
		this.setAddress(address);
		this.setAge(age);
		this.setRepId(repId);
		this.setLicenseNum(lis_num);
		this.setId(id);
		
	}
}