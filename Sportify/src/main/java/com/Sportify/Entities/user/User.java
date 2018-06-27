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
package com.Sportify.Entities.user;

import com.Sportify.DAO.ORMConstants;
import com.Sportify.Entities.payment.PaymentMethod;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="`User`")
public class User implements Serializable {
	public User() {
	}

	public User(PaymentMethod paymentManager, String name, String email, String password) {
		this.paymentManager = paymentManager;
		this.name = name;
		this.email = email;
		this.password = password;
		this.ORM_subscriptions = new TreeSet<Subscription>();
		this.registrationDate = new Date();
	}

	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USER_SUBSCRIPTIONS) {
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
	@GeneratedValue(generator="USER_USER_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="USER_USER_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity= com.Sportify.Entities.payment.PaymentMethod.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="PaymentMethodID", referencedColumnName="ID", nullable=false) })	
	private com.Sportify.Entities.payment.PaymentMethod paymentManager;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@Column(name="RegistrationDate", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date registrationDate;
	
	@OneToMany(targetEntity= com.Sportify.Entities.user.Subscription.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="UserID", nullable=false) })	
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
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setRegistrationDate(java.util.Date value) {
		this.registrationDate = value;
	}
	
	public java.util.Date getRegistrationDate() {
		return registrationDate;
	}
	
	public void setPaymentManager(com.Sportify.Entities.payment.PaymentMethod value) {
		this.paymentManager = value;
	}
	
	public com.Sportify.Entities.payment.PaymentMethod getPaymentManager() {
		return paymentManager;
	}
	
	private void setORM_Subscriptions(java.util.Set value) {
		this.ORM_subscriptions = value;
	}
	
	private java.util.Set getORM_Subscriptions() {
		return ORM_subscriptions;
	}
	
	@Transient	
	public final com.Sportify.Entities.user.SubscriptionSetCollection subscriptions = new com.Sportify.Entities.user.SubscriptionSetCollection(this, _ormAdapter, ORMConstants.KEY_USER_SUBSCRIPTIONS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public User(String name, String email, String password) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public List<Subscription> getSubscriptions() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void setSubscriptions(List<Subscription> subscriptions) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
