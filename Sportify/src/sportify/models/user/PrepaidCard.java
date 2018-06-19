package sportify.models.user; /**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: tr3s(Universidade do Minho)
 * License Type: Academic
 */
public class PrepaidCard extends PaymentMethod {
	public PrepaidCard() {
	}
	
	private long cardNumber;
	
	private String securityCode;
	
	private java.util.Date expirationDate;
	
	private String cardType;
	
	private java.math.BigDecimal balance;
	
	private int numRecharges;
	
	public void setCardNumber(long value) {
		this.cardNumber = value;
	}
	
	public long getCardNumber() {
		return cardNumber;
	}
	
	public void setSecurityCode(String value) {
		this.securityCode = value;
	}
	
	public String getSecurityCode() {
		return securityCode;
	}
	
	public void setExpirationDate(java.util.Date value) {
		this.expirationDate = value;
	}
	
	public java.util.Date getExpirationDate() {
		return expirationDate;
	}
	
	public void setCardType(String value) {
		this.cardType = value;
	}
	
	public String getCardType() {
		return cardType;
	}
	
	public void setBalance(java.math.BigDecimal value) {
		this.balance = value;
	}
	
	public java.math.BigDecimal getBalance() {
		return balance;
	}
	
	public void setNumRecharges(int value) {
		this.numRecharges = value;
	}
	
	public int getNumRecharges() {
		return numRecharges;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
