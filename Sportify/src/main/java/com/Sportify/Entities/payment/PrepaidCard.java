/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Ricardo(Universidade do Minho)
 * License Type: Academic
 */
package com.Sportify.Entities.payment;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="PrepaidCard")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("PrepaidCard")
@PrimaryKeyJoinColumn(name="PaymentMethodID", referencedColumnName="ID")
public class PrepaidCard extends com.Sportify.Entities.payment.PaymentMethod implements Serializable {
	public PrepaidCard() {
	}
	
	@Column(name="CardNumber", nullable=false, length=20)	
	private long cardNumber;
	
	@Column(name="SecurityCode", nullable=true, length=255)	
	private String securityCode;
	
	@Column(name="ExpirationDate", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date expirationDate;
	
	@Column(name="CardType", nullable=true, length=255)	
	private String cardType;
	
	@Column(name="Balance", nullable=true, precision=19, scale=0)	
	private java.math.BigDecimal balance;
	
	@Column(name="NumRecharges", nullable=false, length=10)	
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
	
	public PrepaidCard(long cardNumber, String securityCode, java.util.Date expriationDate, String cardType, java.math.BigDecimal balance, int numRecharges) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return super.toString();
	}
	
}