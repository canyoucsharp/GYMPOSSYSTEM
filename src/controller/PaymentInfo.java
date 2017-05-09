package controller;

// TODO: Auto-generated Javadoc
/**
 * The Class PaymentInfo.
 */
public class PaymentInfo {	
	
	/** The credit card num. */
	private String creditCardNum;
	
	/** The provider key. */
	private String[] providerKey={"Visa","Mastercard","American Express","Discover"};
	
	/** The provider. */
	private int provider;
	
	/** The security. */
	private String security;
	
	/** The expiration. */
	private String expiration;
	
	/**
	 * Gets the credit card num.
	 *
	 * @return the credit card num
	 */
	public String getCreditCardNum() {
		return creditCardNum;
	}
	
	/**
	 * Sets the credit card num.
	 *
	 * @param creditCardNum the new credit card num
	 */
	public void setCreditCardNum(String creditCardNum) {
		this.creditCardNum = creditCardNum;
	}
	
	/**
	 * Gets the provider.
	 *
	 * @return the provider
	 */
	public int getProvider() {
		return (provider);
	}
	public String getConvProvider()
	{
		return providerKey[provider];
	}
	
	/**
	 * Sets the provider.
	 *
	 * @param provider the new provider
	 */
	public void setProvider(int provider) {
		this.provider = provider;
	}
	
	/**
	 * Gets the security.
	 *
	 * @return the security
	 */
	public String getSecurity() {
		return security;
	}
	
	/**
	 * Sets the security.
	 *
	 * @param security the new security
	 */
	public void setSecurity(String security) {
		this.security = security;
	}
	
	/**
	 * Gets the expiration.
	 *
	 * @return the expiration
	 */
	public String getExpiration() {
		return expiration;
	}
	
	/**
	 * Sets the expiration.
	 *
	 * @param expiration the new expiration
	 */
	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
	
	/**
	 * Inits the.
	 *
	 * @param cardNum the card num
	 * @param provider the provider
	 * @param security the security
	 * @param expiration the expiration
	 */
	public void init(String cardNum,int provider,String security,String expiration){
		this.setCreditCardNum(cardNum);
		this.setProvider(provider);
		this.setSecurity(security);
		this.setExpiration(expiration);
	}
	
}
