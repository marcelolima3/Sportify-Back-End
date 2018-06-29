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
import com.Sportify.Views.JSONViews.user.UserView;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonView;

import java.io.Serializable;
import javax.persistence.*;

@JsonTypeInfo(
		use = JsonTypeInfo.Id.NAME,
		include = JsonTypeInfo.As.PROPERTY,
		property = "type")
@JsonSubTypes({
		@JsonSubTypes.Type(value = MonthlyBill.class, name = "MonthlyBill"),
		@JsonSubTypes.Type(value = InvoicePayment.class, name = "InvoicePayment"),
		@JsonSubTypes.Type(value = PrepaidCard.class, name = "PrepaidCard")
})
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="PaymentMethod")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("PaymentMethod")
public abstract class PaymentMethod implements Serializable {
	public PaymentMethod() {
	}

	@JsonView({UserView.Public.class, PaymentMethodView.Public.class})
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="PAYMENT_PAYMENTMETHOD_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PAYMENT_PAYMENTMETHOD_ID_GENERATOR", strategy="native")	
	private int ID;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
