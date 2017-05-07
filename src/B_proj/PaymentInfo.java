package B_proj;

public class PaymentInfo {	
	private String creditCardNum;
	private String[] provider={"Visa","Mastercard","American Express","Discover"};
	private String security;
	private String expiration;
	
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
		return security;
	}
	public void setSecurity(String security) {
		this.security = security;
	}
	public String getExpiration() {
		return expiration;
	}
	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
	
	
}
