package B_proj;

public class PaymentInfo {	
	private String creditCardNum;
	private String[] providerKey={"Visa","Mastercard","American Express","Discover"};
	private int provider;
	private String security;
	private String expiration;
	
	public String getCreditCardNum() {
		return creditCardNum;
	}
	public void setCreditCardNum(String creditCardNum) {
		this.creditCardNum = creditCardNum;
	}
	public String getProvider() {
		return (providerKey[provider]);
	}
	public void setProvider(String[] provider) {
		this.providerKey = provider;
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
	
	public void init(String cardNum,int provider,String security,String expiration){
		this.creditCardNum=cardNum;
		this.provider=provider;
		this.security=security;
		this.expiration=expiration;
	}
	
}
