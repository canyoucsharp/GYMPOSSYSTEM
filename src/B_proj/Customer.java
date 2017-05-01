package B_proj;

public class Customer extends Person {
	
	int subId;
	int repId;
	String pictureLink;
	
	
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public int getRepId() {
		return repId;
	}
	public void setRepId(int repId) {
		this.repId = repId;
	}
	public String getPictureLink() {
		return pictureLink;
	}
	public void setPictureLink(String pictureLink) {
		this.pictureLink = pictureLink;
	}
	

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