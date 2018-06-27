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
@Table(name="MonthlyBill")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("MonthlyBill")
@PrimaryKeyJoinColumn(name="PaymentMethodID", referencedColumnName="ID")
public class MonthlyBill extends com.Sportify.Entities.payment.PaymentMethod implements Serializable {
	public MonthlyBill() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MONTHLYBILL_PAYMENTS) {
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
	
	@Column(name="LimitAmount", nullable=true, precision=19, scale=0)	
	private java.math.BigDecimal limitAmount;
	
	@Column(name="CurrentAmount", nullable=true, precision=19, scale=0)	
	private java.math.BigDecimal currentAmount;
	
	@OneToMany(targetEntity= com.Sportify.Entities.payment.Invoice.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="MonthlyBillPaymentMethodID", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_payments = new java.util.HashSet();
	
	public void setLimitAmount(java.math.BigDecimal value) {
		this.limitAmount = value;
	}
	
	public java.math.BigDecimal getLimitAmount() {
		return limitAmount;
	}
	
	public void setCurrentAmount(java.math.BigDecimal value) {
		this.currentAmount = value;
	}
	
	public java.math.BigDecimal getCurrentAmount() {
		return currentAmount;
	}
	
	private void setORM_Payments(java.util.Set value) {
		this.ORM_payments = value;
	}
	
	private java.util.Set getORM_Payments() {
		return ORM_payments;
	}
	
	@Transient	
	public final com.Sportify.Entities.payment.InvoiceSetCollection payments = new com.Sportify.Entities.payment.InvoiceSetCollection(this, _ormAdapter, ORMConstants.KEY_MONTHLYBILL_PAYMENTS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public MonthlyBill(java.math.BigDecimal limitAmount, java.math.BigDecimal currentAmount) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return super.toString();
	}
	
}
