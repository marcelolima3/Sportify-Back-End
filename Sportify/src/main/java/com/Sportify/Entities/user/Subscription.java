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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Subscription")
public class Subscription implements Serializable {
	public Subscription() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_SUBSCRIPTION_SUBSCRIBEDEVENTS) {
			return ORM_subscribedEvents;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_SUBSCRIPTION__TRACKER) {
			this._tracker = (com.Sportify.Entities.user.NotificationTracker) owner;
		}
		
		else if (key == ORMConstants.KEY_SUBSCRIPTION_SUBSCRIBEDENTITY) {
			this.subscribedEntity = (com.Sportify.Entities.subentities.SubscriptionEntity) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="USER_SUBSCRIPTION_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="USER_SUBSCRIPTION_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity= com.Sportify.Entities.user.NotificationTracker.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="NotificationTrackerID", referencedColumnName="ID", nullable=false) })	
	private com.Sportify.Entities.user.NotificationTracker _tracker;
	
	@ManyToOne(targetEntity= com.Sportify.Entities.subentities.SubscriptionEntity.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="SubscriptionEntityID", referencedColumnName="ID", nullable=false) })	
	private com.Sportify.Entities.subentities.SubscriptionEntity subscribedEntity;
	
	@Column(name="`Date`", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date date;
	
	@Column(name="Paid", nullable=true, length=1)	
	private boolean paid;
	
	@ManyToMany(targetEntity= com.Sportify.Entities.event.EventCategory.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Subscription_EventCategory", joinColumns={ @JoinColumn(name="SubscriptionID") }, inverseJoinColumns={ @JoinColumn(name="EventCategoryID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_subscribedEvents = new java.util.HashSet();
	
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
	
	public void setPaid(boolean value) {
		this.paid = value;
	}
	
	public boolean getPaid() {
		return paid;
	}
	
	public void set_tracker(com.Sportify.Entities.user.NotificationTracker value) {
		this._tracker = value;
	}
	
	public com.Sportify.Entities.user.NotificationTracker get_tracker() {
		return _tracker;
	}
	
	private void setORM_SubscribedEvents(java.util.Set value) {
		this.ORM_subscribedEvents = value;
	}
	
	private java.util.Set getORM_SubscribedEvents() {
		return ORM_subscribedEvents;
	}
	
	@Transient	
	public final com.Sportify.Entities.event.EventCategorySetCollection subscribedEvents = new com.Sportify.Entities.event.EventCategorySetCollection(this, _ormAdapter, ORMConstants.KEY_SUBSCRIPTION_SUBSCRIBEDEVENTS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setSubscribedEntity(com.Sportify.Entities.subentities.SubscriptionEntity value) {
		if (subscribedEntity != null) {
			subscribedEntity.subscriptions.remove(this);
		}
		if (value != null) {
			value.subscriptions.add(this);
		}
	}
	
	public com.Sportify.Entities.subentities.SubscriptionEntity getSubscribedEntity() {
		return subscribedEntity;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_SubscribedEntity(com.Sportify.Entities.subentities.SubscriptionEntity value) {
		this.subscribedEntity = value;
	}
	
	private com.Sportify.Entities.subentities.SubscriptionEntity getORM_SubscribedEntity() {
		return subscribedEntity;
	}
	
	public Subscription(java.util.Date date, Boolean paid) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
