package B_proj;

public class PaymentInfo {	
	private String creditCardNum;
	private String[] provider={"Visa","Mastercard","American Express","Discover"};
	private String Security;
	private String Expiration;
	
	public String getCreditCardNum() {
		return creditCardNum;
	}
	public void setCreditCardNum(String creditCardNum) {
		this.creditCardNum = creditCardNum;
	}
	public String[] getProvider() {
		return provider;
	}
	public void setProvider(String[] provider) {
		this.provider = provider;
	}
	public String getSecurity() {
		return Security;
	}
	public void setSecurity(String security) {
		Security = security;
	}
	public String getExpiration() {
		return Expiration;
	}
	public void setExpiration(String expiration) {
		Expiration = expiration;
	}
	
	
}
