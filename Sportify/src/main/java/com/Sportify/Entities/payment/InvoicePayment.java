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
import com.Sportify.Views.JSONViews.payment.InvoicePaymentView;
import com.Sportify.Views.JSONViews.payment.PaymentMethodView;
import com.Sportify.Views.JSONViews.user.UserView;
import com.fasterxml.jackson.annotation.JsonView;

import java.io.Serializable;
import java.util.HashSet;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="InvoicePayment")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("InvoicePayment")
@PrimaryKeyJoinColumn(name="PaymentMethodID", referencedColumnName="ID")
public class InvoicePayment extends com.Sportify.Entities.payment.PaymentMethod implements Serializable {
	public InvoicePayment() {
	}

	public InvoicePayment(double currentAmount) {
		super();
		this.currentAmount = currentAmount;
		this.ORM_payments = new HashSet();
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_INVOICEPAYMENT_PAYMENTS) {
			return ORM_payments;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};

	@JsonView({UserView.Public.class,PaymentMethodView.Public.class, InvoicePaymentView.Public.class})
	@Column(name="CurrentAmount", nullable=true)	
	private double currentAmount;

	@JsonView(InvoicePaymentView.Private.class)
	@OneToMany(targetEntity= com.Sportify.Entities.payment.Invoice.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="InvoicePaymentPaymentMethodID", nullable=true) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_payments = new java.util.HashSet();
	
	public void setCurrentAmount(double value) {
		this.currentAmount = value;
	}
	
	public double getCurrentAmount() {
		return currentAmount;
	}
	
	private void setORM_Payments(java.util.Set value) {
		this.ORM_payments = value;
	}
	
	private java.util.Set getORM_Payments() {
		return ORM_payments;
	}
	
	@Transient	
	public final com.Sportify.Entities.payment.InvoiceSetCollection payments = new com.Sportify.Entities.payment.InvoiceSetCollection(this, _ormAdapter, ORMConstants.KEY_INVOICEPAYMENT_PAYMENTS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}

	@Override
	public void addToBill(double price) {
		this.currentAmount += price;
	}

}
