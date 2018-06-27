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

import com.Sportify.DAO.ORMConstants;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Invoice")
public class Invoice implements Serializable {
	public Invoice() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_INVOICE_SUBSCRIPTIONS) {
			return ORM_subscriptions;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="PAYMENT_INVOICE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PAYMENT_INVOICE_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="`Date`", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date date;
	
	@Column(name="Amount", nullable=true)	
	private double amount;
	
	@OneToMany(targetEntity= com.Sportify.Entities.user.Subscription.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="InvoiceID", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_subscriptions = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setDate(java.util.Date value) {
		this.date = value;
	}
	
	public java.util.Date getDate() {
		return date;
	}
	
	public void setAmount(double value) {
		this.amount = value;
	}
	
	public double getAmount() {
		return amount;
	}
	
	private void setORM_Subscriptions(java.util.Set value) {
		this.ORM_subscriptions = value;
	}
	
	private java.util.Set getORM_Subscriptions() {
		return ORM_subscriptions;
	}
	
	@Transient	
	public final com.Sportify.Entities.user.SubscriptionSetCollection subscriptions = new com.Sportify.Entities.user.SubscriptionSetCollection(this, _ormAdapter, ORMConstants.KEY_INVOICE_SUBSCRIPTIONS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
