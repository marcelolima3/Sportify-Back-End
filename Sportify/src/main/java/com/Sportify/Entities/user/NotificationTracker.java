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
import com.Sportify.Views.JSONViews.user.NotificationTrackerView;
import com.fasterxml.jackson.annotation.JsonView;

import java.io.Serializable;
import java.util.HashSet;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="NotificationTracker")
public class NotificationTracker implements Serializable {
	public NotificationTracker() {
	}

	public NotificationTracker(String notificationPolicy) {
		this.notificationPolicy = notificationPolicy;
		this.ORM_notificationHistory = new HashSet();
	}

	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_NOTIFICATIONTRACKER_NOTIFICATIONHISTORY) {
			return ORM_notificationHistory;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};

	@JsonView(NotificationTrackerView.Public.class)
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="USER_NOTIFICATIONTRACKER_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="USER_NOTIFICATIONTRACKER_ID_GENERATOR", strategy="native")	
	private int ID;

	@JsonView(NotificationTrackerView.Public.class)
	@Column(name="NotificationPolicy", nullable=true, length=255)	
	private String notificationPolicy;

	@JsonView(NotificationTrackerView.Private.class)
	@ManyToMany(targetEntity= com.Sportify.Entities.event.Event.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="NotificationTracker_Event", joinColumns={ @JoinColumn(name="NotificationTrackerID") }, inverseJoinColumns={ @JoinColumn(name="EventID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_notificationHistory = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNotificationPolicy(String value) {
		this.notificationPolicy = value;
	}
	
	public String getNotificationPolicy() {
		return notificationPolicy;
	}
	
	private void setORM_NotificationHistory(java.util.Set value) {
		this.ORM_notificationHistory = value;
	}
	
	private java.util.Set getORM_NotificationHistory() {
		return ORM_notificationHistory;
	}
	
	@Transient	
	public final com.Sportify.Entities.event.EventSetCollection notificationHistory = new com.Sportify.Entities.event.EventSetCollection(this, _ormAdapter, ORMConstants.KEY_NOTIFICATIONTRACKER_NOTIFICATIONHISTORY, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
