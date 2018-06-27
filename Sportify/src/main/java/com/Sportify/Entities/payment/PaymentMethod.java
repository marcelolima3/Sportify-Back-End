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
@Table(name="PaymentMethod")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("PaymentMethod")
public abstract class PaymentMethod implements Serializable {
	public PaymentMethod() {
	}
	
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