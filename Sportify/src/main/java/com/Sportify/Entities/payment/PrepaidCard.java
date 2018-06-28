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

import com.Sportify.Views.JSONViews.payment.PaymentMethodView;
import com.Sportify.Views.JSONViews.payment.PrepaidCardView;
import com.Sportify.Views.JSONViews.user.UserView;
import com.fasterxml.jackson.annotation.JsonView;

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

	@JsonView({UserView.Public.class,PaymentMethodView.Public.class, PrepaidCardView.Public.class})
	@Column(name="CardNumber", nullable=false, length=20)	
	private long cardNumber;

	@JsonView({UserView.Public.class,PaymentMethodView.Public.class, PrepaidCardView.Public.class})
	@Column(name="SecurityCode", nullable=true, length=255)	
	private String securityCode;

	@JsonView({UserView.Public.class,PaymentMethodView.Public.class, PrepaidCardView.Public.class})
	@Column(name="ExpirationDate", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date expirationDate;

	@JsonView({UserView.Public.class,PaymentMethodView.Public.class, PrepaidCardView.Public.class})
	@Column(name="CardType", nullable=true, length=255)	
	private String cardType;

	@JsonView({UserView.Public.class,PaymentMethodView.Public.class, PrepaidCardView.Public.class})
	@Column(name="Balance", nullable=true)	
	private double balance;

	@JsonView({UserView.Public.class,PaymentMethodView.Public.class, PrepaidCardView.Public.class})
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
	
	public void setBalance(double value) {
		this.balance = value;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setNumRecharges(int value) {
		this.numRecharges = value;
	}
	
	public int getNumRecharges() {
		return numRecharges;
	}
	
	public PrepaidCard(long cardNumber, String securityCode, java.util.Date expriationDate, String cardType, double balance, int numRecharges) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return super.toString();
	}
	
}
